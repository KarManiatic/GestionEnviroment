package dominio;

public class GestorUsuario {
	
	public static boolean autenticar(String login, String password) throws Exception{
		boolean autenticado = false;
		if(Cliente.read(login, password) != null)
			autenticado = true;
		return autenticado;
	}
	
	public static boolean nuevoCliente(String login, String password, String numTarjeta) throws Exception{
		boolean insertado = false;
		Cliente u = new Cliente(login, password, numTarjeta);
		if(u.insert() ==1)
			insertado = true;
		return insertado;		
	}
	
	public static boolean borrarCliente(String login, String password) throws Exception{
		boolean eliminado = false;
		Cliente u = new Cliente(login,password);
		if(u.delete()==1) eliminado = true;
		return eliminado;
	}
	
}
