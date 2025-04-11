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

public class _05Banot extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtDebora;
	private JTextField txtRaquel;
	private JTextField txtSefora;
	private JTextArea txtSalida;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_05Banot frame = new _05Banot();
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
	public _05Banot() {
		setTitle("Banot");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Debora");
		lblNewLabel.setBounds(10, 30, 45, 13);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Raquel");
		lblNewLabel_1.setBounds(10, 53, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Sefora");
		lblNewLabel_2.setBounds(10, 76, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		txtDebora = new JTextField();
		txtDebora.setBounds(65, 27, 96, 19);
		contentPane.add(txtDebora);
		txtDebora.setColumns(10);
		
		txtRaquel = new JTextField();
		txtRaquel.setBounds(65, 50, 96, 19);
		contentPane.add(txtRaquel);
		txtRaquel.setColumns(10);
		
		txtSefora = new JTextField();
		txtSefora.setBounds(65, 73, 96, 19);
		contentPane.add(txtSefora);
		txtSefora.setColumns(10);
		
		txtSalida = new JTextArea();
		txtSalida.setBounds(10, 122, 525, 131);
		contentPane.add(txtSalida);
		
		btnNewButton = new JButton("Procesar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(409, 26, 85, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(409, 72, 85, 21);
		contentPane.add(btnNewButton_1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(e);
		}
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		//1. Declaracion de Variables
		double capital, porcDebora, porcRaquel, porcSefora, debora, raquel, sefora;
		//2. Entrada de datos
		debora=Double.parseDouble(txtDebora.getText());
		raquel=Double.parseDouble(txtRaquel.getText());
		sefora=Double.parseDouble(txtSefora.getText());
		//3. Proceso logico
		capital=debora+raquel+sefora;
		porcDebora=(debora/capital)*100;
		porcRaquel=(raquel/capital)*100;
		porcSefora=(sefora/capital)*100;
		//4. Salida
		txtSalida.setText("Capital: "+capital+"\n");
		txtSalida.append("Porcentaje Debora: "+Math.round((porcDebora*100)/100)+"%"+"\n");
		txtSalida.append("Porcentaje Raquel: "+Math.round((porcRaquel*100)/100)+"%"+"\n");
		txtSalida.append("Porcentaje Sefora: "+Math.round(porcSefora) +"%"+"\n");
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		txtDebora.setText("");
		txtRaquel.setText("");
		txtSefora.setText("");
		txtSalida.setText("");
		txtDebora.requestFocus();
	}
}
