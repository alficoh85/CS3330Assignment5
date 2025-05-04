package main.java.com.adoptme.model;

public class Dog extends Pet {

	public Dog(int id, String name, String type, String species, int age, boolean adopted) {
		super(id, name, type, species, age, adopted);
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", type=" + type + ", species=" + species + ", age=" + age
				+ ", adopted=" + adopted + "]";
	}
	
}
