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
		// TODO Auto-generated method stub
		
	}

	private void deleteCharacter() {
		// TODO Auto-generated method stub
		
	}

	private void updateCharacter() {
		// TODO Auto-generated method stub
		
	}

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
