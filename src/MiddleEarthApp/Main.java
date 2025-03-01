package MiddleEarthApp;

import mu.edu.characterManagementSystem.CharacterManager;
import mu.edu.pattern.MiddleEarthCouncil;

public class Main {

	public static void main(String[] args) {
		
		//menu driven interface with new character, view all, update, delete, attack, and exit
		System.out.println("Welcome to the Middle Earth Realm!");
		System.out.println("Outline for you to know before choosing your character.");
		System.out.println("Your class and power dermines what the attack is worth");
		MiddleEarthCouncil council = MiddleEarthCouncil.getInstance();
		CharacterManager characterMangaer = council.getCharacterManager();
		Menu menu = new Menu(characterManager);
		menu.start();

		
	}

}
