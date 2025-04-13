package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio03 extends JFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JTextField txtEdad;
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
					Ejercicio03 frame = new Ejercicio03();
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
	public Ejercicio03() {
		setTitle("Peso");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Edad del infante");
		lblNewLabel.setBounds(27, 44, 101, 13);
		getContentPane().add(lblNewLabel);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(151, 41, 96, 19);
		getContentPane().add(txtEdad);
		txtEdad.setColumns(10);
		
		txtSalida = new JTextArea();
		txtSalida.setBounds(27, 97, 399, 156);
		getContentPane().add(txtSalida);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(320, 22, 85, 21);
		getContentPane().add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(320, 53, 85, 21);
		getContentPane().add(btnBorrar);

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
		//1.Declaracion de variables
		double edad, peso;
		//2.Entrada de datos
		edad=Double.parseDouble(txtEdad.getText());
		//3.Proceso
		peso=(3*edad)+7;
		//4.Salida
		txtSalida.setText("Peso estimado: "+peso+"Kg");
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		txtEdad.setText("");
		txtSalida.setText("");
		txtEdad.requestFocus();
	}
}
