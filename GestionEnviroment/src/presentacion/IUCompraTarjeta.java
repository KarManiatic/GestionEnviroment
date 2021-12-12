package presentacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class IUCompraTarjeta extends JFrame{
	
	private JPanel contentPane;
	private JTextField textFieldTarj;
	
	public IUCompraTarjeta(JTextPane textPaneEstado) {
		setTitle("Pago Tarjeta");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 438, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		ImageIcon img = new ImageIcon("tienda.png");
		setIconImage(img.getImage());
		
		JLabel lblTarj1 = new JLabel("Introduzca el número de la tarjeta de crédito");
		lblTarj1.setForeground(Color.ORANGE);
		lblTarj1.setBounds(85, 5, 386, 43);
		contentPane.add(lblTarj1);
		
		JLabel lblTarj2 = new JLabel("asociada a la cuenta");
		lblTarj2.setForeground(Color.ORANGE);
		lblTarj2.setBounds(150, 25, 386, 43);
		contentPane.add(lblTarj2);
		
		JLabel lblTarj3 = new JLabel("Tarjeta de Crédito");
		lblTarj3.setForeground(Color.ORANGE);
		lblTarj3.setBounds(35, 105, 386, 43);
		contentPane.add(lblTarj3);
		
		
		textFieldTarj = new JTextField();
		textFieldTarj.setColumns(10);
		textFieldTarj.setForeground(Color.WHITE);
		textFieldTarj.setBounds(75, 150, 125, 28);
		//textFieldTarj.setBorder(null);
		textFieldTarj.setBackground(new Color(0,0,0,0));
		textFieldTarj.setOpaque(false);
		contentPane.add(textFieldTarj);
		
		JLabel cuadroTexto1 = new JLabel();
		cuadroTexto1.setIcon(new ImageIcon("cuadroTexto.png"));
		cuadroTexto1.setBounds(10, 100, 210, 100);
		contentPane.add(cuadroTexto1);
		
		JButton buttonAceptar = new JButton("Comprar");
		buttonAceptar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				textPaneEstado.setText("Compra mal");
				dispose();
			}
		});
		buttonAceptar.setBounds(290, 150, 153, 29);
		buttonAceptar.setBorderPainted(false);
		buttonAceptar.setBackground(new Color(0,0,0,0));
		buttonAceptar.setOpaque(false);
		contentPane.add(buttonAceptar);
		
		JLabel verde = new JLabel();
		verde.setIcon(new ImageIcon("botonVerde.png"));
		verde.setBounds(300, 150, 160, 29);
		contentPane.add(verde);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 450, 385);
		lblFondo.setIcon(new ImageIcon("fondo.jpg"));
		contentPane.add(lblFondo);
	}

}
