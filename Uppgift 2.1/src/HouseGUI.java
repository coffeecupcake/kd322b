import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		
		table.setBounds(6, 6, 438, 266);
		contentPane.add(table);
		House Pink = new House(1937, 300);
		House Yellow = new House (1999, 240);
		House Blue = new House(1967, 120);
		
		House Rainbow[] = new House[9];
		Rainbow[0] = Pink;
		Rainbow[1] = Yellow;
		Rainbow[2] = Blue;

		int cottonCandy = House.getNbrHouses();
		String bubble[] = new String[cottonCandy];		
		for(int i=0; i < cottonCandy; i++){
			bubble[i] = new String("Ett hus byggt "+ Rainbow[i].getYear() + "som Šr " + Rainbow[i].getSize() + "kvm stort.");
		}
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{bubble[0]},
					{bubble[1]},
					{bubble[2]},
					{"Det finns totalt: " + cottonCandy + " stycken hus"},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
				},
				new String[] {
					"Houses"
				}
			));
	}
	}

//


