package dominio;

public abstract class Usuario {
	
	protected String mLogin;
	protected String mPassword;
	protected String dni;
	protected String nombre;
	protected String apellido;
	
	public Usuario(){
		this.mLogin = null;
		this.mPassword = null;
		this.dni = null;
		this.nombre = null;
		this.apellido = null;
	}

	public Usuario(String mLogin, String mPassword, String dni, String nombre, String apellido) {
			this.mLogin = mLogin;
			this.mPassword = mPassword;
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
		}
}
