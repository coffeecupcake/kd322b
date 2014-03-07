import java.util.ArrayList;
/**
 * 
 * @author katarina karnekull
 *
 */

public class Main {
	private Bike bikerepair; //Deklarerar klass variabel 

	public static void main(String[] args) {
		// Create a ArrayList, 10 bikes
	ArrayList<Bike>  bikeList = new ArrayList<Bike>();
	bikeList.add(new Bike("blå", 12, 800));
	bikeList.add(new Bike("röd", 14, 900));
	bikeList.add(new Bike("orange", 15, 1000));
	bikeList.add(new Bike("grönt", 17, 1100));
	bikeList.add(new Bike("rosa", 18, 1200));
	bikeList.add(new Bike("brunt", 20, 1300));
	bikeList.add(new Bike("gult", 22, 1400));
	bikeList.add(new Bike("svart", 25, 1500));
	bikeList.add(new Bike("grå", 27, 1600));
	bikeList.add(new Bike("lila", 33, 1700));
	
	int i = 0;
	for(Bike B: bikeList){	
		i++;
			System.out.println("Cykeln " + i + " har färgen " + B.getColor() + " och är " + B.getSizes() + " tum "  + " samt kostar " + B.getPrice() + " Sek");
		}

	}
}
//do something with f


	