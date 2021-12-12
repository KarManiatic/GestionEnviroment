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
	private JTextField textFieldLog;
	private JTextField textFieldPass;
	private JTextPane textPaneEstado;
	
	public IUNuevoUsuario() {
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

		JLabel lbl1 = new JLabel("Introduzca el nombre de usuario y la contraseña");
		lbl1.setForeground(Color.ORANGE);
		lbl1.setBounds(75, 10, 386, 43);
		contentPane.add(lbl1);

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

		JButton btnAltaUsuario = new JButton("Continuar");
		btnAltaUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IURellenarDatosUsuario x = new IURellenarDatosUsuario(textFieldPass, textFieldLog, textPaneEstado);
				x.setVisible(true);
			}
		});
		btnAltaUsuario.setBounds(300, 85, 117, 29);
		btnAltaUsuario.setBorderPainted(false);
		btnAltaUsuario.setBackground(new Color(0,0,0,0));
		btnAltaUsuario.setOpaque(false);
		contentPane.add(btnAltaUsuario);
		
		JLabel morado = new JLabel();
		morado.setIcon(new ImageIcon("botonMorado.png"));
		morado.setBounds(300, 85, 160, 29);
		contentPane.add(morado);

		JLabel label_1 = new JLabel("Estado");
		label_1.setForeground(new Color(0, 200, 0));
		label_1.setBounds(6, 255, 61, 16);
		contentPane.add(label_1);

		textPaneEstado = new JTextPane();
		textPaneEstado.setToolTipText(
				"Panel para mostrar el restultado de la comprobación de login o las excepciones lanzadas");
		textPaneEstado.setBackground(new Color(0, 0, 0, 0));
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
