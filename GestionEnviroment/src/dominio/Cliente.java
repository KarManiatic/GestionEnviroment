package dominio;

public class Cliente extends Usuario {

	private double saldo;
	private Long numTarjeta;
	
	public Cliente(String mLogin, String mPassword, String dni, String nombre, String apellido, Long numTarjeta) {
		super(mLogin, mPassword, dni, nombre, apellido);
		this.numTarjeta = numTarjeta;
		this.saldo = 0;
	}

	//No estoy seguro si esto es así

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
