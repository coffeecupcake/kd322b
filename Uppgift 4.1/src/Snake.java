
public class Snake extends Animal {
	private int scale;
	
	public Snake(String _name, int _scale) {
		super(_name);
		this.scale = _scale;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getInfo(){
		return "Ormen är " + this.scale + " lång och heter " + super.name;
	}
}