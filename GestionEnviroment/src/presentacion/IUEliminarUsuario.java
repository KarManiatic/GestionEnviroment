package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.GestorUsuario;

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
	private JTextField textFieldLogin;
	private JTextField textFieldPassword;
	private JTextField textFieldDni;
	private JTextPane textPaneEstado;

	public IUEliminarUsuario() {
		setTitle("Eliminar usuario registrado");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 438, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		ImageIcon img = new ImageIcon("tienda.png");
		setIconImage(img.getImage());
		
		JLabel lbl1 = new JLabel("Introduzca los siguientes datos de la cuenta que desees eliminar");
		lbl1.setForeground(Color.ORANGE);
		lbl1.setBounds(20, 10, 386, 43);
		contentPane.add(lbl1);

		JLabel lblPass = new JLabel("Password:");
		lblPass.setBounds(6, 155, 69, 16);
		lblPass.setForeground(Color.ORANGE);
		contentPane.add(lblPass);
		
		JLabel lblDni = new JLabel("Dni:");
		lblDni.setBounds(20, 55, 70, 16);
		lblDni.setForeground(Color.ORANGE);
		contentPane.add(lblDni);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setForeground(Color.ORANGE);
		lblLogin.setBounds(15, 105, 69, 16);
		contentPane.add(lblLogin);

		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(87, 105, 134, 28);
		contentPane.add(textFieldLogin);
		textFieldLogin.setColumns(10);

		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(87, 155, 134, 28);
		contentPane.add(textFieldPassword);
		
		textFieldDni = new JTextField();
		textFieldDni.setBounds(87, 55, 134, 28);
		contentPane.add(textFieldDni);
		textFieldDni.setColumns(10);

		JButton btnEliminarUsuario = new JButton("Eliminar Cuenta");
		btnEliminarUsuario.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
					IUPreguntaSeguridad iuPregunta = new IUPreguntaSeguridad(textPaneEstado, textFieldLogin, textFieldPassword, textFieldDni);
					iuPregunta.setVisible(true);
			}
		});
		btnEliminarUsuario.setBounds(290, 55, 141, 29);
		btnEliminarUsuario.setBorderPainted(false);
		btnEliminarUsuario.setBackground(new Color(0,0,0,0));
		btnEliminarUsuario.setOpaque(false);
		contentPane.add(btnEliminarUsuario);
		
		JLabel rojo = new JLabel();
		rojo.setIcon(new ImageIcon("botonRojo.png"));
		rojo.setBounds(300, 55, 160, 29);
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
		lblFondo.setBounds(0, 0, 450, 385);
		lblFondo.setIcon(new ImageIcon("fondo.jpg"));
		contentPane.add(lblFondo);
	}
	
}
