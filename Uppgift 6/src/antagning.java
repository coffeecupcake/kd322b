import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;


public class antagning extends JFrame {
	private Document doc; 
	private JPanel contentPane;
	private ArrayList<Program> programsList = new ArrayList<Program>();
	private JComboBox comboBox;
	private Bargraph derp; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					antagning frame = new antagning();
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
	public antagning() {
		doc = openXmlFile("ht2013_antagning.xml");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		derp = new Bargraph();
		derp.setBounds(0, 136, 450, 142);
		contentPane.add(derp);
		
		JList list = new JList();
		list.setModel(new AbstractListModel(){
			String[] value = new String[]{
					"fšrsta elementet (rooten)" + doc.getFirstChild().getNodeName(), "antal program " + loadAllPrograms().size()				
			};

			@Override
			public Object getElementAt(int index) {
				return value[index];
	
			}

			@Override
			public int getSize() {
				return value.length;
				
			}
			
		});
		list.setBounds(6, 6, 438, 67);
		
		contentPane.add(list);
		
		
		
		comboBox = new JComboBox();
		comboBox.setBounds(6, 73, 375, 51);
		comboBox.setModel(new DefaultComboBoxModel(loadAllPrograms().toArray()));
		Program bart = (Program) comboBox.getSelectedItem();
		derp.updateValues(bart.getWomen(), bart.getMen());
		comboBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				Program program = (Program) comboBox.getSelectedItem();
				derp.updateValues(program.getWomen(), program.getMen());
				repaint();
				
				
			}
		});
		contentPane.add(comboBox);
		
	}
	/** 
	 * Opens the given XML file as DOM. 
	 * 
	 * @param fileName 
	 * The filename of the XML file (make sure to copy this to your 
	 * Eclipse project) 
	 * @return A Document instance containing the given XML file. 
	 */ 
	private Document openXmlFile(String fileName) { 
	 Document doc = null; 
	 try { 
	 File fXmlFile = new File(fileName); 
	 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
	 DocumentBuilder dBuilder = dbFactory.newDocumentBuilder(); 
	 doc = dBuilder.parse(fXmlFile); 
	 doc.getDocumentElement().normalize(); 
	 } catch (Exception e) { 
	 e.printStackTrace(); 
	 } 
	 return doc; 
	}
	
	private ArrayList<Program> loadAllPrograms() { 
		ArrayList<Program> output = new ArrayList<Program>();

		NodeList programs = doc.getElementsByTagName("Program"); for (int i = 0; i < programs.getLength(); i++) {
			Node node = programs.item(i); Element elm = (Element) node;
			String name = elm.getElementsByTagName("name").item(0).getTextContent();
			String code = elm.getElementsByTagName("code").item(0).getTextContent();
			int women =	Integer.parseInt(elm.getElementsByTagName("women").item(0).getTextContent());
			int men = Integer.parseInt(elm.getElementsByTagName("men").item(0).getTextContent());		 
			Program program = new Program(name, code, women, men); output.add(program);
		} 
		return output;
	}
}
