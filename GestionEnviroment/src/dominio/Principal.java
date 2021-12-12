package dominio;

import persistencia.Agente;
import java.util.Vector;

public class Principal {

	public static void main(String [] args) throws Exception {
		
		//Cliente c1 = new Cliente("patata", "123", "06298896R", "Carlos", "Romero", (long) 25);
		
		//Cliente c1 = new Cliente("KarManiatic", "12345", "06298896R", "Carlos", "Romero", 4653215);
		
		//c1.insert("KarManiatic", "12345", "06298896R", "Carlos", "Romero", 4653215);
		
		//Con esto puedo sacar los datos, haciendo un vector y leyendolo, cada línea es un elemento.
		Vector<Object> v = Cliente.read("KarManiatic", "12345"); 
		
		for(int i=0; i<v.size(); i++){
            System.out.print(v.elementAt(i)+"\t");
        }
		
	}
	
	public static void insertar() throws Exception {
		Agente a = null;
		a = Agente.getAgente();
		
		a.insert("INSERT INTO `pruebabd`.`productos` (`nombre`, `id`, `precio`) VALUES ('prueba56', '23', '56');\r\n"+ "");
	}

}

 
