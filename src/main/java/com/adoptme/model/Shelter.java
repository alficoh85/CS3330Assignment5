package main.java.com.adoptme.model;

import java.util.Arrays;

public class Shelter<T extends Pet> {
	private T[] pets;
	private int size;

	public Shelter() {
		pets = (T[]) new Pet[0];
		size = 0;
	}
	
	public Shelter(T[] pets) {
		this.pets = (T[]) new Pet[0];
		size = 0;
		for (int i = 0; i < pets.length; i++) {
			if (pets[i] != null) {
				addPet(pets[i]);
			}
		}
	}
	
	public void addPet(T pet) {
		try {
			pets[size] = pet;
		}
		catch (IndexOutOfBoundsException e) {
			resize(size + 1);
			pets[size] = pet;
		}
		size = size + 1;
	}
	
	public boolean removePet(T pet) {
		boolean petFound = false;
		for (int i = 0; i < size; i++) {
			if (petFound ==  false) {
				if (pet == pets[i]) {
					petFound = true;
					if (i+1 < size) {
						pets[i] = pets[i+1];
					}
					else {
						pets[i] = null;
					}
				}
			}
			else {
				if (i+1 < size) {
					pets[i] = pets[i+1];
				}
				else {
					pets[i] = null;
				}
			}
		}
		if (petFound == true) {
			size = size - 1;
			resize(size);
			return true;
		}
		return false;
	}
	
	private void resize(int size) {
		T[] resizeArray = (T[]) new Pet[size];
		for (int i = 0; i < size; i++) {
			resizeArray[i] = null;
		}
        for (int i = 0; i < this.size; i++) {
            resizeArray[i] = pets[i];
        }
        pets = resizeArray;
	}

	@Override
	public String toString() {
		return "Shelter [pets=" + Arrays.toString(pets) + "]";
	}
}