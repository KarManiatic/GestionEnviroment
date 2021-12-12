package dominio;

import java.sql.SQLException;
import java.util.Vector;

import persistencia.Agente;

public class Cliente extends Usuario {

	private double saldo;
	private long numTarjeta;
	private Inventario inventario;
	
	public Cliente(String mLogin, String mPassword, String dni, String nombre, String apellido, long numTarjeta) throws Exception, SQLException {
		super(mLogin, mPassword, dni, nombre, apellido);
		this.numTarjeta = numTarjeta;
		this.saldo = 0;
		//Creación de un inventario personal, cuyo indentificativo, es el dni del usuario, que es único
		inventario = new Inventario (dni);
	}
		
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public long getNumTarjeta() {
		return numTarjeta;
	}
	
	public static Cliente read(String login, String password) throws Exception {
		
		boolean check;
		Vector<Object> aux = null;
		Vector<Object> vectoradevolver = Agente.getAgente().select("SELECT * FROM `usuarios"+login+"` WHERE `dni` = '"+login+"';");  //Meter el password
		Cliente c = null;
		
		aux = new Vector<Object>();
		if (vectoradevolver.size() == 1){
			aux = (Vector<Object>) vectoradevolver.elementAt(0);
			c = new Cliente((String) aux.elementAt(0), (String) aux.elementAt(1), (String) aux.elementAt(2), (String) aux.elementAt(3), (String) aux.elementAt(4), (long) aux.elementAt(5));
		}
		
		return c;
	}
	
	public static int insert(String login, String password, String dni, String nombre, String apellido, long numTarjeta) throws Exception,SQLException {
		int check;
		check = Agente.getAgente().insert("INSERT INTO `gestionenviromentdb`.`usuarios`(`mLogin`,`mPassword`,`dni`,`nombre`,`apellido`) VALUES('"+login+"','"+password+"','"+dni+"','"+nombre+"','"+apellido+"');");
		return check;
	}
	
	public static int delete(String login, String password, String dni) throws Exception {
		int check;
		check = Agente.getAgente().insert("DELETE..."); //Completar, que me da palo
		return check;
	}
	
	//Es solo para implementar de la encapsulación
	public Producto leerProductoInventarioPersonal(int id) throws Exception {
		return inventario.readProducto(id);
	}

	public int nProductosInventario() {
		return inventario.getnProductos();
	}
	
}
