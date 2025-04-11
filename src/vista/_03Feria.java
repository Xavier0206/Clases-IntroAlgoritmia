package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _03Feria extends JFrame implements ActionListener {
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
	public _03Feria() {
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
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		//1. Declaracion de Variables
		double monto, alquiler, publicidad, transporte, servFer, decoracion, gastosV, precAl, precPub, precTra, 
		precServ, precDec, precGast;
		//2. Entrada de datos
		monto=Double.parseDouble(txtMonto.getText());
		alquiler=0.23;
		publicidad=0.07;
		transporte=0.26;
		servFer=0.12;
		decoracion=0.21;
		gastosV=0.11;
		//3. Proceso
		precAl=monto*alquiler;
		precPub=monto*publicidad;
		precTra=monto*transporte;
		precServ=monto*servFer;
		precDec=monto*decoracion;
		precGast=monto*gastosV;
		//4. Salida de Datos
		textaResultado.append("Alquiler de espacio en la feria : "+precAl+"\n");
		textaResultado.append("Publicidad : "+precPub+"\n");
		textaResultado.append("Transporte : "+precTra+"\n");
		textaResultado.append("Servicios feriales : "+precServ+"\n");
		textaResultado.append("Decoracion : "+precDec+"\n");
		textaResultado.append("Gastos Varios : "+precGast+"\n");
	}
}
