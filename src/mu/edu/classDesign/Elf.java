package mu.edu.classDesign;

public class Elf extends MiddleEarthCharacter{
	
	//1.5 X damage against orc
	//0 damage against dwarf and elf
	//normal damage against human and Wizard

	public Elf(String name, double health, double power) {
		super(name, health, power);
		this.name = name;
		this.health = health; 
		this.power = power;
	}

	@Override
	public boolean attack(MiddleEarthCharacter target) {

		if(target instanceof Elf || target instanceof Dwarf) {
			return false; // no damage is done
		}else if (target instanceof Orc) {
			target.setHealth(target.getHealth()-(1.5 * this.power)); //1.5 damage
		}else {
			target.setHealth(target.getHealth()- this.power);//regular damage is done
		}
		return true;
	}

	@Override
	public String getRace() {
		return "Elf";
	}

}
