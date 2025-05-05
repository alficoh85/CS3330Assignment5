package main.java.com.adoptme;

import javax.swing.SwingUtilities;
import main.java.com.adoptme.model.Pet;
import main.java.com.adoptme.model.Shelter;
import main.java.com.adoptme.view.View;
import main.java.com.adoptme.controller.AnimalControl;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Shelter<Pet> shelter = new Shelter<>();
			View view = new View();
			AnimalControl controller = new AnimalControl(shelter, view);
			controller.initController();
			view.setVisible(true);
		}
	}
}