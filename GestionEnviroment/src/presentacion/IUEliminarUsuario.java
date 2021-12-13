package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JTextPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IUEliminarUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLog;
	private JTextField textFieldPass;
	private JTextField textFieldDni;
	private JTextPane textPaneEstado;

	public IUEliminarUsuario() {
		setTitle("Eliminar usuario registrado");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 480, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		ImageIcon img = new ImageIcon("tienda.png");
		setIconImage(img.getImage());
		
		JLabel lbl1 = new JLabel("Introduzca los siguientes datos de la cuenta que desees eliminar");
		lbl1.setForeground(Color.ORANGE);
		lbl1.setBounds(40, 5, 386, 43);
		contentPane.add(lbl1);

		
		JLabel lblDni = new JLabel("Dni");
		lblDni.setBounds(290, 100, 120, 16);
		lblDni.setForeground(Color.ORANGE);
		contentPane.add(lblDni);
		
		textFieldDni = new JTextField();
		textFieldDni.setBounds(87, 55, 134, 28);
		textFieldDni.setForeground(Color.WHITE);
		textFieldDni.setBounds(315, 136, 125, 28);
		//textFieldDni.setBorder(null);
		textFieldDni.setBackground(new Color(0,0,0,0));
		textFieldDni.setOpaque(false);
		contentPane.add(textFieldDni);
		textFieldDni.setColumns(10);
		
		textFieldLog = new JTextField();
		textFieldLog.setBounds(75, 90, 125, 28);
		textFieldLog.setForeground(Color.WHITE);
		//textFieldLog.setBorder(null);
		textFieldLog.setBackground(new Color(0,0,0,0));
		textFieldLog.setOpaque(false);
		contentPane.add(textFieldLog);
		textFieldLog.setColumns(10);

		JLabel lblPass = new JLabel("Password");
		lblPass.setForeground(Color.ORANGE);
		lblPass.setBounds(45, 160, 65, 16);
		contentPane.add(lblPass);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.ORANGE);
		lblLogin.setBounds(45, 55, 61, 16);
		contentPane.add(lblLogin);

		textFieldPass = new JTextField();
		textFieldPass.setColumns(10);
		textFieldPass.setForeground(Color.WHITE);
		textFieldPass.setBounds(75, 196, 125, 28);
		//textFieldPass.setBorder(null);
		textFieldPass.setBackground(new Color(0,0,0,0));
		textFieldPass.setOpaque(false);
		contentPane.add(textFieldPass);
		
		JLabel cuadroTexto3 = new JLabel();
		cuadroTexto3.setIcon(new ImageIcon("cuadroTexto.png"));
		cuadroTexto3.setBounds(250, 86, 210, 100);
		contentPane.add(cuadroTexto3);
		
		JLabel cuadroTexto2 = new JLabel();
		cuadroTexto2.setIcon(new ImageIcon("cuadroTexto.png"));
		cuadroTexto2.setBounds(10, 40, 210, 100);
		contentPane.add(cuadroTexto2);
		
		JLabel cuadroTexto1 = new JLabel();
		cuadroTexto1.setIcon(new ImageIcon("cuadroTexto.png"));
		cuadroTexto1.setBounds(10, 146, 210, 100);
		contentPane.add(cuadroTexto1);

		JButton btnEliminarUsuario = new JButton("Eliminar Cuenta");
		btnEliminarUsuario.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
					IUPreguntaSeguridad iuPregunta = new IUPreguntaSeguridad(textPaneEstado, textFieldLog, textFieldPass, textFieldDni);
					iuPregunta.setVisible(true);
			}
		});
		btnEliminarUsuario.setBounds(346, 55, 130, 29);
		btnEliminarUsuario.setBorderPainted(false);
		btnEliminarUsuario.setBackground(new Color(0,0,0,0));
		btnEliminarUsuario.setOpaque(false);
		contentPane.add(btnEliminarUsuario);
		
		JLabel rojo = new JLabel();
		rojo.setIcon(new ImageIcon("botonRojo.png"));
		rojo.setBounds(342, 55, 160, 29);
		contentPane.add(rojo);

		JLabel label_1 = new JLabel("Estado:");
		label_1.setForeground(new Color(0,200,0));
		label_1.setBounds(6, 255, 61, 16);
		contentPane.add(label_1);

		textPaneEstado = new JTextPane();
		textPaneEstado.setToolTipText(
				"Panel para mostrar el restultado de la comprobación de login o las excepciones lanzadas");
		textPaneEstado.setBackground(new Color(0,0,0,0));
		textPaneEstado.setForeground(Color.WHITE);
		textPaneEstado.setOpaque(false);
		textPaneEstado.setEditable(false);
		textPaneEstado.setBounds(8, 280, 406, 50);
		contentPane.add(textPaneEstado);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 480, 385);
		lblFondo.setIcon(new ImageIcon("fondo.jpg"));
		contentPane.add(lblFondo);
	}
	
}
