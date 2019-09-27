package model;

public class Person {
	
	private static int count=0;
	
	private String name; 
	private String occupation;
	private EmploymentCategory empCat;
	private String taxId;
	private Gender gender;
	private AgeCategory ageCategory;
	private int id;
	private boolean citizenship;
	
	
	
	public Person(String name, String occupation, EmploymentCategory empCat, String taxId, Gender gender,
			AgeCategory ageCategory, boolean citizenship) {
		super();
		this.name = name;
		this.occupation = occupation;
		this.empCat = empCat;
		this.taxId = taxId;
		this.gender = gender;
		this.ageCategory = ageCategory;
		this.citizenship = citizenship;
		
		this.id = count;
		count++;
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
	public EmploymentCategory getEmpCat() {
		return empCat;
	}
	public void setEmpCat(EmploymentCategory empCat) {
		this.empCat = empCat;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public AgeCategory getAgeCategory() {
		return ageCategory;
	}
	public void setAgeCategory(AgeCategory ageCategory) {
		this.ageCategory = ageCategory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isCitizenship() {
		return citizenship;
	}
	public void setCitizenship(boolean citizenship) {
		this.citizenship = citizenship;
	}
	
	
}
