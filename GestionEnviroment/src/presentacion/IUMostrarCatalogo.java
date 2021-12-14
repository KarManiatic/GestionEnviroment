package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import dominio.GestorProductos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JTextPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IUMostrarCatalogo extends JFrame{
	
	private JPanel contentPane;
	private JTextField textFieldId;
	
	public IUMostrarCatalogo(JTextPane textPaneEstado, JTextField textFieldLog, JTextField textFieldPass) {
		setTitle("Catálogo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 438, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		ImageIcon img = new ImageIcon("tienda.png");
		setIconImage(img.getImage());
		
		JLabel lblCat = new JLabel("Catálogo de la tienda"); 
		lblCat.setForeground(Color.ORANGE);
		lblCat.setBounds(150, 5, 400, 43);
		contentPane.add(lblCat);
		
		JLabel lblIntr = new JLabel("Introduce el ID del producto que quieras compar"); 
		lblIntr.setForeground(Color.ORANGE);
		lblIntr.setBounds(75, 25, 400, 43);
		contentPane.add(lblIntr);
		
		JTextArea displayStrings = new JTextArea(5, 30);
		displayStrings.setEditable(false);
		JScrollPane scrollPaneSalida = new JScrollPane(displayStrings);  
		scrollPaneSalida.setBounds(8, 75, 407, 200); 
		scrollPaneSalida.setEnabled(true);
		contentPane.add(scrollPaneSalida);
		
		try {
			String[]inventario = GestorProductos.mostrarCatalogo();
		    for(int i = 0; i < inventario.length; i++){
		        displayStrings.append(inventario[i]+"\n");
		    }
		}
		catch(Exception e) {
			textPaneEstado.setText("Ha ocurrido un error. Imposible mostrar inventario");
			dispose();
		}
		
		JLabel lblId = new JLabel("ID"); 
		lblId.setForeground(Color.ORANGE);
		lblId.setBounds(50, 275, 400, 43);
		contentPane.add(lblId);
		
		textFieldId = new JTextField();
		textFieldId.setColumns(10);
		textFieldId.setForeground(Color.WHITE);
		textFieldId.setBounds(75, 325, 125, 28);
		//textFieldId.setBorder(null);
		textFieldId.setBackground(new Color(0,0,0,0));
		textFieldId.setOpaque(false);
		contentPane.add(textFieldId);
		
		JLabel cuadroTexto1 = new JLabel();
		cuadroTexto1.setIcon(new ImageIcon("cuadroTexto.png"));
		cuadroTexto1.setBounds(10, 275, 210, 100);
		contentPane.add(cuadroTexto1);
		
		JButton buttonAceptar = new JButton("Comprar");
		buttonAceptar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				IUOpcionesCompra compra = new IUOpcionesCompra(textPaneEstado, textFieldLog, textFieldPass, textFieldId);
				compra.setVisible(true);
				dispose();
			}
		});
		buttonAceptar.setBounds(290, 325, 153, 29);
		buttonAceptar.setBorderPainted(false);
		buttonAceptar.setBackground(new Color(0,0,0,0));
		buttonAceptar.setOpaque(false);
		contentPane.add(buttonAceptar);
		
		JLabel verde = new JLabel();
		verde.setIcon(new ImageIcon("botonVerde.png"));
		verde.setBounds(300, 325, 160, 29);
		contentPane.add(verde);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 450, 385);
		lblFondo.setIcon(new ImageIcon("fondo.jpg"));
		contentPane.add(lblFondo);
	}

}
