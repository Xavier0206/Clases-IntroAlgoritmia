package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio04 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtDonacion;
	private JTextArea txtSalida;
	private JButton btnProcesar;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio04 frame = new Ejercicio04();
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
	public Ejercicio04() {
		setTitle("Hospital");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Ingrese la Donaci\u00F3n");
		lblNewLabel.setBounds(25, 36, 107, 13);
		contentPane.add(lblNewLabel);
		
		txtDonacion = new JTextField();
		txtDonacion.setBounds(142, 33, 96, 19);
		contentPane.add(txtDonacion);
		txtDonacion.setColumns(10);
		
		txtSalida = new JTextArea();
		txtSalida.setBounds(10, 89, 416, 164);
		contentPane.add(txtSalida);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(320, 10, 85, 21);
		contentPane.add(btnProcesar);
		
		btnNewButton = new JButton("Borrar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(320, 41, 85, 21);
		contentPane.add(btnNewButton);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		//1.Declaracion de variables
		double donacion, pediatria, medicinaG, ginecologia, traumatologia;
		//2.Entrada de datos
		donacion=Double.parseDouble(txtDonacion.getText());
		//3.Proceso logico
		medicinaG=donacion*0.45;
		ginecologia=medicinaG*0.80;
		pediatria=(medicinaG+ginecologia)*0.20;
		traumatologia=donacion-(medicinaG+ginecologia+pediatria);
		//4.Salida
		txtSalida.setText("Medicina General: "+"S/."+Math.round(medicinaG)+"\n");
		txtSalida.append("Ginecologia: "+"S/."+ginecologia+"\n");
		txtSalida.append("Pediatria: "+"S/."+pediatria+"\n");
		txtSalida.append("Traumatologia: "+"S/."+traumatologia);
		
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		txtSalida.setText("");
		txtDonacion.setText("");
		txtDonacion.requestFocus();
	}
}
