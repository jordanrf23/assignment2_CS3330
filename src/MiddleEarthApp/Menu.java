package MiddleEarthApp;

import java.util.Scanner;

import mu.edu.characterManagementSystem.CharacterManager;
import mu.edu.classDesign.Dwarf;
import mu.edu.classDesign.Elf;
import mu.edu.classDesign.Human;
import mu.edu.classDesign.MiddleEarthCharacter;
import mu.edu.classDesign.Orc;
import mu.edu.classDesign.Wizard;

public class Menu {
	// options for all actions that a user can choose from
	private final CharacterManager characterManager;
	private final Scanner scanner;
	
	public Menu(CharacterManager characterManager) {
		this.characterManager = characterManager;
		this.scanner = new Scanner(System.in);
	}
	
	public void start() {
		while (true) {
			System.out.println("Middle Earth Character Management");
			System.out.println("Choose a number below");
			System.out.println("1. Add Character");
			System.out.println("2. Update Character");
			System.out.println("3. Delete Character");
			System.out.println("4. View All Characters");
			System.out.println("5. Exucute Attacks");
			System.out.println("6. Exit");

			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				addCharacter();
				break;
			case 2:
				updateCharacter();
				break;
			case 3:
				deleteCharacter();
				break;
			case 4: 
				characterManager.displayAllCharacters();
				break;
			case 5:
				executeAttacks();
				break;
			case 6:
				System.out.println("Exiting...");
				return;
			default: 
				System.out.println("Number given was not usable");
			};
		}
	}

	private void executeAttacks() {
		
		
	}
	
	/*
	 * Allows the user to delete a character based on the name they give
	 */
	private void deleteCharacter() {
		System.out.println("Enter character name to delete:");
		String name = scanner.nextLine();
		MiddleEarthCharacter character = characterManager.getCharacter(name);
		
		if(character == null) {
			System.out.println("Character not found.");
			return;
		}
		
		boolean deleted = characterManager.deleteCharacter(character);
		if(deleted) {
			System.out.println("Your character has been deleted.");
		}else {
			System.out.println("No change happened.");
		}
	}
	
	/*
	 * Allows the user to update a character off of the name they give
	 */
	private void updateCharacter() {
		System.out.println("Enter character name to update:");
		String name = scanner.nextLine();
		MiddleEarthCharacter character = characterManager.getCharacter(name);
		
		if(character == null) {
			System.out.println("Character not found.");
			return;
		}
		
		System.out.println("Enter new health:");
		double health = scanner.nextDouble();
		System.out.println("Enter new power:");
		double power = scanner.nextDouble();
		scanner.nextLine();
		
		boolean updated = characterManager.updateCharacter(character, name, health, power);
		if(updated) {
			System.out.println("Your character has been updated.");
		}else {
			System.out.println("No change happened.");
		}
		
	}

	/*
	 * allows the user to create their character with all possible bounds
	 */
	@SuppressWarnings("unused")
	private void addCharacter() {
		System.out.println("Enter Character Name: ");
		String name = scanner.nextLine();
		System.out.println("Enter Health: ");
		double health = scanner.nextDouble();
		System.out.println("Enter Power: ");
		double power = scanner.nextDouble();
		
		System.out.println("Choose Race: (Elf, Dwarf, Human, Orc, or Wizard");
		String race = scanner.nextLine();
		
		MiddleEarthCharacter character = switch (race.toLowerCase()) {
		case "elf":
			new Elf(name, health, power);
		case "dwarf":
			new Dwarf(name, health, power);
		case "human":
			new Human(name, health, power);
		case "orc":
			new Orc(name, health, power);
		case "wizard":
			new Wizard(name, health, power);
		default:
			System.out.println("Class was unreachable");
			yield null;
		};
		
		if (character != null) {
			characterManager.addCharacter(character);
			System.out.println("Character added!");
		}
	}


	
	
}
