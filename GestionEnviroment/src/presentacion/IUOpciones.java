package presentacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import dominio.GestorUsuario;

public class IUOpciones extends JFrame{

	private JPanel contentPane;
	private JTextPane textPaneEstado;

	public IUOpciones() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 438, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		ImageIcon img = new ImageIcon("tienda.png");
		setIconImage(img.getImage());

		JButton btnSi = new JButton("Mostrar Catálogo");
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSi.setBounds(40, 167, 148, 29);
		contentPane.add(btnSi);
		
		JButton btnNo = new JButton("Mostrar Inventario");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNo.setBounds(230, 167, 148, 29);
		contentPane.add(btnNo);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 450, 385);
		lblFondo.setIcon(new ImageIcon("fondo.jpg"));
		contentPane.add(lblFondo);
	}
	
}
