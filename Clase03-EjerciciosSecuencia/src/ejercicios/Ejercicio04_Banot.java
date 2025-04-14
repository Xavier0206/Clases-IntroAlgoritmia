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

public class Ejercicio04_Banot extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtDeb;
	private JTextField txtRaq;
	private JTextField txtSef;
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
					Ejercicio04_Banot frame = new Ejercicio04_Banot();
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
	public Ejercicio04_Banot(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Debora");
		lblNewLabel.setBounds(10, 30, 45, 13);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Raquel");
		lblNewLabel_1.setBounds(10, 60, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Sefora");
		lblNewLabel_2.setBounds(10, 90, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		txtDeb = new JTextField();
		txtDeb.setBounds(80, 27, 96, 19);
		contentPane.add(txtDeb);
		txtDeb.setColumns(10);
		
		txtRaq = new JTextField();
		txtRaq.setBounds(80, 57, 96, 19);
		contentPane.add(txtRaq);
		txtRaq.setColumns(10);
		
		txtSef = new JTextField();
		txtSef.setBounds(80, 87, 96, 19);
		contentPane.add(txtSef);
		txtSef.setColumns(10);
		
		txtSalida = new JTextArea();
		txtSalida.setBounds(10, 128, 416, 125);
		contentPane.add(txtSalida);
		
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
		double montoTotal, montoDebora, montoRaquel, montoSefora;
//		2. Entrada de datos
		montoDebora=Double.parseDouble(txtDeb.getText());
		montoRaquel=Double.parseDouble(txtRaq.getText());
		montoSefora=Double.parseDouble(txtSef.getText());
//		3. Proceso logico
		montoTotal=montoDebora+montoRaquel+montoSefora;
		montoDebora=(montoDebora/montoTotal)*100;
		montoRaquel=(montoRaquel/montoTotal)*100;
		montoSefora=(montoSefora/montoTotal)*100;
//		4. Salida de Datos
		txtSalida.setText("El monto total es:"+"\t"+Math.round(montoTotal)+"\n");
		txtSalida.append("Debora tiene el porcentaje de:"+"\t"+Math.round(montoDebora)+"\n");
		txtSalida.append("Raque tiene el porcentaje de:"+"\t"+Math.round(montoRaquel)+"\n");
		txtSalida.append("Sefora tiene el porcentaje de:"+"\t"+Math.round(montoSefora));
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		txtSalida.setText("");
		txtDeb.setText("");
		txtDeb.requestFocus();
		txtRaq.setText("");
		txtSef.setText("");
		
	}
}
