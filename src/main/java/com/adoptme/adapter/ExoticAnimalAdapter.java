package main.java.com.adoptme.adapter;

import main.java.com.adoptme.model.ExoticAnimal;
import main.java.com.adoptme.model.Pet;

/** The ExoticAnimalAdapter class allows an ExoticAnimal class to be a subclass of Pet. */
public class ExoticAnimalAdapter extends Pet {

	/** Parameterized constructor for ExoticAnimalAdapter
	 * @param animal - The exotic animal to make a pet
	 * @param adopted - Whether or not the exotic animal has been adopted */
	public ExoticAnimalAdapter(ExoticAnimal animal, boolean adopted) {
		id = animal.getUniqueId();
		name = animal.getAnimalName();
		type = animal.getCategory();
		species = animal.getSubSpecies();
		age = animal.getYearsOld();
		this.adopted = adopted;
	}

	@Override
	public String toString() {
		return "ExoticAnimalAdapter [id=" + id + ", name=" + name + ", type=" + type + ", species=" + species + ", age="
				+ age + ", adopted=" + adopted + "]";
	}

}