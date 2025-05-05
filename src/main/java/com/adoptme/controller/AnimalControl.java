package main.java.com.adoptme.controller;

import main.java.com.adoptme.model.Pet;
import main.java.com.adoptme.model.Shelter;
import main.java.com.adoptme.view.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class AnimalControl {
	private final Shelter<Pet> model;
	private final View view;
	
	public AnimalControl(Shelter<Pet> model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public void initController() {
		refreshPetTable();
		view.getAddButton().addActionListener(e -> onAddPet());
		view.getAdoptButton().addActionListener(e -> onAdoptPet());
		view.getSortComboBox().addActionListener(e -> onSortSelection());
		view.getSaveButton().addActionListener(e -> onSave());
	}
	
	private void onAddPet() {
		
	}
	
	private void onAdoptPet() {
		
	}
	
	private void onSortSelection() {
		
	}
	
	private void onSave() {
		
	}
	
	private void refreshPetTable() {
		
	}
}
