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

		JLabel lblPass = new JLabel("Password:");
		lblPass.setBounds(30, 135, 70, 16);
		lblPass.setForeground(Color.ORANGE);
		contentPane.add(lblPass);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(40, 85, 70, 16);
		lblLogin.setForeground(Color.ORANGE);
		contentPane.add(lblLogin);

		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(130, 85, 134, 28);
		contentPane.add(textFieldLogin);
		textFieldLogin.setColumns(10);

		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(130, 135, 134, 28);
		contentPane.add(textFieldPassword);

		JButton btnAltaUsuario = new JButton("Continuar");
		btnAltaUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IURellenarDatosUsuario x = new IURellenarDatosUsuario(textFieldPassword, textFieldLogin, textPaneEstado);
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
