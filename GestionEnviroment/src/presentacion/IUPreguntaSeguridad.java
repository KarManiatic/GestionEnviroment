package presentacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import dominio.GestorUsuario;

public class IUPreguntaSeguridad extends JFrame{
	
	private JPanel contentPane;

	public IUPreguntaSeguridad(JTextPane textPane, JTextField textFieldPassword, JTextField textFieldLogin, JTextField textFieldDni) {
		setTitle("¿Seguro de lo que quieres hacer?");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 420, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		ImageIcon img = new ImageIcon("tienda.png");
		setIconImage(img.getImage());
		
		JLabel lblP1 = new JLabel("¿Seguro que desea eliminar la cuenta?");
		lblP1.setBounds(90, 35, 250, 16);
		contentPane.add(lblP1);
		
		JLabel lblP2 = new JLabel("PERDERÁ TODOS SUS DATOS");
		lblP2.setForeground(Color.RED);
		lblP2.setBounds(115, 60, 200, 16);
		contentPane.add(lblP2);

		JButton btnSi = new JButton("Sí");
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(GestorUsuario.borrarCliente(textFieldLogin.getText(), textFieldPassword.getText(), textFieldDni.getText()) == true) {
						textPane.setText("Cuenta eliminado correctamente");
						dispose();
					}

					else {
						textPane.setText("Datos introducidos no se corresponden con los de ninguna cuenta");
						dispose();
					}
				}
				catch(Exception e) {
					dispose();
					textPane.setText("Error, no se ha podido borrar la cuenta. Tal vez no exista");
				}
				
			}
		});
		btnSi.setBounds(40, 167, 148, 29);
		contentPane.add(btnSi);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Decidiste no eliminar la cuenta. La cuenta no ha sido borrada");
				dispose();
			}
		});
		btnNo.setBounds(220, 167, 148, 29);
		contentPane.add(btnNo);
		
		JLabel lblExclamacion = new JLabel("");
		lblExclamacion.setBounds(163, 85, 100, 73);
		lblExclamacion.setIcon(new ImageIcon("exclamacion.png"));
		contentPane.add(lblExclamacion);
		
	}
}
