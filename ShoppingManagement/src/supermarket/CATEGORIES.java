package supermarket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class CATEGORIES {

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
					CATEGORIES window = new CATEGORIES();
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
	public CATEGORIES() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 847, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblManageCategories = new JLabel("MANAGE CATEGORIES\r\n");
		lblManageCategories.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblManageCategories.setBounds(326, 11, 222, 22);
		frame.getContentPane().add(lblManageCategories);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ID");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(195, 63, 24, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("NAME");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(549, 63, 61, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("DESCRIPTION");
		lblNewLabel_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_2.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1_1_2.setBounds(320, 106, 116, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_2);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setColumns(10);
		textField.setBackground(SystemColor.controlHighlight);
		textField.setBounds(229, 65, 127, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.controlHighlight);
		textField_1.setBounds(464, 108, 161, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.controlHighlight);
		textField_2.setBounds(650, 65, 137, 20);
		frame.getContentPane().add(textField_2);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBackground(SystemColor.controlShadow);
		btnAdd.setBounds(195, 161, 101, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setForeground(Color.BLACK);
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEdit.setBackground(SystemColor.controlShadow);
		btnEdit.setBounds(372, 161, 101, 23);
		frame.getContentPane().add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBackground(SystemColor.controlShadow);
		btnDelete.setBounds(535, 161, 101, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBackground(SystemColor.controlShadow);
		btnClear.setBounds(696, 161, 101, 23);
		frame.getContentPane().add(btnClear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(195, 257, 602, 106);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"ID", "NAME", "DESCRIPTION"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblCategoriesList = new JLabel("CATEGORIES LIST\r\n");
		lblCategoriesList.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblCategoriesList.setBounds(424, 215, 187, 22);
		frame.getContentPane().add(lblCategoriesList);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Products");
		lblNewLabel_1_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_3.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1_1_1_3.setBounds(25, 69, 86, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("Seller");
		lblNewLabel_1_1_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_4.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1_1_1_4.setBounds(25, 112, 86, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_4);
		
		JLabel lblNewLabel_1_1_1_5 = new JLabel("Login");
		lblNewLabel_1_1_1_5.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_5.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblNewLabel_1_1_1_5.setBounds(25, 342, 48, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_5);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(121, 11, 2, 365);
		frame.getContentPane().add(separator);
	}
}
