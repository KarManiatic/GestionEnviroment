package dominio;

public class Cliente extends Usuario {

	private double saldo;
	private String numTarjeta;
	
	public Cliente(String mLogin, String mPassword, String dni, String nombre, String apellido, String nick, double saldo, String numTarjeta) {
		super(mLogin, mPassword, dni, nombre, apellido, nick);
		this.numTarjeta = numTarjeta;
		this.saldo = 0;
	}

	//No estoy seguro si esto es as�

	public static Cliente read(String login, String password) throws Exception {
		return null;
	}

	public static int insert() throws Exception {
		return 0;
	}

	public static int delete() throws Exception {
		return 0;
	}
}
