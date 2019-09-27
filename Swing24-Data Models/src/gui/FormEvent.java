package gui;
import java.util.EventObject;

public class FormEvent extends EventObject {

	private String name, occupation, empCat, taxId, gender;
	private int ageCategory;
	private boolean citizenship;

	public FormEvent(Object source) {
		super(source);
	}

	public FormEvent(Object source, String name, String occupation, int ageCat, String empcat, String taxId,
			boolean citizenship, String gender) {
		super(source);

		this.name = name;
		this.occupation = occupation;
		this.ageCategory = ageCat;
		this.empCat = empcat;
		this.taxId = taxId;
		this.citizenship = citizenship;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getAgeCategory() {
		return ageCategory;
	}

	public String getEmploymentCategory() {
		return empCat;
	}

	public String getTaxId() {
		return taxId;
	}

	public boolean isCitizenship() {
		return citizenship;
	}

	public String getGender() {
		return gender;
	}

}
