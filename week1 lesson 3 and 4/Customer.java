package week1lesson3;

public class Customer {
	private String firstName;
	private String lastName;
	private String socSecurityNumber;
	private Adress billingAdress;
	private Adress shipingAdress;

	Customer(String firstName,String lastName,String socSecurityNumber) {
              this.firstName=firstName;
              this.lastName=lastName;
              this.socSecurityNumber=socSecurityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocSecurityNumber() {
		return socSecurityNumber;
	}

	public void setSocSecurityNumber(String socSecurityNumber) {
		this.socSecurityNumber = socSecurityNumber;
	}

	public Adress getBillingAdress() {
		return billingAdress;
	}

	public void setBillingAdress(Adress billingAdress) {
		this.billingAdress = billingAdress;
	}

	public Adress getShipingAdress() {
		return shipingAdress;
	}

	public void setShipingAdress(Adress shipingAdress) {
		this.shipingAdress = shipingAdress;
	}
	public String toString() {
		return  "firstName "+this.firstName+ "  lastName  "+this.lastName+ "   ssn  " + socSecurityNumber;
		
		} 
}