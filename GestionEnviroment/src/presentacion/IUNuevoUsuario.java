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

public class IUNuevoUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLogin;
	private JTextField textFieldPassword;
	private JTextField textFieldTarjeta;
	private JTextPane textPane;

	public IUNuevoUsuario() {
		setTitle("Registro de nuevo usuario");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 438, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		ImageIcon img = new ImageIcon("tienda.jpg");
		setIconImage(img.getImage());
		
		JLabel lbl1 = new JLabel("Introduzca el nombre de usuario, la contraseña");
		lbl1.setForeground(Color.ORANGE);
		lbl1.setBounds(80, 10, 386, 43);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("y el número de la tarjeta de crédito");
		lbl2.setForeground(Color.ORANGE);
		lbl2.setBounds(115, 30, 386, 43);
		contentPane.add(lbl2);
		

		JLabel lblPass = new JLabel("Password:");
		lblPass.setBounds(30, 135, 70, 16);
		lblPass.setForeground(Color.ORANGE);
		contentPane.add(lblPass);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(40, 85, 70, 16);
		lblLogin.setForeground(Color.ORANGE);
		contentPane.add(lblLogin);
		
		JLabel lblTarjeta = new JLabel("Tarjeta de Crédito:");
		lblTarjeta.setBounds(6, 185, 120, 16);
		lblTarjeta.setForeground(Color.ORANGE);
		contentPane.add(lblTarjeta);

		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(130, 85, 134, 28);
		contentPane.add(textFieldLogin);
		textFieldLogin.setColumns(10);

		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(130, 135, 134, 28);
		contentPane.add(textFieldPassword);
		
		textFieldTarjeta = new JTextField();
		textFieldTarjeta.setColumns(10);
		textFieldTarjeta.setBounds(130, 185, 134, 28);
		contentPane.add(textFieldTarjeta);

		JButton btnAltaUsuario = new JButton("Aceptar");
		btnAltaUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (GestorUsuario.nuevoCliente(textFieldLogin.getText(), textFieldPassword.getText(), textFieldTarjeta.getText()) == true) {
						textPane.setText("Usuario creado correctamente");
					}
					else {
						textPane.setText("No se ha podido insertar el usuario");
					}

				} catch (Exception e) {
					textPane.setText("No se ha podido crear  el usuario.¿Tal vez ya existe?");
				}

			}
		});
		btnAltaUsuario.setBounds(300, 85, 117, 29);
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

