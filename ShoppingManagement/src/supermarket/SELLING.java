package supermarket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;

public class SELLING {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SELLING window = new SELLING();
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
	public SELLING() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 734, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBillingPoint = new JLabel("BILLING POINT");
		lblBillingPoint.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblBillingPoint.setBounds(290, 11, 175, 22);
		frame.getContentPane().add(lblBillingPoint);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("NAME");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(35, 65, 53, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("QUANTITY");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(35, 97, 81, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setColumns(10);
		textField.setBackground(SystemColor.controlHighlight);
		textField.setBounds(134, 67, 143, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.controlHighlight);
		textField_1.setBounds(134, 99, 143, 20);
		frame.getContentPane().add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setBounds(435, 67, 101, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnAddToBill = new JButton("Add to Bill");
		btnAddToBill.setForeground(Color.BLACK);
		btnAddToBill.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAddToBill.setBackground(SystemColor.controlShadow);
		btnAddToBill.setBounds(35, 141, 121, 23);
		frame.getContentPane().add(btnAddToBill);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBackground(SystemColor.controlShadow);
		btnClear.setBounds(187, 141, 101, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setForeground(Color.BLACK);
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRefresh.setBackground(SystemColor.controlShadow);
		btnRefresh.setBounds(552, 66, 115, 23);
		frame.getContentPane().add(btnRefresh);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(330, 110, 354, 104);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblProductsList = new JLabel("PRODUCTS LIST");
		lblProductsList.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblProductsList.setBounds(470, 34, 153, 22);
		frame.getContentPane().add(lblProductsList);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Filter by");
		lblNewLabel_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_2.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1_1_2.setBounds(340, 67, 74, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(330, 244, 354, 132);
		frame.getContentPane().add(textArea);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setForeground(Color.BLACK);
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPrint.setBackground(SystemColor.controlShadow);
		btnPrint.setBounds(470, 401, 101, 23);
		frame.getContentPane().add(btnPrint);
	}
}
