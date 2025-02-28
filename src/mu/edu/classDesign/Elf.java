package mu.edu.classDesign;

public class Elf extends MiddleEarthCharacter{
	
	//1.5 X damage against orc
	//0 damage against dwarf and elf
	//normal damage against human and Wizard

	public Elf(String name, double health, double power) {
		super(name, health, power);
		// TODO Auto-generated constructor stub
		this.name = name;
		this.health = health; 
		this.power = power;
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
