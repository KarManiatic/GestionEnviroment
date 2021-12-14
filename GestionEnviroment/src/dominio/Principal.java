package dominio;

import persistencia.Agente;
import java.util.Vector;

public class Principal {

	public static void main(String [] args) throws Exception {
		
		boolean check = false;
		long tarjeta = 0123455;
		check = GestorUsuario.borrarCliente("KarManiatic", "12345", "06298896");
		
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

 
