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

public class Ejercicio03_Hijos extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtDinero;
	private JTextArea txtSalida;
	private JButton btnProcesar;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio03_Hijos frame = new Ejercicio03_Hijos();
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
	public Ejercicio03_Hijos(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Dinero Total");
		lblNewLabel.setBounds(10, 30, 45, 13);
		contentPane.add(lblNewLabel);
		
//		Variables
		txtDinero = new JTextField();
		txtDinero.setBounds(80, 27, 96, 19);
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
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(320, 86, 85, 21);
		contentPane.add(btnBorrar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(e);
		}
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
//		1. Declaracion de variables
		double montoTotal, tamar,josue, caleb, daniel, david;
//		2. Entrada de datos
		montoTotal=Double.parseDouble(txtDinero.getText());
//		3. Logica
		josue=montoTotal*0.27;
		daniel=montoTotal*0.25;
		tamar=josue*0.85;
		caleb=(josue+daniel)*0.23;
		david=montoTotal-(josue+daniel+tamar+caleb);
//		4. Salida de datos
		txtSalida.setText("Tamar recibira:"+"\t"+tamar+"\n");
		txtSalida.append("Josue recibira:"+"\t"+josue+"\n");
		txtSalida.append("Caleb recibira:"+"\t"+caleb+"\n");
		txtSalida.append("Daniel recibira:"+"\t"+daniel+"\n");
		txtSalida.append("David recibira:"+"\t"+david);
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		txtDinero.setText("");
		txtSalida.setText("");
		txtDinero.requestFocus();
	}
}
