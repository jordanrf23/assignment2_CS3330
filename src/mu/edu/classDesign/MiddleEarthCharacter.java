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
	
	
	//getters and setters for the attributes name, health and power that are all to be found from the users input
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
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
