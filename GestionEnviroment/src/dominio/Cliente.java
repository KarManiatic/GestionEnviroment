package dominio;

import persistencia.Agente;

public class Cliente extends Usuario {

	private double saldo;
	private Long numTarjeta;
	Agente a;
	
	public Cliente(String mLogin, String mPassword, String dni, String nombre, String apellido, Long numTarjeta) throws Exception {
		super(mLogin, mPassword, dni, nombre, apellido);
		this.numTarjeta = numTarjeta;
		this.saldo = 0;
		a.getAgente().crearBaseDatosSiNoExiste("CREATE TABLE `gestionenviromentdb`.`prueba"+nombre+"` (`id` INT NOT NULL,`tipo` VARCHAR(45) NULL,`nombre` VARCHAR(45) NULL,`nuevo` TINYINT NULL,`precio` DOUBLE NULL, PRIMARY KEY (`id`))");
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
