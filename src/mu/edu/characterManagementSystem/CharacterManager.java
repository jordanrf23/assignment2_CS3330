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
			capacity= capacity * 2;
			return false;
		}
		//there is enough room for the new character
		characters[size++] =c;
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
			character.name = name;
			character.health = health;
			character.power = power;
			return true;
		}
		
		
		return false;
		
	}
	
	/*
	 * will delete the character and shifts the elements in the array
	 */
	public boolean deleteCharacter(MiddleEarthCharacter character) {
		
		for(int i= 0; i<= size; i++) {
			if(characters[i] == character) {
				System.arraycopy(character, i + 1, character, i, size - i -1);
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
		
		for(int i = 0; i< size; i++) {
			characters[i].displayInfo();
		}
		
	}
}
