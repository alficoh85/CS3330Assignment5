package main.java.com.adoptme.model;

/** The Pet class is an abstract class that provides the outline for an adoptable pet class */
public abstract class Pet {
    protected int id;
    protected String name;
    protected String type;
    protected String species;
    protected int age;
    protected boolean adopted;
    
    /** Parameterized constructor, creates a new Pet object
     * @param id - The ID of the pet
     * @param name - The name of the pet
     * @param type - The specific animal the pet is (cat, dog, rabbit, etc.)
     * @param species - The specific species of the pet (Golden Retriever, Siamese, German Shepherd, etc.)
     * @param age - How many years old the pet is
     * @param adopted - Whether or not the pet has been adopted */
	public Pet(int id, String name, String type, String species, int age, boolean adopted) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.species = species;
		this.age = age;
		this.adopted = adopted;
	}

	/** Accessor method for id
	 * @return The pet's ID */
	public int getId() {
		return id;
	}
	
	/** Mutator method for id, sets a pet's ID
	 * @param id - The new ID to set the pet to */
	public void setId(int id) {
		this.id = id;
	}
	
	/** Accessor method for name
	 * @return The pet's name */
	public String getName() {
		return name;
	}
	
	/** Mutator method for name, sets a pet's name
	 * @param name - The name to set the pet to */
	public void setName(String name) {
		this.name = name;
	}
	
	/** Accessor method for type
	 * @return The type of pet the pet is */
	public String getType() {
		return type;
	}

	/** Mutator method for type
	 * @param type - The type of pet to set the pet to */
	public void setType(String type) {
		this.type = type;
	}

	/** Accessor method for species
	 * @return The species the pet is set as */
	public String getSpecies() {
		return species;
	}
	
	/** Mutator method for species, sets a pet's species
	 * @param species - The species to set the pet as */
	public void setSpecies(String species) {
		this.species = species;
	}
	
	/** Accessor method for age
	 * @return The age of the pet */
	public int getAge() {
		return age;
	}
	
	/** Mutator method for age
	 * @param age - The age to set the pet as */
	public void setAge(int age) {
		this.age = age;
	}
	
	/** Accessor method for adopted
	 * @return Whether or not the pet is adopted */
	public boolean isAdopted() {
		return adopted;
	}
	
	/** Mutator method for adopted, sets a pet's adopted status
	 * @param adopted - true if the pet has been adopted, false if it hasn't */
	public void setAdopted(boolean adopted) {
		this.adopted = adopted;
	}
}
