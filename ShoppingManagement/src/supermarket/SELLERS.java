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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class SELLERS {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SELLERS window = new SELLERS();
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
	public SELLERS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 870, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblManageSellers = new JLabel("MANAGE SELLERS\r\n");
		lblManageSellers.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblManageSellers.setBounds(434, 11, 203, 22);
		frame.getContentPane().add(lblManageSellers);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("SELLERID");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(224, 58, 91, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(552, 58, 101, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("NAME");
		lblNewLabel_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_2.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1_1_2.setBounds(224, 96, 81, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("GENDER");
		lblNewLabel_1_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_3.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1_1_3.setBounds(552, 96, 91, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_3);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setColumns(10);
		textField.setBackground(SystemColor.controlHighlight);
		textField.setBounds(362, 60, 101, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.controlHighlight);
		textField_1.setBounds(362, 98, 101, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.controlHighlight);
		textField_2.setBounds(716, 58, 101, 20);
		frame.getContentPane().add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setBounds(716, 96, 101, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBackground(SystemColor.controlShadow);
		btnAdd.setBounds(224, 166, 101, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setForeground(Color.BLACK);
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEdit.setBackground(SystemColor.controlShadow);
		btnEdit.setBounds(370, 166, 101, 23);
		frame.getContentPane().add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBackground(SystemColor.controlShadow);
		btnDelete.setBounds(570, 166, 101, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBackground(SystemColor.controlShadow);
		btnClear.setBounds(716, 166, 101, 23);
		frame.getContentPane().add(btnClear);
		
		JLabel lblSellersList = new JLabel("SELLERS LIST\r\n");
		lblSellersList.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblSellersList.setBounds(460, 225, 151, 22);
		frame.getContentPane().add(lblSellersList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(215, 258, 602, 107);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID", "NAME", "PASSWORD", "GENDER"
			}
		));
		scrollPane.setViewportView(table);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(165, 11, 2, 382);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1_1_1_3_1 = new JLabel("PRODUCTS");
		lblNewLabel_1_1_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_3_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1_1_1_3_1.setBounds(30, 64, 101, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_3_1);
		
		JLabel lblNewLabel_1_1_1_3_2 = new JLabel("CATEGORIES");
		lblNewLabel_1_1_1_3_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_3_2.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1_1_1_3_2.setBounds(30, 102, 125, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_3_2);
	}
}
