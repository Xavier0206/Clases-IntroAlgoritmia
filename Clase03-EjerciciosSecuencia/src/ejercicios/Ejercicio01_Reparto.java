package ejercicios;

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

public class Ejercicio01_Reparto extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtPersona1;
	private JTextField txtPersona2;
	private JTextField txtPersona3;
	private JTextArea txtSalida;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JLabel lblNewLabel_3;
	private JTextField txtDinero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio01_Reparto frame = new Ejercicio01_Reparto();
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
	public Ejercicio01_Reparto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Persona01");
		lblNewLabel.setBounds(10, 30, 57, 13);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Persona02");
		lblNewLabel_1.setBounds(10, 60, 57, 13);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Persona03");
		lblNewLabel_2.setBounds(10, 90, 57, 13);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Dinero");
		lblNewLabel_3.setBounds(115, 10, 45, 13);
		contentPane.add(lblNewLabel_3);
		
//		Variables
		txtPersona1 = new JTextField();
		txtPersona1.setBounds(90, 30, 96, 19);
		contentPane.add(txtPersona1);
		txtPersona1.setColumns(10);
		
		txtPersona2 = new JTextField();
		txtPersona2.setBounds(90, 60, 96, 19);
		contentPane.add(txtPersona2);
		txtPersona2.setColumns(10);
		
		txtPersona3 = new JTextField();
		txtPersona3.setBounds(90, 90, 96, 19);
		contentPane.add(txtPersona3);
		txtPersona3.setColumns(10);
		
		txtDinero = new JTextField();
		txtDinero.setBounds(190, 7, 96, 19);
		contentPane.add(txtDinero);
		txtDinero.setColumns(10);
		
		txtSalida = new JTextArea();
		txtSalida.setBounds(10, 128, 416, 125);
		contentPane.add(txtSalida);
		
//		Botones
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(320, 26, 85, 21);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(320, 86, 85, 21);
		contentPane.add(btnBorrar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		//1. Declaracion de varibles
		double montoPersona1, montoPersona2, montoPersona3, edad1, edad2, edad3, montoTotal, sumaEdades;
		//2. Entrada de datos
		montoTotal=Double.parseDouble(txtDinero.getText());
		edad1=Double.parseDouble(txtPersona1.getText());
		edad2=Double.parseDouble(txtPersona2.getText());
		edad3=Double.parseDouble(txtPersona3.getText());
		//3. Logica
		montoPersona1=(edad1*montoTotal)/(edad1+edad2+edad3);
		montoPersona2=(edad2*montoTotal)/(edad1+edad2+edad3);
		montoPersona3=(edad3*montoTotal)/(edad1+edad2+edad3);
		//4. Salida de resultados 
		txtSalida.setText("Edad 1 tiene:"+ "\t" +montoPersona1 +"\n");
		txtSalida.append("Edad 2 tiene: "+ "\t" +montoPersona2 +"\n");
		txtSalida.append("Edad 3 tiene: "+ "\t" +montoPersona3);
	}
}
