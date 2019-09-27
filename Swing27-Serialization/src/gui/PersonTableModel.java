package gui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Person;

public class PersonTableModel extends AbstractTableModel {
	
	private List<Person> db;
	private String[] colNames = {"Sr no.","Name","Occupation","Gender","Age Category","Employment Category","Indian citizen","Tax id"};
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return colNames[column];
	}

	public void setData(List<Person> db) {
		this.db = db;
	}
	
	@Override
	public int getRowCount() {
		return db.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Person person = db.get(rowIndex);
		
		switch(columnIndex) {
		case 0:
			return person.getId();
		case 1:
			return person.getName();
		case 2:
			return person.getOccupation();
		case 3:
			return person.getGender();
		case 4:
			return person.getAgeCategory();
		case 5:
			return person.getEmpCat();
		case 6:
			return person.isCitizenship();
		case 7:
			return person.getTaxId();
		}
		
		return null;
	}

}
