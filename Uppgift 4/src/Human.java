
public class Human {
	private Dog dog;
	private String name; 
	
	
	public Human(String fdsa){
		this.name = fdsa;
		

	}
	
	public String getName(){
		return name;
	}
	
	public void buyDog(Dog fart){ //Dog dog
		this.dog = fart;
		
	}	
	public  String getInfo(){ 
		if(dog == null){
			return  getName() + " äger inte en hund "; 
			
		}else{
			return getName() + " äger en hund som heter  " + dog.getName(); 
		}
	}
}
	

