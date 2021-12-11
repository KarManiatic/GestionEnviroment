package persistencia;

public class Cliente extends Usuario {

	private double saldo;
	private Long numTarjeta;
	
	public Cliente(String login, String password, Long numTarjeta) {
		super(login, password);
		this.numTarjeta = numTarjeta;
		this.saldo = 0;
	}
	
	public Cliente(String login, String password) {
		super(login, password);
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
