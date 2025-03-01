package MiddleEarthApp;

import java.util.Scanner;

import mu.edu.characterManagementSystem.CharacterManager;

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
			}
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

	private void addCharacter() {
		// TODO Auto-generated method stub
		
	}


	
	
}
