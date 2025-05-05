package main.java.com.adoptme.model;

/** The ExoticAnimal class is used for animals not commonly kept as pets. They cannot be adopted. */
public class ExoticAnimal {
    private String uniqueId;
    private String animalName;
    private String category;
    private String subSpecies;
    private int yearsOld;
    
    /** Parameterized constructor, makes a new ExoticAnimal object
     * @param uniqueId - The ID, unique to a pet's ID, of the exotic animal
     * @param animalName - The name of the exotic animal
     * @param category - The category of animal the exotic animal is a part of (mammal, reptile, bird, etc.)
     * @param subSpecies - The subspecies of animal the exotic animal is under (iguana, toucan, python, etc.)
     * @param yearsOld - The age of the exotic animal */
	public ExoticAnimal(String uniqueId, String animalName, String category, String subSpecies, int yearsOld) {
		this.uniqueId = uniqueId;
		this.animalName = animalName;
		this.category = category;
		this.subSpecies = subSpecies;
		this.yearsOld = yearsOld;
	}

	/** Accessor method for uniqueId
	 * @return The unique ID the exotic animal has */
	public String getUniqueId() {
		return uniqueId;
	}

	/** Accessor method for uniqueId
	 * @param uniqueId - The String to set as the new ID */
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	/** Accessor method for AnimalName
	 * @return The exotic animal's name */
	public String getAnimalName() {
		return animalName;
	}

	/** Mutator method for animalName
	 * @param animalName The name to set the exotic animal to */
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	/** Accessor method for category
	 * @return The category the exotic animal is in */
	public String getCategory() {
		return category;
	}

	/** Mutator method for category
	 * @param category - The category to set for the exotic animal */
	public void setCategory(String category) {
		this.category = category;
	}

	/** Accessor method for subSpecies
	 * @return The subspecies of the exotic animal */
	public String getSubSpecies() {
		return subSpecies;
	}

	/** Mutator method for subSpecies
	 * @param subSpecies - The subspecies to set the exotic animal to */
	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}

	/** Accessor method for yearsOld
	 * @return The age of the exotic animal */
	public int getYearsOld() {
		return yearsOld;
	}

	/** Mutator method for yearsOld
	 * @param yearsOld - The new age of the exotic animal to set */
	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}
}
