import java.util.ArrayList; /**importing ArrayList*/

public class BikeStore {
	/**Renaming ArrayList to pinkBike*/
	private static ArrayList<Bike> pinkBike = new ArrayList<Bike>();

/**New main class*/
	public static void main(String[] args) {
		/**Add new objects to the ArrayList*/
		addBike("blå", 12, 800);
		addBike("röd", 14, 900);
		addBike("orange", 15, 1000);		
		addBike("grönt", 17, 1100);
		addBike("rosa", 18, 1200);
		addBike("brunt", 20, 1300);
		addBike("gult", 22, 1400);
		addBike("svart", 25, 1500);
		addBike("grå", 27, 1600);
		addBike("lila", 33, 1700);
		
		/**Prints method getAllBikes in the console*/
		System.out.println(getAllBikes());
	}
	
	/**public string for getAllBikes*/
	public static String getAllBikes(){
		/**Set String Bike to begin with ""*/
		String bikeText = "";
		/**Loops through Array*/
		for(Bike B: pinkBike){
			/**add the functions value to the String bikeText*/
			bikeText += B.getColor() + ", " + B.getSizes() + ", " + B.getPrice() + "\n";
		}
		/**returns new value to the bikeText*/
		return bikeText;
	}

	/**Adds a new bike object*/
	public static void addBike(String color, int size, int price){
		pinkBike.add(new Bike(color,size,price));
	}	
}
