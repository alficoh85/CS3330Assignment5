package main.java.com.adoptme.model;

public class Cat extends Pet {

    /** Parameterized constructor, creates a new Cat object
     * @param id - The ID of the cat as an int
     * @param name - The name of the cat
     * @param species - The specific species of the cat
     * @param age - How many years old the cat is
     * @param adopted - Whether or not the cat has been adopted */
	public Cat(int id, String name, String species, int age, boolean adopted) {
		this.id = Integer.toString(id);
		this.name = name;
		this.type = "Cat";
		this.species = species;
		this.age = age;
		this.adopted = adopted;
	}
	
    /** Parameterized constructor, creates a new Cat object
     * @param id - The ID of the cat as a String
     * @param name - The name of the cat
     * @param species - The specific species of the cat
     * @param age - How many years old the cat is
     * @param adopted - Whether or not the cat has been adopted */
	public Cat(String id, String name, String species, int age, boolean adopted) {
		this.id = id;
		this.name = name;
		this.type = "Cat";
		this.species = species;
		this.age = age;
		this.adopted = adopted;
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + ", type=" + type + ", species=" + species + ", age=" + age
				+ ", adopted=" + adopted + "]";
	}
	
}
