
public class Cat extends Mammal {
	private String purr;
	
	public Cat(String _name, int _fur, int _legs, String _purr) {
		super(_name, _fur, _legs);
		this.purr = _purr; 
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getInfo(){
		return "Katten l�ter " + this.purr + " och heter " + super.name + " och typ har n�gon siffra " + super.fur + " och har " + super.legs + " ben.";
	}
}

