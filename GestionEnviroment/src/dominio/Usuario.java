package dominio;

import java.util.Vector;

public abstract class Usuario {
	
	private String mLogin;
	private String mPassword;
	private String dni;
	private String nombre;
	private String apellido;
	private String nick;
	
	//Constructor para la creaci—n de un objeto Usuario vacio
	public Usuario(){
		this.mLogin = null;
		this.mPassword = null;
		this.dni = null;
		this.nombre = null;
		this.apellido = null;
		this.nick = null;
	}
		
	//Constructor para la creaci—n de un Usuario

	public Usuario(String mLogin, String mPassword, String dni, String nombre, String apellido, String nick) {
			this.mLogin = mLogin;
			this.mPassword = mPassword;
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
			this.nick = nick;
		}

	
}
