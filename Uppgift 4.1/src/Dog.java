
public class Dog extends Mammal {
	private String bark;
	
	public Dog(String _name, int _fur, int _legs, String _bark) {
		super(_name, _fur, _legs);
		this.bark  = _bark;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String getInfo(){
		return "Hunden l�ter " + this.bark + " och heter " + super.name + " och typ har n�gon siffra " + super.fur + " och har " + super.legs + " ben.";
	}

}
