package mu.edu.classDesign;

public abstract class MiddleEarthCharacter {
	
	public String name;
	public double health = 0.0;
	public double power = 0.0;
	
	
	/*
	 * Takes in user's input for name, health, and power and assigns them to existing attributes
	 */
	public MiddleEarthCharacter(String name, double health, double power) {
		super();
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	/*
	 * will find the target for the user, 
	 * on success returns true and lowers health of target
	 * on failure (own race or ineffective) returns false 
	 */
	public abstract boolean attack(MiddleEarthCharacter target);
	
	
	/*
	 * finds and returns race of the character 
	 */
	public abstract String getRace();
	
	
	/*
	 * takes all current details of the user and returns them in terminal
	 */
	public void displayInfo() {
		
		System.out.println("Playing as "+ name);
		System.out.println("Health: " + health);
		System.out.println("Power: " + power);

	}
	
	

}
