package main.java.com.adoptme.view;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import main.java.com.adoptme.model.Pet;
import main.java.com.adoptme.model.Dog;
import main.java.com.adoptme.model.Cat;
import main.java.com.adoptme.model.Rabbit;

public class View extends JFrame{
	private final JTable petTable;
	private final DefaultTableModel tableModel;
	private final JButton addButton;
	private final JButton removeButton;
	private final JComboBox<String> sortComboBox;

	public Pet showAddPetDialog() {
		// TODO Auto-generated method stub
		return null;
	}

	public void showMessage(String string) {
		JOptionPane.showMessageDialog(this, message);
	}

	public void showError(String string) {
		JOptionPane.showMessageDialog(this, error,"Error", JOptionPane.ERROR_MESSAGE);;
	}

	public String getSelectedPetId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getSortComboBox() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void updatePetTable(List<Pet> list) {
		// TODO Auto-generated method stub
		
	}

	public Object getAddButton() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getRemoveButton() {
		// TODO Auto-generated method stub
		return null;
	}

}
