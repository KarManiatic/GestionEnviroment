package dominio;

import java.util.Vector;

import persistencia.Agente;

public abstract class Usuario {
	
	private String mLogin;
	private String mPassword;
	
	//Constructor para la creaci—n de un objeto Usuario vacio
	public Usuario(){
		this.mLogin = null;
		this.mPassword = null;
	}
		
		//Constructor para la creaci—n de un Usuario
	public Usuario(String login, String password){
		this.mLogin = login;
		this.mPassword = password;
	}
		
	
	public String getmLogin() {
		return mLogin;
	}

	public void setmLogin(String mLogin) {
		this.mLogin = mLogin;
	}

	public String getmPassword() {
		return mPassword;
	}

	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}
}
