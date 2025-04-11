package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _02Piramide extends JFrame implements ActionListener {
	private JLabel lblLargo;
	private JLabel lblAncho;
	private JLabel lblAltura;
	private JTextField txtLargo;
	private JTextField txtAncho;
	private JTextField txtAltura;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JTextArea txtaResultados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_02Piramide frame = new _02Piramide();
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
	public _02Piramide() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblLargo = new JLabel("Largo");
		lblLargo.setBounds(50, 50, 45, 13);
		getContentPane().add(lblLargo);
		
		lblAncho = new JLabel("Ancho");
		lblAncho.setBounds(50, 73, 45, 13);
		getContentPane().add(lblAncho);
		
		lblAltura = new JLabel("Altura");
		lblAltura.setBounds(50, 96, 45, 13);
		getContentPane().add(lblAltura);
		
		txtLargo = new JTextField();
		txtLargo.setBounds(105, 47, 96, 19);
		getContentPane().add(txtLargo);
		txtLargo.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setBounds(105, 70, 96, 19);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(105, 93, 96, 19);
		getContentPane().add(txtAltura);
		txtAltura.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(309, 46, 85, 21);
		getContentPane().add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(309, 92, 85, 21);
		getContentPane().add(btnBorrar);
		
		txtaResultados = new JTextArea();
		txtaResultados.setBounds(50, 145, 341, 108);
		getContentPane().add(txtaResultados);

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
		//1. Declaracion de variables
		double largo, ancho, altura, area, volumen;
		//2. Entrada de Datos
		largo=Double.parseDouble(txtLargo.getText());
		ancho=Double.parseDouble(txtAncho.getText());
		altura=Double.parseDouble(txtAltura.getText());
		//3. Proceso logico
		area=largo*ancho;
		volumen=(area*altura)/3;
		//4. Salida de Resultados
		txtaResultados.setText("El area es: "+area+ "\n"); //importante usar set text para que los valores no se repitan 
		//txtaResultados.append("El volumen es: "+volumen);
		txtaResultados.append("El volumen es: "+Math.round((volumen*100)/100));
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		txtAltura.setText("");
		txtAncho.setText("");
		txtLargo.setText("");
		txtaResultados.setText("");
		txtLargo.requestFocus();
		
	}
}
