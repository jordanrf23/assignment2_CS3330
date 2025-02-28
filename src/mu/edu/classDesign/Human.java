package mu.edu.classDesign;

public class Human extends MiddleEarthCharacter{
	
	//1.5 X damage against wizard
	//0 damage against orc and human
	//normal damage against elf and dwarf

	public Human(String name, double health, double power) {
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
