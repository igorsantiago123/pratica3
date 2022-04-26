package validacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class testeCPF extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtCPF;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testeCPF frame = new testeCPF();
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
	public testeCPF() {
		setTitle("valida");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(126, 53, 155, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(126, 139, 155, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NOME");
		lblNewLabel.setBounds(48, 56, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(48, 142, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Conferir cpf");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String CPF=txtCPF.getText();
				if (ValidaCPF.isCPF(CPF) == true)
		        	JOptionPane.showMessageDialog(null,"CPF Válido"+ ValidaCPF.imprimeCPF(CPF));
		        else 	JOptionPane.showMessageDialog(null,"erro, CPF invalido");
			}
		});
		btnNewButton.setBounds(170, 200, 89, 23);
		contentPane.add(btnNewButton);
	}
}
