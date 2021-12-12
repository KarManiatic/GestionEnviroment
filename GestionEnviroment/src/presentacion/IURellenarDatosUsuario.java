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
		setBounds(100, 100, 480, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		ImageIcon img = new ImageIcon("tienda.png");
		setIconImage(img.getImage());
		
		JLabel lbl1 = new JLabel("Introduzca los siguientes datos para completar el perfil");
		lbl1.setForeground(Color.ORANGE);
		lbl1.setBounds(10, 50, 386, 43);
		contentPane.add(lbl1);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(50, 245, 70, 16);
		lblApellido.setForeground(Color.ORANGE);
		contentPane.add(lblApellido);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(290, 150, 70, 16);
		lblNombre.setForeground(Color.ORANGE);
		contentPane.add(lblNombre);
		
		JLabel lblTarjeta = new JLabel("Tarjeta de Crédito");
		lblTarjeta.setBounds(290, 250, 120, 16);
		lblTarjeta.setForeground(Color.ORANGE);
		contentPane.add(lblTarjeta);
		
		JLabel lblDni = new JLabel("Dni");
		lblDni.setBounds(50, 150, 70, 16);
		lblDni.setForeground(Color.ORANGE);
		contentPane.add(lblDni);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(315, 185, 125, 28);
		textFieldNombre.setForeground(Color.WHITE);
		//textFieldNombre.setBorder(null);
		textFieldNombre.setBackground(new Color(0,0,0,0));
		textFieldNombre.setOpaque(false);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldDni = new JTextField();
		textFieldDni.setBounds(75, 185, 125, 28);
		textFieldDni.setForeground(Color.WHITE);
		//textFieldDni.setBorder(null);
		textFieldDni.setBackground(new Color(0,0,0,0));
		textFieldDni.setOpaque(false);
		contentPane.add(textFieldDni);
		textFieldDni.setColumns(10);

		textFieldApellido = new JTextField();
		textFieldApellido.setColumns(10);
		textFieldApellido.setForeground(Color.WHITE);
		//textFieldApellido.setBorder(null);
		textFieldApellido.setBackground(new Color(0,0,0,0));
		textFieldApellido.setOpaque(false);
		textFieldApellido.setBounds(75, 280, 125, 28);
		contentPane.add(textFieldApellido);
		
		textFieldTarjeta = new JTextField();
		textFieldTarjeta.setColumns(10);
		textFieldTarjeta.setForeground(Color.WHITE);
		//textFieldTarjeta.setBorder(null);
		textFieldTarjeta.setBackground(new Color(0,0,0,0));
		textFieldTarjeta.setOpaque(false);
		textFieldTarjeta.setBounds(315, 280, 125, 28);
		contentPane.add(textFieldTarjeta);
		
		JLabel cuadroTexto2 = new JLabel();
		cuadroTexto2.setIcon(new ImageIcon("cuadroTexto.png"));
		cuadroTexto2.setBounds(10, 135, 210, 100);
		contentPane.add(cuadroTexto2);
		
		JLabel cuadroTexto3 = new JLabel();
		cuadroTexto3.setIcon(new ImageIcon("cuadroTexto.png"));
		cuadroTexto3.setBounds(10, 230, 210, 100);
		contentPane.add(cuadroTexto3);
		
		JLabel cuadroTexto4 = new JLabel();
		cuadroTexto4.setIcon(new ImageIcon("cuadroTexto.png"));
		cuadroTexto4.setBounds(250, 135, 210, 100);
		contentPane.add(cuadroTexto4);
		
		JLabel cuadroTexto5 = new JLabel();
		cuadroTexto5.setIcon(new ImageIcon("cuadroTexto.png"));
		cuadroTexto5.setBounds(250, 230, 210, 100);
		contentPane.add(cuadroTexto5);

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
		btnAltaUsuario.setBounds(350, 55, 117, 29);
		btnAltaUsuario.setBorderPainted(false);
		btnAltaUsuario.setBackground(new Color(0,0,0,0));
		btnAltaUsuario.setOpaque(false);
		contentPane.add(btnAltaUsuario);
		
		JLabel morado = new JLabel();
		morado.setIcon(new ImageIcon("botonMorado.png"));
		morado.setBounds(342, 55, 160, 29);
		contentPane.add(morado);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setBounds(0, 0, 465, 385);
		lblFondo.setIcon(new ImageIcon("fondo.jpg"));
		contentPane.add(lblFondo);
	}
	
}
