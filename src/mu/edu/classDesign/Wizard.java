package mu.edu.classDesign;

public class Wizard extends MiddleEarthCharacter{
	
	//1.5 X damage against dwarf
	//0 damage against human and wizard
	//normal damage against elf and orc

	public Wizard(String name, double health, double power) {
		super(name, health, power);
		this.name = name;
		this.health = health;
		this.power = power;
	}

	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if(target instanceof Wizard || target instanceof Human) {
			return false; // no damage is done
		}else if (target instanceof Dwarf) {
			target.setHealth(target.getHealth()-(1.5 * this.power)); //1.5 damage
		}else {
			target.setHealth(target.getHealth()- this.power);//regular damage is done
		}
		return true;
	}

	@Override
	public String getRace() {
		return "Wizard";
	}

}
