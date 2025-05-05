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
		view.getRemoveButton().addActionListener(e -> onRemovePet());
		view.getSortComboBox().addActionListener(e -> onSortSelection());
		view.getSaveButton().addActionListener(e -> onSave());
	}
	
	private void onAddPet() {
		try {
			Pet newPet = view.showAddPetDialog();
			if (newPet != null) {
				model.addPet(newPet);
				refreshPetTable();
				view.showMessage("Pet added successfully.")
			}
		}
		catch(Exception ex) {
			view.showError("Failed to add pet: " + ex.getMessage());
		}
	}
	
	private void onRemovePet() {
		String selectedId = view.getSelectedPetId();
		if(selectedId == null) {
			view.showError("Please select a pet to remove.");
			return;
		}
		Pet[] petsArray = model.getPets();
		int size = model.getSize();
		Pet target = null;
		for(int i=0; i<size; i++) {
			Pet p = petsArray[i];
			if(p!=null && selectedId.equals(p.getId())) {
				target = p;
				break;
			}
		}
		if(target != null && model.removePet(target)) {
			refreshPetTable();
			view.showMessage("Pet removed from shelter.");
		} else {
			view.showError("Unable to remove pet.");
		}
	}
	
	private void onSortSelection() {
		
	}
	
	private void onSave() {
		
	}
	
	private void refreshPetTable() {
		
	}
}
