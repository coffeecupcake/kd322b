package labb1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTree;
import javax.swing.JEditorPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JScrollBar;

public class Unicorn extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	/**
	 * @wbp.nonvisual location=336,-29
	 */
	private final JList list = new JList();
	private JTextField txtAdamApelsin;
	private JTextField textField_1;
	private JTextField txtMumindalen;
	private JTextField txtAdamhotmailcom;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Unicorn frame = new Unicorn();
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
	public Unicorn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 500);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		menuBar.setToolTipText("Hj\u00E4lp");
		setJMenuBar(menuBar);
		
		JMenu mnAkriv = new JMenu("Arkiv");
		mnAkriv.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		menuBar.add(mnAkriv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnAkriv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnAkriv.add(mntmAvsluta);
		
		JMenu mnNewMenu = new JMenu("Medlem");
		mnNewMenu.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnNewMenu.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnNewMenu.add(mntmHittaMedlem);
		
		JMenu mnNewMenu_1 = new JMenu("Hja\u0308lp");
		mnNewMenu_1.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmHjalp = new JMenuItem("Hja\u0308lp");
		mnNewMenu_1.add(mntmHjalp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnNewMenu_1.add(mntmOmProgrammet);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(208, 180, 21, 21);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		panel_1.setBounds(182, 6, 471, 433);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnNamn = new JTextPane();
		txtpnNamn.setForeground(SystemColor.text);
		txtpnNamn.setFont(new Font("Gill Sans", Font.PLAIN, 11));
		txtpnNamn.setBackground(SystemColor.textHighlight);
		txtpnNamn.setBounds(30, 50, 251, 16);
		txtpnNamn.setText("Namn");
		panel_1.add(txtpnNamn);
		
		JTextPane txtpnPersonnummer = new JTextPane();
		txtpnPersonnummer.setForeground(SystemColor.text);
		txtpnPersonnummer.setFont(new Font("Gill Sans", Font.PLAIN, 11));
		txtpnPersonnummer.setBackground(SystemColor.textHighlight);
		txtpnPersonnummer.setBounds(30, 125, 251, 16);
		txtpnPersonnummer.setText("Personnummer");
		panel_1.add(txtpnPersonnummer);
		
		JTextPane txtpnAdress = new JTextPane();
		txtpnAdress.setForeground(SystemColor.text);
		txtpnAdress.setFont(new Font("Gill Sans", Font.PLAIN, 11));
		txtpnAdress.setBackground(SystemColor.textHighlight);
		txtpnAdress.setText("Adress");
		txtpnAdress.setBounds(30, 200, 251, 16);
		panel_1.add(txtpnAdress);
		
		JTextPane txtpnTelefonnummer = new JTextPane();
		txtpnTelefonnummer.setForeground(SystemColor.text);
		txtpnTelefonnummer.setFont(new Font("Gill Sans", Font.PLAIN, 11));
		txtpnTelefonnummer.setBackground(SystemColor.textHighlight);
		txtpnTelefonnummer.setText("Telefonnummer");
		txtpnTelefonnummer.setBounds(30, 350, 251, 16);
		panel_1.add(txtpnTelefonnummer);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setForeground(SystemColor.text);
		txtpnEmail.setFont(new Font("Gill Sans", Font.PLAIN, 11));
		txtpnEmail.setBackground(SystemColor.textHighlight);
		txtpnEmail.setText("Email");
		txtpnEmail.setBounds(30, 275, 251, 16);
		panel_1.add(txtpnEmail);
		
		txtAdamApelsin = new JTextField();
		txtAdamApelsin.setFont(new Font("Gill Sans", Font.PLAIN, 12));
		txtAdamApelsin.setText("Elias 1");
		txtAdamApelsin.setBounds(67, 70, 214, 28);
		panel_1.add(txtAdamApelsin);
		txtAdamApelsin.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Gill Sans", Font.PLAIN, 12));
		textField_1.setText("00000000");
		textField_1.setBounds(67, 145, 214, 28);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		txtMumindalen = new JTextField();
		txtMumindalen.setFont(new Font("Gill Sans", Font.PLAIN, 12));
		txtMumindalen.setText("Mumindalen");
		txtMumindalen.setBounds(67, 220, 214, 28);
		panel_1.add(txtMumindalen);
		txtMumindalen.setColumns(10);
		
		txtAdamhotmailcom = new JTextField();
		txtAdamhotmailcom.setFont(new Font("Gill Sans", Font.PLAIN, 12));
		txtAdamhotmailcom.setText("adam@hotmail.com");
		txtAdamhotmailcom.setBounds(67, 295, 214, 28);
		panel_1.add(txtAdamhotmailcom);
		txtAdamhotmailcom.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Gill Sans", Font.PLAIN, 12));
		textField_4.setText("00000876286");
		textField_4.setBounds(67, 372, 214, 28);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Unicorn.class.getResource("/img/sloth.jpg")));
		lblNewLabel.setBounds(289, 0, 181, 145);
		panel_1.add(lblNewLabel);
		panel.setBounds(629, 416, 30, 29);
		contentPane.add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 6, 169, 434);
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.SOUTH);
		
		JList list_1 = new JList();
		panel_2.add(list_1, BorderLayout.NORTH);
		
		JList list_2 = new JList();
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"Elias 1", "Elias 2 ", "Elias 3", "Elias 4"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel_2.add(list_2, BorderLayout.CENTER);
		
		JScrollBar scrollBar = new JScrollBar();
		panel_2.add(scrollBar, BorderLayout.EAST);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
