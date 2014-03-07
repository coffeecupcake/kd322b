//Klass  
public class House {
//instansvariabel 
	private int year;
//instansvariabel 
	private int size;
	
//instansvariabel  
	private static int nbrOfHouses;
//Klassvariabel - "Final anger att en klass inte kan utvidgas genom arv, att en metod inte kan šverskuggas eller att en variabel Šr en konstant."
	public static final int MIN_SIZE =10;
//Konstruktor
	public House(int _year,int _size){
		year = _year;
		size = _size;
		nbrOfHouses++;
	}

//klassmetod
	public static int getNbrHouses(){
		return nbrOfHouses;
		
	}
	
	//instansmetoder
	public int getYear(){
		return year;
		//diverse kod
		
		} 
	public int getSize(){
		return size;
		//diverse kod
		}
}