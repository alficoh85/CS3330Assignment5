package main.java.com.adoptme.model;

public class Dog extends Pet {

    /** Parameterized constructor, creates a new Dog object
     * @param id - The ID of the dog as an int
     * @param name - The name of the dog
     * @param species - The specific species of the dog
     * @param age - How many years old the dog is
     * @param adopted - Whether or not the dog has been adopted */
	public Dog(int id, String name, String species, int age, boolean adopted) {
		this.id = Integer.toString(id);
		this.name = name;
		this.type = "Dog";
		this.species = species;
		this.age = age;
		this.adopted = adopted;
	}
	
    /** Parameterized constructor, creates a new Dog object
     * @param id - The ID of the dog as a String
     * @param name - The name of the dog
     * @param species - The specific species of the dog
     * @param age - How many years old the dog is
     * @param adopted - Whether or not the dog has been adopted */
	public Dog(String id, String name, String species, int age, boolean adopted) {
		this.id = id;
		this.name = name;
		this.type = "Dog";
		this.species = species;
		this.age = age;
		this.adopted = adopted;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", type=" + type + ", species=" + species + ", age=" + age
				+ ", adopted=" + adopted + "]";
	}
	
}
