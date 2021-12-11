package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.GestorUsuario;

import javax.swing.JLabel;
import javax.swing.JTextField;
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
		setTitle("Dar de alta a un nuevo usuario");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 440, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("Password:");
		lblLogin.setBounds(30, 60, 70, 16);
		contentPane.add(lblLogin);

		JLabel label = new JLabel("Login:");
		label.setBounds(40, 10, 70, 16);
		contentPane.add(label);
		
		JLabel labelTarjeta = new JLabel("Número de Tarjeta:");
		labelTarjeta.setBounds(6, 110, 120, 16);
		contentPane.add(labelTarjeta);

		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(130, 4, 134, 28);
		contentPane.add(textFieldLogin);
		textFieldLogin.setColumns(10);

		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(130, 55, 134, 28);
		contentPane.add(textFieldPassword);
		
		textFieldTarjeta = new JTextField();
		textFieldTarjeta.setColumns(10);
		textFieldTarjeta.setBounds(130, 105, 134, 28);
		contentPane.add(textFieldTarjeta);

		JButton btnAltaUsuario = new JButton("Alta usuario");
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
		btnAltaUsuario.setBounds(300, 55, 117, 29);
		contentPane.add(btnAltaUsuario);

		JLabel label_1 = new JLabel("Estado");
		label_1.setForeground(Color.RED);
		label_1.setBounds(6, 150, 61, 16);
		contentPane.add(label_1);

		textPane = new JTextPane();
		textPane.setToolTipText(
				"Panel para mostrar el restultado de la comprobaci\u00F3n de login o las excepciones lanzadas");
		textPane.setEditable(false);
		textPane.setBounds(6, 170, 407, 187);
		contentPane.add(textPane);
	}
}

