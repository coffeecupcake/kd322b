
public class Program {
	private String name;
	private String code;
	private int women;
	private int men;
	
	public Program(String _name, String _code, int _women, int _men){
		name = _name;
		code = _code;
		women = _women;
		men = _men; 
	}
	
	public String getName(){
		return name;
	}
	
	public String getCode(){
		return code;
	}
	
	public int getWomen(){
		return women;
	}
	
	public int getMen(){
		return men;
	}
	
	public String toString(){
		return name;
	}

}
