package supermarket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class PRODUCTS {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PRODUCTS window = new PRODUCTS();
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
	public PRODUCTS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 876, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MANAGE PRODUCTS\r\n");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel.setBounds(419, 11, 203, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBackground(SystemColor.controlShadow);
		btnAdd.setBounds(200, 166, 101, 23);
		frame.getContentPane().add(btnAdd);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setColumns(10);
		textField.setBackground(SystemColor.controlHighlight);
		textField.setBounds(322, 63, 101, 20);
		frame.getContentPane().add(textField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setBounds(322, 125, 101, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.setForeground(Color.BLACK);
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEdit.setBackground(SystemColor.controlShadow);
		btnEdit.setBounds(371, 166, 101, 23);
		frame.getContentPane().add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBackground(SystemColor.controlShadow);
		btnDelete.setBounds(556, 166, 101, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBackground(SystemColor.controlShadow);
		btnClear.setBounds(720, 166, 101, 23);
		frame.getContentPane().add(btnClear);
		
		JLabel lblNewLabel_1_1 = new JLabel("NAME");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(200, 93, 56, 21);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PRODUCT");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(200, 61, 81, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.controlHighlight);
		textField_1.setBounds(322, 94, 101, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("CATEGORY");
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1_2.setBounds(203, 124, 98, 21);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("QUANTITY");
		lblNewLabel_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_3.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1_3.setBounds(586, 61, 81, 21);
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("PRICE");
		lblNewLabel_1_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_1_4.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1_4.setBounds(588, 97, 56, 21);
		frame.getContentPane().add(lblNewLabel_1_1_4);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.controlHighlight);
		textField_2.setBounds(720, 63, 101, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.BLACK);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.controlHighlight);
		textField_3.setBounds(720, 99, 101, 20);
		frame.getContentPane().add(textField_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(198, 267, 645, 143);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
			}
		));
		
		JLabel lblProductsList = new JLabel("PRODUCTS LIST\r\n");
		lblProductsList.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblProductsList.setBounds(450, 233, 160, 22);
		frame.getContentPane().add(lblProductsList);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(150, 11, 2, 399);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Seller");
		lblNewLabel_1_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_3.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1_1_1_3.setBounds(28, 67, 86, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_3_1 = new JLabel("Categories");
		lblNewLabel_1_1_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_3_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1_1_1_3_1.setBounds(28, 103, 101, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_3_1);
		
		JLabel lblNewLabel_1_1_1_3_2 = new JLabel("Logout");
		lblNewLabel_1_1_1_3_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_3_2.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblNewLabel_1_1_1_3_2.setBounds(28, 360, 86, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_3_2);
	}
}
