import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;


public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Calculator methLab; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setForeground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 535);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setForeground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		methLab = new Calculator();
		textField = new JTextField();
		textField.setBounds(26, 48, 294, 103);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				methLab.clear();
				int x = methLab.getOperand();
				textField.setText(String.valueOf(x));
			}
		});
		btnX.setBounds(26, 391, 90, 45);
		contentPane.add(btnX);
		
		JButton button = new JButton("7");
		button.setBackground(new Color(255, 192, 203));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				methLab.numberButtonPressed(7);
				int x = methLab.getOperand();
				textField.setText(String.valueOf(x));
			}
		});
		button.setBounds(26, 334, 90, 45);
		contentPane.add(button);
		
		JButton button_2 = new JButton("4");
		button_2.setBackground(new Color(255, 192, 203));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				methLab.numberButtonPressed(4);
				int x = methLab.getOperand();
				textField.setText(String.valueOf(x));
			}
		});
		button_2.setBounds(26, 277, 90, 45);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("1");
		button_3.setBackground(new Color(255, 192, 203));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				methLab.numberButtonPressed(1);
				int x = methLab.getOperand();
				textField.setText(String.valueOf(x));
			}
		});
		button_3.setBounds(26, 220, 90, 45);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("+");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				methLab.plus();
				String x = methLab.getOperator();
				textField.setText(x);
			}
		});
		button_4.setBounds(26, 163, 90, 45);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("-");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				methLab.minus();
				String x = methLab.getOperator();
				textField.setText(x);
			}
		});
		button_5.setBounds(128, 163, 90, 45);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.setBackground(new Color(255, 192, 203));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				methLab.numberButtonPressed(2);
				int x = methLab.getOperand();
				textField.setText(String.valueOf(x));
			}
		});
		button_6.setBounds(128, 220, 90, 45);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("5");
		button_7.setBackground(new Color(255, 192, 203));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				methLab.numberButtonPressed(5);
				int x = methLab.getOperand();
				textField.setText(String.valueOf(x));
			}
		});
		button_7.setBounds(128, 277, 90, 45);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setBackground(new Color(255, 192, 203));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				methLab.numberButtonPressed(8);
				int x = methLab.getOperand();
				textField.setText(String.valueOf(x));
			}
		});
		button_8.setBounds(128, 334, 90, 45);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.setBackground(new Color(255, 192, 203));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				methLab.numberButtonPressed(0);
				int x = methLab.getOperand();
				textField.setText(String.valueOf(x));
			}
		});
		button_9.setBounds(128, 391, 90, 45);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				methLab.mult();
				String x = methLab.getOperator();
				textField.setText(x);
			}
		});
		button_10.setBounds(230, 163, 90, 45);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("3");
		button_11.setBackground(new Color(255, 192, 203));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				methLab.numberButtonPressed(3);
				int x = methLab.getOperand();
				textField.setText(String.valueOf(x));
			}
		});
		button_11.setBounds(230, 220, 90, 45);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("6");
		button_12.setBackground(new Color(255, 192, 203));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				methLab.numberButtonPressed(6);
				int x = methLab.getOperand();
				textField.setText(String.valueOf(x));
			}
		});
		button_12.setBounds(230, 277, 90, 45);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("9");
		button_13.setBackground(new Color(255, 192, 203));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				methLab.numberButtonPressed(9);
				int x = methLab.getOperand();
				textField.setText(String.valueOf(x));
			}
		});
		button_13.setBounds(230, 334, 90, 45);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_14.setBounds(230, 391, 90, 45);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				methLab.equals();
				int x = methLab.getResult();
				textField.setText(String.valueOf(x));
			}
		});
		button_15.setBounds(26, 448, 294, 45);
		contentPane.add(button_15);
	}
	public void upDateField(){
		textField.validate();
		textField.setText(methLab.getOperand() +  methLab.getOperator() + "" + methLab.getResult());
		
		
	}
}
