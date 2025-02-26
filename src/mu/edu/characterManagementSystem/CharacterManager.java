package mu.edu.characterManagementSystem;

import mu.edu.classDesign.MiddleEarthCharacter;

public class CharacterManager {
	
	MiddleEarthCharacter[] characters;
	public int size;

	/*
	 * will add a character and doubles the array if the size of it is full
	 */
	public boolean addCharacter(MiddleEarthCharacter c) {
		
		return false;
	}
	
	/*
	 * finds the character by name
	 */
	public MiddleEarthCharacter getCharacter(String name) {
		return null;
		
	}
	
	/*
	 * Will fully update the character 
	 * if there is any change will return true
	 * if there is no change or character does not exist then return false
	 */
	public boolean updateCharacter(MiddleEarthCharacter character, String name, int health, int power) {
		return false;
		
	}
	
	/*
	 * will delete the character and shifts the elements in the array
	 */
	public boolean deleteCharacter(MiddleEarthCharacter character) {
		return false;
		
	}
	
	/*
	 * will display all characters at the disposal 
	 */
	public void displayAllCharacters() {
		
	}
}
