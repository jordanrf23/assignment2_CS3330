package mu.edu.classDesign;

public class Human extends MiddleEarthCharacter{
	
	//1.5 X damage against wizard
	//0 damage against orc and human
	//normal damage against elf and dwarf

	public Human(String name, double health, double power) {
		super(name, health, power);
		this.name = name;
		this.health = health;
		this.power = power;
	}

	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if(target instanceof Human || target instanceof Orc) {
			return false; // no damage is done
		}else if (target instanceof Wizard) {
			target.setHealth(target.getHealth()-(1.5 * this.power)); //1.5 damage
		}else {
			target.setHealth(target.getHealth()- this.power);//regular damage is done
		}
		return true;
	}

	@Override
	public String getRace() {
		return "Human";
	}

}
