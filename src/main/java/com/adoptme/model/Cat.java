package main.java.com.adoptme.model;

public class Cat extends Pet {

	public Cat(int id, String name, String type, String species, int age, boolean adopted) {
		super(id, name, type, species, age, adopted);
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + ", type=" + type + ", species=" + species + ", age=" + age
				+ ", adopted=" + adopted + "]";
	}
	
}
