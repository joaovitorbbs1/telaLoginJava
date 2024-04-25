package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PrimeiraInterfaceWB {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraInterfaceWB window = new PrimeiraInterfaceWB();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrimeiraInterfaceWB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(3, 199, 135));
		panel.setBounds(0, 0, 434, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(67, 178, 300, 300);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Usuário");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(44, 78, 210, 14);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(44, 103, 210, 30);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(44, 153, 210, 14);
		panel_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(44, 178, 210, 30);
		panel_1.add(textField_1);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnNewButton.setBounds(44, 230, 210, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Bem Vindo!");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(44, 11, 210, 56);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Esqueceu sua senha?");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(44, 275, 210, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Todo App");
		lblNewLabel.setIcon(new ImageIcon("E:\\cap\\ProjetoComInterface\\src\\Principais\\icons8-check-50.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 36));
		lblNewLabel.setBounds(67, 41, 300, 82);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Clique aqui para se cadatrar");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_4.setBounds(67, 525, 300, 25);
		panel.add(lblNewLabel_4);
	}
}
