package persistencia;

import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Agente {
	// instancia del agente
	protected static Agente mInstancia = null;
	// Conexion con la base de datos
	protected static Connection mBD;
	// Identificador ODBC de la base de datos
	private static String url = "jdbc:mysql://localhost:3306/pruebabd?user=root&password=IngSis21@";  //poner puerto correcto, por defecto 3306 y el nombre del esquema de la base de datos MySQL
	
	// Driver para conectar con bases de datos MySQL
	private static String driver = "com.mysql.cj.jdbc.Driver";

	// Constructor
	private Agente() throws Exception {
		conectar();

	}

	// Implementacion del patron singleton
	// Este patron de diseño permite implementar clases de las cuales
	// solo existir una instancia
	// http://es.wikipedia.org/wiki/Singleton
	public static Agente getAgente() throws Exception {
		if (mInstancia == null) {
			mInstancia = new Agente();
		}
		return mInstancia;
	}

	// Metodo para realizar la conexion a la base de datos
	private void conectar() throws Exception {
		Class.forName(driver);
		mBD = DriverManager.getConnection(url, "root","IngSof21@"); //poner usuario y contraseña 
	}

	// Metodo para desconectar de la base de datos
	public void desconectar() throws Exception {
		mBD.close();
	}

	// Metodo para realizar una insercion en la base de datos
	public int insert(String SQL) throws SQLException, Exception {
		conectar();
		PreparedStatement stmt = mBD.prepareStatement(SQL);
		int res = stmt.executeUpdate();
		stmt.close();
		desconectar();
		return res;
	} 

	// Metodo para realizar una eliminacion en la base de datos
	public int delete(String SQL) throws SQLException, Exception {
		PreparedStatement stmt = mBD.prepareStatement(SQL);
		int res = stmt.executeUpdate();
		stmt.close();
		desconectar();
		return res;
	}

	// Metodo para realizar una eliminacion en la base de datos
	public int update(String SQL) throws SQLException, Exception {
		conectar();
		PreparedStatement stmt = mBD.prepareStatement(SQL);
		int res = stmt.executeUpdate();
		stmt.close();
		desconectar();
		return res;
	}

	public Vector<Object> select(String SQL) throws SQLException, Exception {
		/*
		 * Metodo para realizar una busqueda o seleccion de informacion enla base de
		 * datos El método select develve un vector de vectores, donde cada uno de los
		 * vectores que contiene el vector principal representa los registros que se
		 * recuperan de la base de datos.
		 */

		Vector<Object> vectoradevolver = new Vector<Object>();
		conectar();
		Statement stmt = mBD.createStatement();
		ResultSet res = stmt.executeQuery(SQL);
		ResultSetMetaData rsmd = res.getMetaData();
		int numCol = rsmd.getColumnCount();
		
		
		while (res.next()) {
			Vector<Object> v = new Vector<Object>();
			
			//nuevo
			for (int i=1; i<=numCol; i++) { 
			v.add(res.getObject(i));
			}
			vectoradevolver.add(v);
		}
		stmt.close();
		desconectar();
		return vectoradevolver;

	}
	
	public void crearBaseDatosSiNoExiste(String SQL) throws Exception {
		conectar();
		PreparedStatement stmt = mBD.prepareStatement(SQL);
		stmt.executeUpdate();
		stmt.close();
		desconectar();
				
	}
}