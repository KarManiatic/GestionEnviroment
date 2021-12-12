package dominio;

public class Cliente extends Usuario {

	private double saldo;
	private Long numTarjeta;
	private Inventario inventario;
	
	public Cliente(String mLogin, String mPassword, String dni, String nombre, String apellido, Long numTarjeta) throws Exception {
		super(mLogin, mPassword, dni, nombre, apellido);
		this.numTarjeta = numTarjeta;
		this.saldo = 0;
		
		inventario = new Inventario (nombre);
		
	}

	//No estoy seguro si esto es así

	//Cuando se crea un usuario, hay que crear una tabla personal para guardar sus productos
	public static Cliente read(String login, String password) throws Exception {
		return null;
	}

	public static int insert(String login, String password, String dni, String nombre, String apellido, Long numTarjeta) throws Exception {
		return 0;
	}

	public static int delete(String login, String password, String dni) throws Exception {
		//aqui debera borrar el cliente conectando a la base de datoos
		return 0;
	}
	
}
