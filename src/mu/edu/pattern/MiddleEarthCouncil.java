package mu.edu.pattern;

import mu.edu.characterManagementSystem.CharacterManager;

public class MiddleEarthCouncil {
	
	private static MiddleEarthCouncil instance;
	private CharacterManager characterManager;
	
	private MiddleEarthCouncil() {
		characterManager = new CharacterManager(5);
	}
	
	
	/*
	 * returns a single instance 
	 */
	public static MiddleEarthCouncil getInstance() {
		
		if(instance == null) {
			instance = new MiddleEarthCouncil();
		}
		
		return instance;
	}
	
	
	/*
	 * provides access to Character Manager
	 */
	public CharacterManager getCharacterManager() {
		return characterManager;
		
	}

}
