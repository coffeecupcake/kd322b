import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;


public class AnimalHouse extends JFrame {
	private Snake plane;
	private Dog nestle;
	private Cat hodor;
	
	private ArrayList<Animal> furbies = new ArrayList<Animal>();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalHouse frame = new AnimalHouse();
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
	public AnimalHouse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		JTextArea textArea = new JTextArea();	
		textArea.setBounds(6, 6, 438, 266);
		contentPane.add(textArea);
		
		furbies.add(new Snake("Boa", 7));
		furbies.add(new Snake("pixelsnake", 2));
		furbies.add(new Snake("Plastorm", 4));
		
		furbies.add(new Cat("Majsan", 2, 4, "Purr"));
		furbies.add(new Cat("Alyasan", 6, 4, "Mjaaauuu"));
		furbies.add(new Cat("Ayla", 8, 5, "purrpurrpurr"));
		
		furbies.add(new Dog("Blanca", 2, 4, "bark bark"));
		furbies.add(new Dog("Ledsen Blanca", 6, 4, "wow wow"));
		furbies.add(new Dog("Blancisvovve", 8, 5, "wšff"));
		
		for(Animal a: furbies){
			textArea.append(a.getInfo() + "\n");
			
		}
		
	}
}
