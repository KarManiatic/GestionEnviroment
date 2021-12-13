package presentacion;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class IUOpcionesCompra extends JFrame {

	private JPanel contentPane;

	public IUOpcionesCompra(JTextPane textPaneEstado) {
		setTitle("Opción de compra");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 438, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		ImageIcon img = new ImageIcon("tienda.png");
		setIconImage(img.getImage());

		ImageIcon tarjeta = new ImageIcon("tarjetaCredito.png");
		Image tarjeta1 = tarjeta.getImage() ;  
		Image tarjetaRedi = tarjeta1.getScaledInstance(150, 150, Image.SCALE_SMOOTH ) ;  
		tarjeta = new ImageIcon(tarjetaRedi);
		
		ImageIcon moneda = new ImageIcon("moneda.png");
		Image moneda1 = moneda.getImage() ;  
		Image monedaRedi = moneda1.getScaledInstance(150, 150, Image.SCALE_SMOOTH ) ;  
		moneda = new ImageIcon(monedaRedi);
		
		JLabel lblTarj = new JLabel("Tarjeta de Crédito");
		lblTarj.setForeground(Color.ORANGE);
		lblTarj.setBounds(65, 230, 386, 43);
		contentPane.add(lblTarj);
		
		JLabel lblCred = new JLabel("Crédito de la tienda");
		lblCred.setForeground(Color.ORANGE);
		lblCred.setBounds(255, 230, 386, 43);
		contentPane.add(lblCred);
		
		JLabel lblMCred = new JLabel("Crédito disponible: 0.00€");
		lblMCred.setForeground(Color.ORANGE);
		lblMCred.setBounds(240, 250, 386, 43);
		contentPane.add(lblMCred);
		
		JButton btnCatalogo = new JButton(tarjeta);
		btnCatalogo.setBackground(new Color(0,0,0,0));
		btnCatalogo.setOpaque(false);
		btnCatalogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IUCompraTarjeta tarjeta = new IUCompraTarjeta(textPaneEstado);
				tarjeta.setVisible(true);
				dispose();
			}
		});
		btnCatalogo.setBounds(40, 80, 150, 150);
		contentPane.add(btnCatalogo);
		
		JButton btnInventario = new JButton(moneda);
		btnInventario.setBackground(new Color(0,0,0,0));
		btnInventario.setOpaque(false);
		btnInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPaneEstado.setText("Compra mal");
				//comprar con el credito de la tienda
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
