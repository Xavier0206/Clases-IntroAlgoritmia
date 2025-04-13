package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio01 extends JFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JTextField txtGrados;
	private JTextArea txtResutado;
	private JButton btnProcesar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio01 frame = new Ejercicio01();
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
	public Ejercicio01() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Grados Sexadecimales");
		lblNewLabel.setBounds(56, 49, 113, 13);
		getContentPane().add(lblNewLabel);
		
		txtGrados = new JTextField();
		txtGrados.setBounds(182, 46, 96, 19);
		getContentPane().add(txtGrados);
		txtGrados.setColumns(10);
		
		txtResutado = new JTextArea();
		txtResutado.setBounds(15, 99, 405, 152);
		getContentPane().add(txtResutado);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(336, 44, 85, 21);
		getContentPane().add(btnProcesar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		//1.Declaracion de Variables
		double sexadecimales, centesimales, radianes;
		//2.Entrada de datos
		sexadecimales=Double.parseDouble(txtGrados.getText());
		//3.Proceso
		centesimales=(200*sexadecimales)/180;
		radianes=(Math.PI*sexadecimales)/180;
		//4. Salida
		txtResutado.setText("Centesimales: "+centesimales+"\n");
		txtResutado.append("Radianes: "+radianes);
	}
}
