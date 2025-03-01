package mu.edu.classDesign;

public class Orc extends MiddleEarthCharacter{
	
	//1.5 X damage against human
	//0 damage against elf and orc
	//normal damage against dwarf and Wizard

	public Orc(String name, double health, double power) {
		super(name, health, power);
		this.name = name;
		this.health = health;
		this.power = power;
	}

	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if(target instanceof Orc || target instanceof Elf) {
			return false; // no damage is done
		}else if (target instanceof Human) {
			target.setHealth(target.getHealth()-(1.5 * this.power)); //1.5 damage
		}else {
			target.setHealth(target.getHealth()- this.power);//regular damage is done
		}
		return true;
	}

	@Override
	public String getRace() {
		return "Orc";
	}

}
