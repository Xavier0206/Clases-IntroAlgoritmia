package vista;

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
import java.awt.Color;

public class _01Cilindro extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblradio;
	private JLabel lblaltura;
	private JTextField txtradio;
	private JTextField txtaltura;
	private JTextArea txtresultado;
	private JButton btnprocesar;
	private JButton btnborrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_01Cilindro frame = new _01Cilindro();
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
	public _01Cilindro() {
		setTitle("Cilindro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblradio = new JLabel("Radio");
		lblradio.setBounds(41, 35, 58, 13);
		contentPane.add(lblradio);
		
		lblaltura = new JLabel("Altura");
		lblaltura.setBounds(41, 77, 58, 13);
		contentPane.add(lblaltura);
		
		txtradio = new JTextField();
		txtradio.setBounds(109, 32, 96, 19);
		contentPane.add(txtradio);
		txtradio.setColumns(10);
		
		txtaltura = new JTextField();
		txtaltura.setBounds(109, 74, 96, 19);
		contentPane.add(txtaltura);
		txtaltura.setColumns(10);
		
		txtresultado = new JTextArea();
		txtresultado.setBounds(94, 131, 306, 122);
		contentPane.add(txtresultado);
		
		btnprocesar = new JButton("Procesar");
		btnprocesar.addActionListener(this);
		btnprocesar.setBounds(291, 32, 85, 21);
		contentPane.add(btnprocesar);
		
		btnborrar = new JButton("Borrar");
		btnborrar.addActionListener(this);
		btnborrar.setBounds(291, 74, 85, 21);
		contentPane.add(btnborrar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnborrar) {
			actionPerformedBtnborrar(e);
		}
		if (e.getSource() == btnprocesar) {
			actionPerformedBtnprocesar(e);
		}
	}
	protected void actionPerformedBtnprocesar(ActionEvent e) {
		double radio,altura,area,volumen;
		radio=Double.parseDouble(txtradio.getText());
		altura=Double.parseDouble(txtaltura.getText());
		//area=2*3.1416*radio*(radio+altura);
		area=2*Math.PI*radio*(radio+altura);
		volumen=2*Math.PI*radio*radio*altura;
		//Paso4: Resultado - salida
		txtresultado.append("Area: "+area+"\n");
		txtresultado.append("Volumen: "+volumen);
	}
	protected void actionPerformedBtnborrar(ActionEvent e) {
		txtradio.setText("");
		txtaltura.setText("");
		txtresultado.setText("");
		txtradio.requestFocus();
	}
}
