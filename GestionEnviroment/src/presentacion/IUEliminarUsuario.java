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
	private JTextPane textPane;

	public IUEliminarUsuario() {
		setTitle("Eliminar usuario registrado");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 438, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		ImageIcon img = new ImageIcon("tienda.jpg");
		setIconImage(img.getImage());
		
		JLabel lbl1 = new JLabel("Introduzca el nombre de usuario y la contraseña");
		lbl1.setForeground(Color.ORANGE);
		lbl1.setBounds(80, 10, 386, 43);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("de la cuenta que desees eliminar");
		lbl2.setForeground(Color.ORANGE);
		lbl2.setBounds(125, 30, 386, 43);
		contentPane.add(lbl2);

		JLabel lblPass = new JLabel("Password:");
		lblPass.setBounds(6, 135, 69, 16);
		lblPass.setForeground(Color.ORANGE);
		contentPane.add(lblPass);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setForeground(Color.ORANGE);
		lblLogin.setBounds(6, 85, 69, 16);
		contentPane.add(lblLogin);

		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(87, 85, 134, 28);
		contentPane.add(textFieldLogin);
		textFieldLogin.setColumns(10);

		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(87, 135, 134, 28);
		contentPane.add(textFieldPassword);

		JButton btnAltaUsuario = new JButton("Eliminar Cuenta");
		btnAltaUsuario.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
					IUPreguntaSeguridad iuPregunta = new IUPreguntaSeguridad(textPane, textFieldLogin, textFieldPassword);
					iuPregunta.setVisible(true);
			}
		});
		btnAltaUsuario.setBounds(253, 85, 141, 29);
		contentPane.add(btnAltaUsuario);

		JLabel label_1 = new JLabel("Estado");
		label_1.setForeground(new Color(0,200,0));
		label_1.setBounds(6, 255, 61, 16);
		contentPane.add(label_1);

		textPane = new JTextPane();
		textPane.setToolTipText(
				"Panel para mostrar el restultado de la comprobaci\u00F3n de login o las excepciones lanzadas");
		textPane.setEditable(false);
		textPane.setBounds(8, 280, 406, 50);
		contentPane.add(textPane);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 450, 385);
		lblFondo.setIcon(new ImageIcon("fondo.jpg"));
		contentPane.add(lblFondo);
	}
	
}
