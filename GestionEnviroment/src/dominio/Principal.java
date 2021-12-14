package dominio;

import persistencia.Agente;

public class Principal {

	public static void main(String [] args) throws Exception {
		
		boolean check = false;
		long tarjeta = 0123455;
		//GestorUsuario.nuevoCliente("Vortegag", "12345", "0629889", "V", "O", tarjeta);
		
		check = GestorCompras.compraSaldo(00, "Vortegag", "12345");
		
		if(check)
		System.out.println("Perfe");
		
		/*for(int i=0; i<v.size(); i++){
            System.out.print(v.elementAt(i)+"\t");
        }*/
		
	}
	
	public static void insertar() throws Exception {
		Agente a = null;
		a = Agente.getAgente();
		
		a.insert("INSERT INTO `pruebabd`.`productos` (`nombre`, `id`, `precio`) VALUES ('prueba56', '23', '56');\r\n"+ "");
	}

}

 
