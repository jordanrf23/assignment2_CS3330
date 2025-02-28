package mu.edu.classDesign;

public class Orc extends MiddleEarthCharacter{
	
	//1.5 X damage against human
	//0 damage against elf and orc
	//normal damage against dwarf and Wizard

	public Orc(String name, double health, double power) {
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean attack(MiddleEarthCharacter target) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getRace() {
		// TODO Auto-generated method stub
		return null;
	}

}
