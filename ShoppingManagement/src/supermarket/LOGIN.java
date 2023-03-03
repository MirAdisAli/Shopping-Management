package supermarket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;

import my.db.model.Good;
import my.db.service.ShopView;
import my.db.test.ShopTest;
import my.db.util.DbUtil;

import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class LOGIN {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN window = new LOGIN();
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
	public LOGIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.GRAY);
		frame.setBackground(Color.GRAY);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 711, 313);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 45));
		lblNewLabel.setBounds(453, 11, 141, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_1.setBounds(368, 100, 117, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(368, 158, 117, 21);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setBackground(UIManager.getColor("Button.light"));
		textField.setBounds(504, 103, 170, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.BLACK);
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 13));
		passwordField.setBackground(UIManager.getColor("Button.light"));
		passwordField.setBounds(503, 161, 171, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username=textField.getText();
				String password=passwordField.getText();
				
				if(password.contains("Adis") && username.contains("Adis"))
				{
					JOptionPane.showMessageDialog(frame, "   Login Successfully Completed  ");
					textField.setText(null);
					passwordField.setText(null);
					
					Good.main(null);
					ShopView.main(null);
					ShopTest.main(null);
					DbUtil.main(null);
					
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "       Incorrect Login Details   ", "Warning!!!", JOptionPane.WARNING_MESSAGE);
					//JOptionPane.showMessageDialog(null, "          INVALID LOGIN      ","ERROR",JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField.setText(null);
				}
					
			}
		});
		btnNewButton.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(358, 236, 101, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnNewButton_1.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(580, 237, 105, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton_2.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(469, 236, 101, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(28, 179, 1, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(358, 207, 327, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(358, 63, 315, 2);
		frame.getContentPane().add(separator_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.BLACK);
		panel.setBounds(0, 0, 337, 235);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\download.png"));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel(" Welcome to the Supermarket");
		lblNewLabel_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(65, 242, 231, 21);
		frame.getContentPane().add(lblNewLabel_1_2_1);
	}
}