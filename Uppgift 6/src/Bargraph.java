import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;


public class Bargraph extends JComponent {
	private int women;
	private int men; 
	private float procentWomen;
	private float procentMen;
	private float total;
	private int womenHeight;
	private int menHeight; 
	
	public void updateValues(int _women, int _men){
		women = _women;
		men = _men;
		
		total = women + men;
		procentWomen = women/total;
		procentMen = men/total;
		
		System.out.println("Antal kivnnor: " + procentWomen + ", antal män: " + procentMen);
		womenHeight = (int) (procentWomen*getHeight());
		menHeight = (int) (procentMen*getHeight());
		
		
		//getHeight();
		
	}
	protected void paintComponent(Graphics shemale){
		super.paintComponent(shemale);
		shemale.setColor(Color.PINK);
		shemale.fillRect(0, getHeight()-womenHeight, getWidth()/2,womenHeight); 
		shemale.setColor(Color.orange);
		shemale.fillRect(getWidth()/2, getHeight()-menHeight, getWidth()/2,menHeight);
		shemale.setColor(Color.white);
		shemale.setFont(shemale.getFont().deriveFont(12));
		shemale.drawString("Totalt sökande: " + total, 0, getHeight());
	}
	
}


