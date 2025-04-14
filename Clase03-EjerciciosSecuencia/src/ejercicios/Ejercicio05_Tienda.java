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

public class Ejercicio05_Tienda extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtCantidad;
	private JTextArea txtSalida;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JLabel lblNewLabel_1;
	private JTextField txtProducto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio05_Tienda frame = new Ejercicio05_Tienda();
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
	public Ejercicio05_Tienda(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Cantidad de unidades");
		lblNewLabel.setBounds(10, 30, 45, 13);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Producto");
		lblNewLabel_1.setBounds(10, 63, 45, 13);
		contentPane.add(lblNewLabel_1);
		
//		Variables
		txtCantidad = new JTextField();
		txtCantidad.setBounds(80, 27, 96, 19);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtProducto = new JTextField();
		txtProducto.setText("");
		txtProducto.setBounds(80, 60, 96, 19);
		contentPane.add(txtProducto);
		txtProducto.setColumns(10);
		
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
//		1.Declaracion de variables
		double descuento, cantidad, precioProducto, importeCompra, importePagar, importeDescuento, caramelos;
//		2. Entrada de datos
		cantidad=Double.parseDouble(txtCantidad.getText());
		precioProducto=Double.parseDouble(txtProducto.getText());
		descuento=0.11;
//		3. Proceso logico
		importeCompra=precioProducto*cantidad;
		importeDescuento=importeCompra*descuento;
		importePagar=importeCompra-importeDescuento;
		caramelos=2*cantidad;
//		4. Salida
		txtSalida.setText("Importe de la compra es:"+"\t"+"S/."+importeCompra+"\n");
		txtSalida.append("Importe de descuento es:"+"\t"+"S/."+importeDescuento+"\n");
		txtSalida.append("Importe a pagar es:"+"\t"+"S/."+importePagar+"\n");
		txtSalida.append("Por su compra recibe:"+caramelos+"caramelos");
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		txtCantidad.setText("");
		txtCantidad.requestFocus();
		txtProducto.setText("");
		txtSalida.setText("");
	}
}
