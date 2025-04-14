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

public class Ejercicio06_Camisas extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
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
					Ejercicio06_Camisas frame = new Ejercicio06_Camisas();
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
	public Ejercicio06_Camisas(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Precio");
		lblNewLabel.setBounds(10, 30, 45, 13);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("cantidad");
		lblNewLabel_1.setBounds(10, 60, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(80, 27, 96, 19);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(80, 57, 96, 19);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
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
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
//		1. Declaracion de variables
		double cantidad, precio, importeCompra, importePagar, descuento, primerDescuento, segundoDescuento, descuentoTotal;
//		2. Entrada de datos
		cantidad=Double.parseDouble(txtCantidad.getText());
		precio=Double.parseDouble(txtPrecio.getText());
//		3.Proceso Logico
		importeCompra=precio*cantidad;
		primerDescuento=importeCompra*0.07;
		segundoDescuento= (importeCompra-primerDescuento)*0.07;
		descuentoTotal=primerDescuento+segundoDescuento;
		importePagar=importeCompra-descuentoTotal;
//		Salida
		txtSalida.setText("El importe de compra es:"+"\t"+importeCompra+"\n");
		txtSalida.append("El importe del primer descuento es:"+"\t"+primerDescuento+"\n");
		txtSalida.append("El importe del segundo descuento es:"+"\t"+segundoDescuento+"\n");
		txtSalida.append("El importe del descuento total es:"+"\t"+descuentoTotal+"\n");
		txtSalida.append("El importe a pagar es:"+"\t"+importePagar);
	}
}
