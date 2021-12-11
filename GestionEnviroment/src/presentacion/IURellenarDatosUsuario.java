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

import dominio.GestorUsuario;

public class IURellenarDatosUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDni;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldTarjeta;
	private JTextPane textPaneEstado;

	public IURellenarDatosUsuario(JTextField textFieldPass, JTextField textFieldLogin, JTextPane textPaneEstado) {
		setTitle("Registro de nuevo usuario");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 438, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		ImageIcon img = new ImageIcon("tienda.png");
		setIconImage(img.getImage());
		
		JLabel lbl1 = new JLabel("Introduzca los siguientes datos para completar el perfil");
		lbl1.setForeground(Color.ORANGE);
		lbl1.setBounds(50, 10, 386, 43);
		contentPane.add(lbl1);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(30, 155, 70, 16);
		lblApellido.setForeground(Color.ORANGE);
		contentPane.add(lblApellido);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 105, 70, 16);
		lblNombre.setForeground(Color.ORANGE);
		contentPane.add(lblNombre);
		
		JLabel lblTarjeta = new JLabel("Tarjeta de Crédito:");
		lblTarjeta.setBounds(6, 205, 120, 16);
		lblTarjeta.setForeground(Color.ORANGE);
		contentPane.add(lblTarjeta);
		
		JLabel lblDni = new JLabel("Dni:");
		lblDni.setBounds(45, 55, 70, 16);
		lblDni.setForeground(Color.ORANGE);
		contentPane.add(lblDni);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(130, 105, 134, 28);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldDni = new JTextField();
		textFieldDni.setBounds(130, 55, 134, 28);
		contentPane.add(textFieldDni);
		textFieldDni.setColumns(10);

		textFieldApellido = new JTextField();
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(130, 155, 134, 28);
		contentPane.add(textFieldApellido);
		
		textFieldTarjeta = new JTextField();
		textFieldTarjeta.setColumns(10);
		textFieldTarjeta.setBounds(130, 205, 134, 28);
		contentPane.add(textFieldTarjeta);

		JButton btnAltaUsuario = new JButton("Aceptar");
		btnAltaUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (GestorUsuario.nuevoCliente(textFieldLogin.getText(), textFieldPass.getText(), textFieldDni.getText(), textFieldNombre.getText(), textFieldApellido.getText(), Long.parseLong(textFieldTarjeta.getText())) == true) {
						textPaneEstado.setText("Usuario creado correctamente. Puede cerrar esta ventana");
						dispose();
					}
					else {
						textPaneEstado.setText("No se ha podido insertar el usuario");
						dispose();
					}

				} catch (Exception e) {
					textPaneEstado.setText("No se ha podido crear  el usuario.¿Tal vez ya existe?");
					dispose();
				}

			}
		});
		btnAltaUsuario.setBounds(300, 55, 117, 29);
		contentPane.add(btnAltaUsuario);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 450, 385);
		lblFondo.setIcon(new ImageIcon("fondo.jpg"));
		contentPane.add(lblFondo);
	}
	
}
