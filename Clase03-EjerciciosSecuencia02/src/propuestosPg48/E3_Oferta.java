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

public class E3_Oferta extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
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
					E3_Oferta frame = new E3_Oferta();
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
	public E3_Oferta(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Precio");
		lblNewLabel.setBounds(10, 30, 45, 13);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Cantidad");
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
		double cantidad, precio, importeCompra, importePagar, importeDescuento;
//		2. Entrada de datos
		cantidad=Double.parseDouble(txtCantidad.getText());
		precio=Double.parseDouble(txtPrecio.getText());
//		3. Proceso logico
		importeCompra=cantidad*precio;
		importeDescuento=importeCompra*0.15;
		importePagar=importeCompra-importeDescuento;
//		4. Salida de resultados
		txtSalida.setText("Importe de compra: "+importeCompra+"\n");
		txtSalida.append("Importe descuento: "+importeDescuento+"\n");
		txtSalida.append("Imorte a pagar: "+importePagar);
	}
}
