import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PimpMyBikeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private BikeStore pimpBike;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextArea textArea;
	private JTextArea txtrColor;
	private JTextArea txtrSize;
	private JTextArea txtrPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PimpMyBikeGUI frame = new PimpMyBikeGUI();
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
	public PimpMyBikeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pimpBike = new BikeStore();
		textField = new JTextField();
		textField.setBounds(45, 183, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Hitta cykel!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BikeStore.addBike(textField.getText(), Integer.parseInt(textField_1.getText()), Integer.parseInt(textField_2.getText()));
				textArea.setText(BikeStore.getAllBikes());
			}
		});
		btnNewButton.setBounds(16, 343, 181, 29);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(45, 240, 134, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(45, 303, 134, 28);
		contentPane.add(textField_2);
		
		textArea = new JTextArea();
		textArea.setBounds(247, 132, 181, 225);
		textArea.setText(BikeStore.getAllBikes());
		contentPane.add(textArea);
		
		txtrColor = new JTextArea();
		txtrColor.setText("F\u00E4rg");
		txtrColor.setBounds(45, 166, 134, 16);
		contentPane.add(txtrColor);
		
		txtrSize = new JTextArea();
		txtrSize.setText("Storlek (tum)");
		txtrSize.setBounds(45, 223, 134, 16);
		contentPane.add(txtrSize);
		
		txtrPrice = new JTextArea();
		txtrPrice.setText("Pris");
		txtrPrice.setBounds(45, 288, 134, 16);
		contentPane.add(txtrPrice);
	}
}
