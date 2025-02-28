package mu.edu.classDesign;

public class Dwarf extends MiddleEarthCharacter{
	
	//1.5 X damage against elf
	//0 damage against wizard and dwarf
	//normal damage against human and orc

	public Dwarf(String name, double health, double power) {
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
