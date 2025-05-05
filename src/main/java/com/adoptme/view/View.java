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

	public View() {
		super("AdoptMe Shelter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 400);
		setLocationRelativeTo(null);
		
		tableModel= new DefaultTableModel(new Object[] {"ID", "Name", "Type", "Species", "Age"}, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		petTable = new JTable(tableModel);
		add(new JScrollPane(petTable), BorderLayout.CENTER);
		
		JPanel controlPanel = new JPanel();
        addButton = new JButton("Add Pet");
        removeButton = new JButton("Remove Pet");
        sortComboBox = new JComboBox<>(new String[]{"None", "Name", "Age", "Species"});
        controlPanel.add(addButton);
        controlPanel.add(removeButton);
        controlPanel.add(new JLabel("Sort by:"));
        controlPanel.add(sortComboBox);
        add(controlPanel, BorderLayout.NORTH);
	}
	
	public Pet showAddPetDialog() {
		JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JComboBox<String> typeBox = new JComboBox<>(new String[]{"Dog", "Cat", "Rabbit"});
        JTextField speciesField = new JTextField();
        JTextField ageField = new JTextField();
		
        JPanel panel = new JPanel(new GridLayout(0,1));
        panel.add(new Jlabel("ID:")); panel.add(idField);
        panel.add(new JLabel("Name:")); panel.add(nameField);
        panel.add(new JLabel("Type:")); panel.add(typeBox);
        panel.add(new JLabel("Species:")); panel.add(speciesField);
        panel.add(new JLabel("Age:")); panel.add(ageField);
        
        int result = JOptionPane.showConfirmDialog(this, panel, "Add New Pet", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if(result == JOptionPane.OK_OPTION) {
        	try {
        		
        	}
        }
        
        return null;
	}

	public void showMessage(String string) {
		JOptionPane.showMessageDialog(this, message);
	}

	public void showError(String string) {
		JOptionPane.showMessageDialog(this, error,"Error", JOptionPane.ERROR_MESSAGE);;
	}

	public String getSelectedPetId() {
		int row = petTable.getSelectedRow();
		if(row >= 0) {
			return tableModel.getValueAt(row, 0).toString();
		}
		return null;
	}

	public JComboBox<String> getSortComboBox() {
		return sortComboBox;
	}

	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void updatePetTable(List<Pet> list) {
		tableModel.setRowCount(0);
		for(Pet p : list) {
			tableModel.addRow
			(new Object[]{p.getId(), p.getName(), p.getType(), p.getSpecies(), p.getAge()
			});
		}
	}

	public JButton getAddButton() {
		return addButton;
	}

	public Object getRemoveButton() {
		return removeButton;
	}

}
