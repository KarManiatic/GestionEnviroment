package dominio;

import java.sql.SQLException;

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

	//No estoy seguro si esto es así
	
	public static Cliente read(String login, String password) throws Exception {
		return Cliente io;
	}
	
	public int insert(String login, String password, String dni, String nombre, String apellido, long numTarjeta) throws Exception,SQLException {
		Agente.getAgente().insert("INSERT INTO `gestionenviromentdb`.`usuarios`(`mLogin`,`mPassword`,`dni`,`nombre`,`apellido`) VALUES('"+login+"','"+password+"','"+dni+"','"+nombre+"','"+apellido+"');");
		//Expulsar el 1 o el 0 dependiendo de si ha podido introducir o no
		return 0;
	}

	public static int delete(String login, String password, String dni) throws Exception {
		//aqui debera borrar el cliente conectando a la base de datoos
		return 0;
	}
	
}
