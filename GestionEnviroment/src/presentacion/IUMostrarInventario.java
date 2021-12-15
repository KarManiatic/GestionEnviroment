package presentacion;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import dominio.GestorProductos;

public class IUMostrarInventario extends JFrame{
	
	private JPanel contentPane;
	
	public IUMostrarInventario(JTextPane textPaneEstadoIUTienda, JTextField login, JTextField pass) {
		setTitle("Inventario");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 438, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		ImageIcon img = new ImageIcon("tienda.png");
		setIconImage(img.getImage());
		
		JLabel lblCat = new JLabel("Este es su inventario"); 
		lblCat.setForeground(Color.ORANGE);
		lblCat.setBounds(150, 5, 400, 43);
		contentPane.add(lblCat);
		
		JLabel lblIntr = new JLabel("Aquí puede ver todo lo que ha comprado"); 
		lblIntr.setForeground(Color.ORANGE);
		lblIntr.setBounds(90, 25, 400, 43);
		contentPane.add(lblIntr);
		
		JTextArea displayStrings = new JTextArea(5, 30);
		displayStrings.setEditable(false);
		JScrollPane scrollPaneSalida = new JScrollPane(displayStrings);  
		scrollPaneSalida.setBounds(8, 75, 407, 250); 
		scrollPaneSalida.setEnabled(true);
		contentPane.add(scrollPaneSalida);
		
		try {
			String[]inventario = GestorProductos.mostrarInventario(login.getText(),pass.getText());
		    for(int i = 0; i < inventario.length; i++){
		        displayStrings.append(inventario[i]+"\n");
		    }
		}
		catch(Exception e) {
			textPaneEstadoIUTienda.setText("Ha ocurrido un error. Imposible mostrar inventario");
			dispose();
		}
		
		
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 450, 385);
		lblFondo.setIcon(new ImageIcon("fondo.jpg"));
		contentPane.add(lblFondo);
	}

}
