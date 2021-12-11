package dominio;

import persistencia.Agente;

public class Principal {

	public static void main(String [] args) throws Exception {
		
		Cliente c1 = new Cliente("patata", "123", "06298896R", "Carlos", "Romero", (long) 25);
	
		//Agente a = null;
		//a = Agente.getAgente();
		
		//a.insert("INSERT INTO `pruebabd`.`productos` (`nombre`, `id`, `precio`) VALUES ('prueba56', '23', '56');\r\n"+ "");
		
	}
	
	public static void insertar() throws Exception {
		Agente a = null;
		a = Agente.getAgente();
		
		a.insert("INSERT INTO `pruebabd`.`productos` (`nombre`, `id`, `precio`) VALUES ('prueba56', '23', '56');\r\n"+ "");
	}

}

 
