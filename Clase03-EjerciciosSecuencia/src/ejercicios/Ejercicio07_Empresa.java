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

public class Ejercicio07_Empresa extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtHorasT;
	private JTextField txtPagoH;
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
					Ejercicio07_Empresa frame = new Ejercicio07_Empresa();
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
	public Ejercicio07_Empresa(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Horas Trabajadas");
		lblNewLabel.setBounds(10, 30, 45, 13);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Pago Hora");
		lblNewLabel_1.setBounds(10, 60, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		txtHorasT = new JTextField();
		txtHorasT.setBounds(80, 27, 96, 19);
		contentPane.add(txtHorasT);
		txtHorasT.setColumns(10);
		
		txtPagoH = new JTextField();
		txtPagoH.setBounds(80, 57, 96, 19);
		contentPane.add(txtPagoH);
		txtPagoH.setColumns(10);
		
		txtSalida = new JTextArea();
		txtSalida.setBounds(10, 128, 416, 125);
		contentPane.add(txtSalida);
		
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
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
//		1. Declaracion de variables
		double horasTrabajo, sueldoBasico, horasPago;
		double bonificacion, sueldoBruto, descuento, sueldoNeto;
//		2. Entrada de datos
		horasTrabajo=Double.parseDouble(txtHorasT.getText());
		horasPago=Double.parseDouble(txtPagoH.getText());
//		3. Proceso logico
		sueldoBasico=horasTrabajo*horasPago;
		bonificacion=sueldoBasico*0.20;
		sueldoBruto=sueldoBasico+bonificacion;
		descuento=sueldoBruto*0.10;
		sueldoNeto=sueldoBruto-descuento;
//		4. Salida
		txtSalida.setText("El sueldo basico es:"+"\t"+sueldoBasico+"\n");
		txtSalida.append("Su bonificacion es:"+"\t"+bonificacion+"\n");
		txtSalida.append("Su sueldo bruto es:"+"\t"+sueldoBruto+"\n");
		txtSalida.append("Su descuento es:"+"\t"+descuento+"\n");
		txtSalida.append("Su sueldo neto es:"+"\t"+sueldoNeto);
	}
}
