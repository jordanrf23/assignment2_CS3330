package mu.edu.classDesign;

public class Dwarf extends MiddleEarthCharacter{
	
	//1.5 X damage against elf
	//0 damage against wizard and dwarf
	//normal damage against human and orc

	public Dwarf(String name, double health, double power) {
		super(name, health, power);
		this.name = name;
		this.health = health;
		this.power = power;
		
	}

	@Override
	public boolean attack(MiddleEarthCharacter target) {

		if(target instanceof Dwarf || target instanceof Wizard) {
			return false; // no damage is done
		}else if (target instanceof Elf) {
			target.setHealth(target.getHealth()-(1.5 * this.power)); //1.5 damage
		}else {
			target.setHealth(target.getHealth()- this.power);//regular damage is done
		}
		return true;
	}

	@Override
	public String getRace() {
		return "Dwarf";
	}

}
