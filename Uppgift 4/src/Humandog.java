import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Humandog extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Human getHuman; 
	private Dog getDog; 
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Humandog frame = new Humandog();
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
	public Humandog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length() < 3){
					textField_3.setText("MAYDAYYYMAYDAAAY");					
				}else{
					getHuman = new Human(textField.getText());
				}
				
			}
		});
		btnNewButton.setBounds(35, 59, 117, 29);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(168, 59, 134, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBuyDog = new JButton("Buy dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(getHuman == null){
					textField_3.setText("MAYDAYYYMAYDAAAY");				
				}else{
				getHuman.buyDog(getDog = new Dog(textField_1.getText()));
				}
			}
		});
		btnBuyDog.setBounds(35, 110, 117, 29);
		contentPane.add(btnBuyDog);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(168, 110, 134, 29);
		contentPane.add(textField_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(35, 213, 359, 29);
		contentPane.add(separator);
		
		JLabel lblInfo = new JLabel("Information");
		lblInfo.setBounds(36, 198, 112, 16);
		contentPane.add(lblInfo);
		
		JButton btnPrintInfo = new JButton("print info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText(getHuman.getInfo());
			}
		});
		btnPrintInfo.setBounds(168, 151, 134, 29);
		contentPane.add(btnPrintInfo);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(35, 298, 359, 29);
		contentPane.add(separator_1);
		
		JLabel lblError = new JLabel("Error");
		lblError.setBounds(36, 283, 112, 16);
		contentPane.add(lblError);
		
		JLabel lblHumanDog = new JLabel("Human & dog");
		lblHumanDog.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblHumanDog.setBounds(36, 18, 134, 29);
		contentPane.add(lblHumanDog);
		
		textField_2 = new JTextField();
		textField_2.setBounds(35, 226, 359, 45);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(35, 311, 359, 42);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
