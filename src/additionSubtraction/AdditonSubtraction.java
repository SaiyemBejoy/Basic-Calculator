package additionSubtraction;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AdditonSubtraction {

	private JFrame frame;
	private JTextField addValue;
	private JTextField subValue;
	private JTextField resultField;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdditonSubtraction window = new AdditonSubtraction();
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
	public AdditonSubtraction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 537, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		addValue = new JTextField();
		addValue.setFont(new Font("Tahoma", Font.BOLD, 20));
		addValue.setBounds(78, 40, 123, 48);
		frame.getContentPane().add(addValue);
		addValue.setColumns(10);
		
		subValue = new JTextField();
		subValue.setFont(new Font("Tahoma", Font.BOLD, 20));
		subValue.setColumns(10);
		subValue.setBounds(321, 40, 123, 48);
		frame.getContentPane().add(subValue);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1,num2,ans;
				try {
					
					num1 = Double.parseDouble(addValue.getText());
					
					num2 = Double.parseDouble(subValue.getText());
					
					ans = num1+num2;
					
					resultField.setText(Double.toString(ans));
					
				}catch(Exception E) {
					JOptionPane.showMessageDialog(null,"Exception occure!!");
				}
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAdd.setBounds(148, 108, 101, 48);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("SUB");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1,num2,ans;
				try {
					
					num1 = Double.parseDouble(addValue.getText());
					
					num2 = Double.parseDouble(subValue.getText());
					
					ans = num1-num2;
					
					resultField.setText(Double.toString(ans));
					
				}catch(Exception E) {
					JOptionPane.showMessageDialog(null,"Exception occure!!");
				}
				
			}
			
			
			
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSub.setBounds(283, 108, 101, 48);
		frame.getContentPane().add(btnSub);
		
		resultField = new JTextField();
		resultField.setBounds(185, 167, 174, 48);
		frame.getContentPane().add(resultField);
		resultField.setColumns(10);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addValue.setText(null);
				subValue.setText(null);
				resultField.setText(null);
				
			}
		});
		btnClear.setForeground(Color.RED);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBounds(232, 237, 89, 23);
		frame.getContentPane().add(btnClear);
	}
}
