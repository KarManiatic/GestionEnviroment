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
		//No siempre se crea, tenemos que ver si ya existe, en caso contrario, no se crea, simplemente se usa
		inventario = new Inventario (dni);
	}
	
	public Cliente(String mLogin, String mPassword, String dni, String nombre, String apellido, double saldo, long numTarjeta, Inventario inventario) {
		super(mLogin, mPassword, dni, nombre, apellido);
		this.numTarjeta = numTarjeta;
		this.saldo = saldo;
		this.inventario = inventario;
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
	
	@SuppressWarnings("unchecked")
	public static Cliente read(String login, String password) throws Exception {
		
		Vector<Object> aux = null;
		Vector<Object> vectoradevolver = Agente.getAgente().select("SELECT * FROM `usuarios` WHERE `mLogin` = '"+login+"' AND `mPassword` = '"+password+"';"  );  //Meter el password
		Inventario i = null;
		Cliente c = null;
		
		aux = new Vector<Object>();
		if (vectoradevolver.size() == 1){
			aux = (Vector<Object>) vectoradevolver.elementAt(0);
			i = new Inventario ((String) aux.elementAt(2));
			c = new Cliente((String) aux.elementAt(0), (String) aux.elementAt(1), (String) aux.elementAt(2), (String) aux.elementAt(3), (String) aux.elementAt(4), (double)aux.elementAt(5), (long) aux.elementAt(6), i);
		}
		
		return c;
	}
	
	public int insert(String login, String password, String dni, String nombre, String apellido, double saldo, long numTarjeta) throws Exception, SQLException {
		int check;
		check = Agente.getAgente().insert("INSERT INTO `gestionenviromentdb`.`usuarios`(`mLogin`,`mPassword`,`dni`,`nombre`,`apellido`,`saldo`,`numTarjeta`) VALUES('"+login+"','"+password+"','"+dni+"','"+nombre+"','"+apellido+"','"+saldo+"','"+numTarjeta+"');");
		return check;
	}
	
	public static int delete(String login, String password, String dni) throws Exception {
		int check;
		check = Agente.getAgente().delete("DELETE FROM `gestionenviromentdb`.`usuarios` WHERE `mLogin` = '"+login+"' AND `mPassword` = '"+password+"' AND `dni` = '"+dni+"';"); 
		return check;
	}
	
	public static int actualizarSaldo(String dni, double saldo) throws SQLException, Exception {
		int check;
		check = Agente.getAgente().update("UPDATE `gestionenviromentdb`.`usuarios` SET `saldo` = '"+saldo+"', WHERE `dni` = '"+dni+"';");
		return check;
	}
	
	public Producto leerProductoInventarioPersonal(int id) throws Exception {
		return inventario.readProducto(id);
	}

	public int nProductosInventario() {
		return inventario.getnProductos();
	}
	
	public boolean pagoSaldo(double pago) throws SQLException, Exception {
		boolean check = false;
		if (saldo >= pago) {
			saldo = saldo-pago;
			check = true;
		}
		//Cliente.actualizarSaldo(dni, saldo);
		return check;
	}
	
	public boolean pagoTarjeta(long numTarjetaEntrante) {
		boolean check = false;
		if(numTarjeta == numTarjetaEntrante)
			check = true;
		return check;
	}
	
	public void añadirProductoInventario(Producto producto) throws Exception  {
		inventario.addProducto(producto);	
	}

	public String toString() {
		return "Cliente [mLogin=" + mLogin + ", mPassword=" + mPassword + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido+ ", saldo=" + saldo + ", numTarjeta=" + numTarjeta +".]";
	}
	
}
