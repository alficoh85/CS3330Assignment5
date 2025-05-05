package main.java.com.adoptme.controller;

import main.java.com.adoptme.model.Pet;
import main.java.com.adoptme.model.Shelter;
import main.java.com.adoptme.view.View;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
    }
	
	private void onAddPet() {
		try {
			Pet newPet = view.showAddPetDialog();
			if (newPet != null) {
				model.addPet(newPet);
				refreshPetTable();
				view.showMessage("Pet added successfully.");
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
		String criteria = view.getSortComboBox().getSelectedItem().toString();
		Pet[] petsArray = model.getPets();
		int size = model.getSize();
		List<Pet> list = Arrays.stream(petsArray, 0, size).collect(Collectors.toList());
		
		switch(criteria) {
		case "Name":
			list.sort(Comparator.comparing(Pet::getName, String.CASE_INSENSITIVE_ORDER));
			break;
		case "Age":
			list.sort(Comparator.comparingInt(Pet::getAge));
			break;
		case "Species":
			list.sort(Comparator.comparing(Pet::getSpecies, String.CASE_INSENSITIVE_ORDER));
			break;
		default:
		}
		model.setPets(list.toArray(new Pet[list.size()]));
		refreshPetTable();
	}
	
	private void refreshPetTable() {
		Pet[] petsArray = model.getPets();
		int size = model.getSize();
		List<Pet> list = Arrays.stream(petsArray, 0, size).collect(Collectors.toList());
		view.updatePetTable(list);
	}
}
