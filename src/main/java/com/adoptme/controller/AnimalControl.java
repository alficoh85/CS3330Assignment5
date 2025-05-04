package main.java.com.adoptme.controller;

import main.java.com.adoptme.model.Pet;
import main.java.com.adoptme.model.Shelter;

public class AnimalControl {
	private Shelter<Pet> shelter;
	
	public boolean adopt(Pet pet) {
		if (pet.isAdopted() == false) {
			pet.setAdopted(true);
			return true;
		}
		return false;
	}
}
