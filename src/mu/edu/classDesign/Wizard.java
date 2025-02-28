package mu.edu.classDesign;

public class Wizard extends MiddleEarthCharacter{
	
	//1.5 X damage against dwarf
	//0 damage against human and wizard
	//normal damage against elf and orc

	public Wizard(String name, double health, double power) {
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
