package dominio;

public class GestorUsuario { //Checked, funciona todo
	
	public static boolean autenticar(String login, String password) throws Exception{ //se usa en IUTienda linea 108
		boolean autenticado = false;
		if(Cliente.read(login, password) != null)
			autenticado = true;
		return autenticado;
	}
	
	public static boolean nuevoCliente(String login, String password, String dni, String nombre, String apellido, long numTarjeta) throws Exception{
		boolean insertado = false;
		Cliente cliente = new Cliente(login, password, dni, nombre, apellido, numTarjeta);  
		if(cliente.insert(login, password, dni, nombre, apellido, 0 ,numTarjeta) == 1)
			insertado = true;
		return insertado;		
	}
	
	public static boolean borrarCliente(String login, String password, String dni) throws Exception{
		boolean eliminado = false;
		if(Cliente.delete(login, password, dni)==1) eliminado = true; //porque el metodo en cliente es estatico
		return eliminado;
	}
	
}
