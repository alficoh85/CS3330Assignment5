package main.java.com.adoptme.model;

import java.util.Arrays;

/** The Shelter class takes a Pet class or any of its subclasses and stores them in an array that is resized dynamically. */
public class Shelter<T extends Pet> {
	private T[] pets;
	private int size;

	/** Default constructor, makes a new Shelter object with no pets */
	public Shelter() {
		pets = (T[]) new Pet[0];
		size = 0;
	}
	
	/** Parameterized constructor, takes a Pet array and adds any non-null pets into the shelter
	 * @param pets - The array of pets to add to the shelter */
	public Shelter(T[] pets) {
		this.pets = (T[]) new Pet[0];
		size = 0;
		for (int i = 0; i < pets.length; i++) {
			if (pets[i] != null) {
				addPet(pets[i]);
			}
		}
	}
	
	/** This method adds a pet to the shelter and resizes the array.
	 * @param pet - The pet to add to the shelter */
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
	
	/** This method removes a pet from the shelter and resizes the array.
	 * @param pet - The pet to remove from the shelter
	 * @return true on successful removal and false if the pet could not be found in the shelter */
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
	
	/** Accessor method for pet array
	 * @return The array of pets in the shelter */
	public T[] getPets() {
		return pets;
	}

	/** Mutator method for pet array, sets the shelter to a new array of pets, adds the non-null members of the array to the shelter and sizes the array accordingly
	 * @param pets - The array of pets to set in the shelter */
	public void setPets(T[] pets) {
		for (int i = 0; i < size; i++) {
			this.pets[i] = null;
		}
		size = 0;
		resize(size);
		for (int i = 0; i < pets.length; i++) {
			if (pets[i] != null) {
				addPet(pets[i]);
			}
		}
	}

	/** Accessor method for size
	 * @return the number of pets in the shelter */
	public int getSize() {
		return size;
	}
	
	/** Method that finds the index of a given pet
	 * @param pet - The Pet object to find the index of
	 * @return The index of the pet in the array or -1 on failure */
	public int getIndex(T pet) {
		for (int i = 0; i < size; i++) {
			if (pets[i] == pet) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return "Shelter [pets=" + Arrays.toString(pets) + "]";
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
	
}