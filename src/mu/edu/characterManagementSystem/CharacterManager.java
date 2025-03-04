package mu.edu.characterManagementSystem;

import java.util.Arrays;

import mu.edu.classDesign.MiddleEarthCharacter;

public class CharacterManager {
	
	MiddleEarthCharacter[] characters;
	public int size;
	public int capacity;
	
	public CharacterManager (int capacity) {
		
		this.capacity = capacity;
		this.characters = new MiddleEarthCharacter[capacity];
		this.size = 0;
	}
	
	

	/*
	 * will add a character and doubles the array if the size of it is full
	 */
	public boolean addCharacter(MiddleEarthCharacter c) {
		//not enough room for the new character
		if(size >= capacity) {
			capacity = capacity * 2;
			characters = Arrays.copyOf(characters, capacity);
			return false;
		}
		//there is enough room for the new character
		characters[size++] = c;
		return true;
	}
	
	/*
	 * finds the character by name
	 */
	public MiddleEarthCharacter getCharacter(String name) {
		for(int i = 0; i<size; i++) {
			if(characters[i].getName().equals(name)) {
				return characters[i];
			}
		}
		
		return null;
	}
	
	/*
	 * outputs the array for the characters 
	 */
	public MiddleEarthCharacter[] getAllCharacters() {
		return Arrays.copyOf(characters, size);
	}
	
	/*
	 * Will fully update the character 
	 * if there is any change will return true
	 * if there is no change or character does not exist then return false
	 */
	public boolean updateCharacter(MiddleEarthCharacter character, String name, double health, double power) {
		
		if(character != null) {
			boolean changed = false;
			if(!character.getName().equals(name)) {
				character.setName(name);
				changed = true;
			}
			if(character.getHealth() != health) {
				character.setHealth(health);
				changed = true;
			}
			if(character.getPower() != power) {
				character.setPower(power);
				changed = true;
			}
			return changed;
		}
		return false;
	}
	
	/*
	 * will delete the character and shifts the elements in the array
	 */
	public boolean deleteCharacter(MiddleEarthCharacter character) {
		
		for(int i= 0; i<= size; i++) {
			if(characters[i] == character) {
				System.arraycopy(characters, i + 1, characters, i, size - i -1);
				characters[--size] = null;
				return true;
			}
		}
		return false;
	}
	
	/*
	 * will display all characters at the disposal 
	 */
	public void displayAllCharacters() {
		MiddleEarthCharacter[] characters = getAllCharacters();
		if(characters.length == 0) {
			System.out.println("No characters");
			return;
		}
		for(int i=0; i< size; i++) {
			MiddleEarthCharacter character = characters[i];
				System.out.println(character.getName());
		}
		
	}
}
