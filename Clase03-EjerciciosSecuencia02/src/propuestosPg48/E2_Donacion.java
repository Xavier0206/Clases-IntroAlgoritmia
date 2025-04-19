package propuestosPg48;

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

public class E2_Donacion extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtDonacion;
	private JTextArea txtSalida;
	private JButton btnProcesar;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E2_Donacion frame = new E2_Donacion();
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
	public E2_Donacion(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Donacion");
		lblNewLabel.setBounds(10, 30, 45, 13);
		contentPane.add(lblNewLabel);
		
		txtDonacion = new JTextField();
		txtDonacion.setBounds(80, 27, 96, 19);
		contentPane.add(txtDonacion);
		txtDonacion.setColumns(10);
		
		txtSalida = new JTextArea();
		txtSalida.setBounds(10, 128, 416, 125);
		contentPane.add(txtSalida);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(320, 26, 85, 21);
		contentPane.add(btnProcesar);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(320, 86, 85, 21);
		contentPane.add(btnNewButton_1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
//		1. Declaracion de variables
		double donacion, centroSalud, comedor, biblioteca, escuela, farmacia, asilo;
//		2. Entrada de datos
		donacion=Double.parseDouble(txtDonacion.getText());
//		3. Proceso logico
		centroSalud=donacion*0.25;
		farmacia=centroSalud*0.40;
		escuela=donacion*0.35;
		comedor=escuela*0.45;
		biblioteca=(comedor+escuela)*0.17;
		asilo=donacion-(centroSalud+farmacia+escuela+comedor+biblioteca);
//		4. Salida
		txtSalida.setText("Centro de salud: "+centroSalud+"\n");
		txtSalida.append("Comedor: "+comedor+"\n");
		txtSalida.append("Biblioteca: "+biblioteca+"\n");
		txtSalida.append("Escuela: "+escuela+"\n");
		txtSalida.append("Farmacia es: "+farmacia+"\n");
		txtSalida.append("Asilo es: "+asilo);
	}
}
