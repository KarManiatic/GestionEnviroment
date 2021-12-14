package presentacion;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class IUOpcionesUsuario extends JFrame{

	private JPanel contentPane;

	public IUOpcionesUsuario(JTextPane textPaneEstadoIUTienda, JTextField textFieldLog, JTextField textFieldPass) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 438, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		ImageIcon img = new ImageIcon("tienda.png");
		setIconImage(img.getImage());

		ImageIcon tienda = new ImageIcon("tienda.png");
		Image tienda1 = tienda.getImage() ;  
		Image tiendaRedi = tienda1.getScaledInstance(150, 150, Image.SCALE_SMOOTH ) ;  
		tienda = new ImageIcon(tiendaRedi);
		
		ImageIcon mochila = new ImageIcon("mochila.png");
		Image mochila1 = mochila.getImage() ;  
		Image mochilaRedi = mochila1.getScaledInstance(150, 150, Image.SCALE_SMOOTH ) ;  
		mochila = new ImageIcon(mochilaRedi);
		
		JLabel lblMCat = new JLabel("Mostrar Catálogo");
		lblMCat.setForeground(Color.ORANGE);
		lblMCat.setBounds(65, 230, 386, 43);
		contentPane.add(lblMCat);
		
		JLabel lblMInv = new JLabel("Mostrar Inventario");
		lblMInv.setForeground(Color.ORANGE);
		lblMInv.setBounds(255, 230, 386, 43);
		contentPane.add(lblMInv);
		
		JButton btnCatalogo = new JButton(tienda);
		btnCatalogo.setBackground(new Color(0,0,0,0));
		btnCatalogo.setOpaque(false);
		btnCatalogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IUMostrarCatalogo catalogo = new IUMostrarCatalogo(textPaneEstadoIUTienda, textFieldLog, textFieldPass);
				catalogo.setVisible(true);
				dispose();
			}
		});
		btnCatalogo.setBounds(40, 80, 150, 150);
		contentPane.add(btnCatalogo);
		
		JButton btnInventario = new JButton(mochila);
		btnInventario.setBackground(new Color(0,0,0,0));
		btnInventario.setOpaque(false);
		btnInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IUMostrarInventario inventario = new IUMostrarInventario(textPaneEstadoIUTienda,textFieldLog,textFieldPass);
				inventario.setVisible(true);
				dispose();
			}
		});
		btnInventario.setBounds(230, 80, 150, 150);
		contentPane.add(btnInventario);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 450, 385);
		lblFondo.setIcon(new ImageIcon("fondo.jpg"));
		contentPane.add(lblFondo);
	}
	
}
