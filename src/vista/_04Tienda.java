package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _04Tienda extends JFrame implements ActionListener {
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JTextField textfPrecio;
	private JTextField textfCantidad;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JTextArea textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_04Tienda frame = new _04Tienda();
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
	public _04Tienda() {
		setTitle("Tienda");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(40, 38, 45, 13);
		getContentPane().add(lblPrecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(40, 61, 45, 13);
		getContentPane().add(lblCantidad);
		
		textfPrecio = new JTextField();
		textfPrecio.setBounds(95, 35, 96, 19);
		getContentPane().add(textfPrecio);
		textfPrecio.setColumns(10);
		
		textfCantidad = new JTextField();
		textfCantidad.setBounds(95, 58, 96, 19);
		getContentPane().add(textfCantidad);
		textfCantidad.setColumns(10);
		
		textResultado = new JTextArea();
		textResultado.setBounds(40, 110, 361, 143);
		getContentPane().add(textResultado);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(317, 34, 85, 21);
		getContentPane().add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(317, 57, 85, 21);
		getContentPane().add(btnBorrar);
		


	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		//1. Declaracion de Variables
		double precio, cantidad, descuento, caramelos, importeCompra, importeDescuento, importePagar;
		//2. Entrada de datos
		precio=Double.parseDouble(textfPrecio.getText());
		cantidad=Double.parseDouble(textfCantidad.getText());
		descuento=0.11;
		//3. Procesamiento Logico
		importeCompra=precio*cantidad;
		importeDescuento=precio*descuento;
		importePagar=importeCompra-importeDescuento;
		caramelos=2*cantidad;
		//4.Salida de resultados
		textResultado.setText("Importe de compra: S/."+Math.round((importeCompra*100)/100)+"\n");
		textResultado.append("Importe descuento: S/."+importeDescuento+"\n");
		textResultado.append("Importe Pagar: S/."+importePagar+"\n");
		textResultado.append("Caramelos: "+caramelos+"\n");
	}
}
