package presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import dominio.GestorUsuario;
import persistencia.Agente;

	public class IUTienda extends JFrame {

		private JPanel contentPane;
		private JTextField textFieldLog;
		private JTextField textFieldPass;
		private JTextPane textPaneEstado;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Agente agente = Agente.getAgente();
						//agente.crearTablaDatos();
						IUTienda frame = new IUTienda();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public IUTienda() {
			setTitle("Tienda D2-G6");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 438, 385);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			setResizable(false);
			ImageIcon img = new ImageIcon("tienda.png");
			setIconImage(img.getImage());
			
/*
			ImageIcon botonRosa = new ImageIcon("botonRosa.png");
			Image botonRosa1 = botonRosa.getImage() ;  
			Image botonRosaRedi = botonRosa1.getScaledInstance(153, 29, Image.SCALE_SMOOTH ) ;  
			botonRosa = new ImageIcon(botonRosaRedi);
*/
			JLabel lblIntroduzcaElLogin = new JLabel("Introduzca el login y el password para acceder al sistema");
			lblIntroduzcaElLogin.setForeground(Color.ORANGE);
			lblIntroduzcaElLogin.setBounds(40, 5, 386, 43);
			contentPane.add(lblIntroduzcaElLogin);

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
			
			JLabel cuadroTexto2 = new JLabel();
			cuadroTexto2.setIcon(new ImageIcon("cuadroTexto.png"));
			cuadroTexto2.setBounds(10, 40, 210, 100);
			contentPane.add(cuadroTexto2);
			
			JLabel cuadroTexto1 = new JLabel();
			cuadroTexto1.setIcon(new ImageIcon("cuadroTexto.png"));
			cuadroTexto1.setBounds(10, 146, 210, 100);
			contentPane.add(cuadroTexto1);

			JButton buttonAceptar = new JButton("Aceptar");
			buttonAceptar.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent arg0) {
					try {
						if (GestorUsuario.autenticar(textFieldLog.getText(), textFieldPass.getText()) != false) {
							textPaneEstado.setText("El login ha  sido correcto");
							IUOpcionesUsuario mostrarOpciones = new IUOpcionesUsuario(textPaneEstado);
							mostrarOpciones.setVisible(true);
						} 
						else {
							textPaneEstado.setText("El login ha sido incorrecto");
						}
					} catch (Exception e) {
						textPaneEstado.setText("Ha ocurrido un error, vuelva a intentarlo" + e.toString());
					}

				}
			});
			buttonAceptar.setBounds(290, 77, 153, 29);
			buttonAceptar.setBorderPainted(false);
			buttonAceptar.setBackground(new Color(0,0,0,0));
			buttonAceptar.setOpaque(false);
			contentPane.add(buttonAceptar);
			
			JLabel verde = new JLabel();
			verde.setIcon(new ImageIcon("botonVerde.png"));
			verde.setBounds(300, 77, 160, 29);
			contentPane.add(verde);

			JLabel lblEstado = new JLabel("Estado:");
			lblEstado.setForeground(new Color(0,200,0));
			lblEstado.setBounds(6, 255, 61, 16);
			contentPane.add(lblEstado);

			textPaneEstado = new JTextPane();
			textPaneEstado.setToolTipText(
					"Panel para mostrar el restultado de la comprobación de login o las excepciones lanzadas");
			textPaneEstado.setBackground(new Color(0,0,0,0));
			textPaneEstado.setForeground(Color.WHITE);
			textPaneEstado.setOpaque(false);
			textPaneEstado.setEditable(false);
			textPaneEstado.setBounds(8, 280, 406, 50);
			contentPane.add(textPaneEstado);

			JButton buttonLimpiar = new JButton("Limpiar");
			buttonLimpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textPaneEstado.setText("");
					/*
					 * Limpiaremos el panel de salida para visualizar nuevas operaciones
					 */
				}
			});
			buttonLimpiar.setBounds(290, 117, 148, 29);
			buttonLimpiar.setBorderPainted(false);
			buttonLimpiar.setBackground(new Color(0,0,0,0));
			buttonLimpiar.setOpaque(false);
			contentPane.add(buttonLimpiar);
			
			JLabel azul = new JLabel();
			azul.setIcon(new ImageIcon("botonAzul.png"));
			azul.setBounds(300, 117, 160, 29);
			contentPane.add(azul);

			JButton btnNuevoUsuario = new JButton("Registrarse");
			btnNuevoUsuario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					IUNuevoUsuario frame = new IUNuevoUsuario();
					frame.setVisible(true);
				}
			});
			btnNuevoUsuario.setBounds(290, 157, 148, 29);
			btnNuevoUsuario.setBorderPainted(false);
			btnNuevoUsuario.setBackground(new Color(0,0,0,0));
			btnNuevoUsuario.setOpaque(false);
			contentPane.add(btnNuevoUsuario);
			
			JLabel morado = new JLabel();
			morado.setIcon(new ImageIcon("botonMorado.png"));
			morado.setBounds(300, 157, 160, 29);
			contentPane.add(morado);

			JButton btnEliminarUsuario = new JButton("Eliminar Cuenta");
			btnEliminarUsuario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					IUEliminarUsuario frame = new IUEliminarUsuario();
					frame.setVisible(true);
				}
			});
			btnEliminarUsuario.setBounds(290, 197, 148, 28);
			btnEliminarUsuario.setBorderPainted(false);
			btnEliminarUsuario.setBackground(new Color(0,0,0,0));
			btnEliminarUsuario.setOpaque(false);
			contentPane.add(btnEliminarUsuario);
			
			JLabel rojo = new JLabel();
			rojo.setIcon(new ImageIcon("botonRojo.png"));
			rojo.setBounds(300, 197, 160, 29);
			contentPane.add(rojo);
			
			JLabel lblFondo = new JLabel("");
			lblFondo.setBounds(0, 0, 450, 385);
			lblFondo.setIcon(new ImageIcon("fondo.jpg"));
			contentPane.add(lblFondo);

			/*
			 * JScrollPane scrollPaneSalida = new JScrollPane(); scrollPaneSalida.
			 * setToolTipText("Este panel mostrar\u00E1 el resultado de la consulta, las excepciones o cualquier otro resultado"
			 * ); scrollPaneSalida.setBounds(6, 193, 407, 108); scrollPaneSalida.
			 * contentPane.add(scrollPaneSalida);
			 */
		}

}

