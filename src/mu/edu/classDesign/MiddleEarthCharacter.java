package mu.edu.classDesign;

public abstract class MiddleEarthCharacter {
	
	public String name;
	public double health = 0.0;
	public double power = 0.0;
	public MiddleEarthCharacter(String name, double health, double power) {
		super();
		this.name = name;
		this.health = health;
		this.power = power;
	}
	public boolean attack(MiddleEarthCharacter target) {
		
		
		if(target != target) {
			health = health - power;
			return true;
		}
		return false;
	}

}
