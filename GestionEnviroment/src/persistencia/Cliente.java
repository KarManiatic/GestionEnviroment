package persistencia;

public class Cliente extends Usuario {

	private double saldo;
	private String numTarjeta;
	
	public Cliente(String login, String password, String numTarjeta) {
		super(login, password);
		this.numTarjeta = numTarjeta;
		this.saldo = 0;
	}

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
