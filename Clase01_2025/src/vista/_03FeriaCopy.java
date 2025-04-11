package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _03FeriaCopy extends JFrame implements ActionListener {
	private JLabel lblMonto;
	private JTextField txtMonto;
	private JButton btnBorrar;
	private JButton btnProcesar;
	private JTextArea textaResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_03Feria frame = new _03Feria();
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
	public _03FeriaCopy() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblMonto = new JLabel("Monto Total");
		lblMonto.setBounds(40, 30, 62, 13);
		getContentPane().add(lblMonto);
		
		txtMonto = new JTextField();
		txtMonto.setBounds(112, 27, 96, 19);
		getContentPane().add(txtMonto);
		txtMonto.setColumns(10);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(255, 26, 69, 21);
		getContentPane().add(btnBorrar);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(334, 26, 69, 21);
		getContentPane().add(btnProcesar);
		
		textaResultado = new JTextArea();
		textaResultado.setBounds(40, 73, 360, 180);
		getContentPane().add(textaResultado);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar();
		}
	}
	protected void actionPerformedBtnProcesar() {
		// 1. Declaración de Variables y Constantes
	    final double PORCENTAJE_ALQUILER = 0.23;
	    final double PORCENTAJE_PUBLICIDAD = 0.07;
	    final double PORCENTAJE_TRANSPORTE = 0.26;
	    final double PORCENTAJE_SERVICIOS_FERIALES = 0.12;
	    final double PORCENTAJE_DECORACION = 0.21;
	    final double PORCENTAJE_GASTOS_VARIOS = 0.11;

	    double monto, precioAlquiler, precioPublicidad, precioTransporte, precioServicios, precioDecoracion, precioGastos;

	    // 2. Entrada de Datos y Manejo de Errores
	    try {
	        monto = Double.parseDouble(txtMonto.getText());

	        // 3. Proceso
	        precioAlquiler = monto * PORCENTAJE_ALQUILER;
	        precioPublicidad = monto * PORCENTAJE_PUBLICIDAD;
	        precioTransporte = monto * PORCENTAJE_TRANSPORTE;
	        precioServicios = monto * PORCENTAJE_SERVICIOS_FERIALES;
	        precioDecoracion = monto * PORCENTAJE_DECORACION;
	        precioGastos = monto * PORCENTAJE_GASTOS_VARIOS;

	        // 4. Salida de Datos
	        textaResultado.append(String.format("Alquiler de espacio en la feria: \n", precioAlquiler));
	        textaResultado.append(String.format("Publicidad: %.2f\n", precioPublicidad));
	        textaResultado.append(String.format("Transporte: %.2f\n", precioTransporte));
	        textaResultado.append(String.format("Servicios feriales: %.2f\n", precioServicios));
	        textaResultado.append(String.format("Decoración: %.2f\n", precioDecoracion));
	        textaResultado.append(String.format("Gastos Varios: %.2f\n", precioGastos));

	    } catch (NumberFormatException e) {
	        textaResultado.append("Error: Ingresa un monto válido.\n");
	    }
	}
}
