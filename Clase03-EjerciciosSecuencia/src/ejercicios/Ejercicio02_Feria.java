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

public class Ejercicio02_Feria extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtMonto;
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
					Ejercicio02_Feria frame = new Ejercicio02_Feria();
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
	public Ejercicio02_Feria(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Monto");
		lblNewLabel.setBounds(10, 30, 45, 13);
		contentPane.add(lblNewLabel);
		
		txtMonto = new JTextField();
		txtMonto.setBounds(80, 27, 96, 19);
		contentPane.add(txtMonto);
		txtMonto.setColumns(10);
		
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
		//1.Declaracion de variables
		double montoTotal, alquilerEspacio, publicidad, transporte, serviciosFeriales, decoracion, gastosVarios;
		//2. Entrada de datos
		montoTotal=Double.parseDouble(txtMonto.getText());
		//3. Logica
		alquilerEspacio=montoTotal*0.23;
		publicidad=montoTotal*0.07;
		transporte=montoTotal*0.26;
		serviciosFeriales=montoTotal*0.12;
		decoracion=montoTotal*0.21;
		gastosVarios=montoTotal*0.11;
		//4.Salida de datos
		txtSalida.setText("Alquiler:"+"\t"+"\t"+alquilerEspacio +"\n");
		txtSalida.append("Publicidad:"+"\t"+"\t"+publicidad+"\n");
		txtSalida.append("Transporte:"+"\t"+"\t"+transporte+"\n");
		txtSalida.append("Servicios Feriales:"+"\t"+serviciosFeriales+"\n");
		txtSalida.append("Decoracion:"+"\t"+"\t"+decoracion+"\n");
		txtSalida.append("Gastos varios:"+"\t"+"\t"+gastosVarios);
		
	}
}
