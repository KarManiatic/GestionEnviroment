package dominio;

import persistencia.Agente;

public class Principal {

	public static void main(String [] args) throws Exception {
		Producto p1 = new Producto("01", 42);
		Producto p2 = new Producto ("02", 56);
	
		Agente a = null;
		a = Agente.getAgente();
		
		a.insert("INSERT INTO `pruebabd`.`productos` (`nombre`, `id`, `precio`) VALUES ('prueba56', '23', '56');\r\n"+ "");
		
	}
	
	public static void insertar() throws Exception {
		Agente a = null;
		a = Agente.getAgente();
		
		a.insert("INSERT INTO `pruebabd`.`productos` (`nombre`, `id`, `precio`) VALUES ('prueba56', '23', '56');\r\n"+ "");
	}

}

 
