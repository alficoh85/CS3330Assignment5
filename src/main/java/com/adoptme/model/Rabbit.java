package main.java.com.adoptme.model;

/** The Rabbit class is a subclass of Pet. */
public class Rabbit extends Pet {

    /** Parameterized constructor, creates a new Rabbit object
     * @param id - The ID of the rabbit as a String
     * @param name - The name of the rabbit
     * @param species - The specific species of the rabbit
     * @param age - How many years old the rabbit is
     * @param adopted - Whether or not the rabbit has been adopted */
	public Rabbit(int id, String name, String species, int age, boolean adopted) {
		this.id = Integer.toString(id);
		this.name = name;
		this.type = "Rabbit";
		this.species = species;
		this.age = age;
		this.adopted = adopted;
	}
	
    /** Parameterized constructor, creates a new Rabbit object
     * @param id - The ID of the rabbit as a String
     * @param name - The name of the rabbit
     * @param species - The specific species of the rabbit
     * @param age - How many years old the rabbit is
     * @param adopted - Whether or not the rabbit has been adopted */
	public Rabbit(String id, String name, String species, int age, boolean adopted) {
		this.id = id;
		this.name = name;
		this.type = "Rabbit";
		this.species = species;
		this.age = age;
		this.adopted = adopted;
	}

	@Override
	public String toString() {
		return "Rabbit [id=" + id + ", name=" + name + ", type=" + type + ", species=" + species + ", age=" + age
				+ ", adopted=" + adopted + "]";
	}
	
}
