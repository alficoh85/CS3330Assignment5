package main.java.com.adoptme.model;

import java.util.Comparator;

/** The AgeComparator class is used to make comparisons using the ages of Pet objects. */
public class AgeComparator implements Comparator<Pet>{
    @Override
    public int compare(Pet pet1, Pet pet2) {
        return pet1.age - pet2.age;
    }
}