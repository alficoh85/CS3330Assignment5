package main.java.com.adoptme.model;

import java.util.Comparator;

/** The AgeComparator class is used to make comparisons using the species of Pet objects. */
public class SpeciesComparator implements Comparator<Pet>{
    @Override
    public int compare(Pet pet1, Pet pet2) {
        return pet1.species.compareTo(pet2.species);
    }
}
