import java.util.EventObject;

public class FormEvent extends EventObject {

	private String name, occupation;
	private int ageCategory;

	public FormEvent(Object source) {
		super(source);
	}

	public FormEvent(Object source, String name, String occupation, int ageCat) {
		super(source);

		this.name = name;
		this.occupation = occupation;
		this.ageCategory = ageCat;
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
}
