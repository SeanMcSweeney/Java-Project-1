
public class employee {
	
	private String firstName ;
	private String surName ;
	private int staffNumber ;
	private double annualSalary ;

//constructor
//setter	
public employee (String firstName, String surName, int staffNumber, double annualSalary) {

	this.setFirstName(firstName) ; 
	this.setSurName(surName) ;
	this.setStaffNumber(staffNumber) ;
	this.setAnnualSalary(annualSalary) ;
}

public String toString()
{
    return "This employee is called " + getFirstName() + "" + getSurName() 
    + "his Staff number is" + getStaffNumber()
    + "his Annual Salary is" + getAnnualSalary() ;
}

public double calculatePay()
{
	double monthlySalary = (annualSalary / 12);
	return monthlySalary;
}

//getter
public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getSurName() {
	return surName;
}

public void setSurName(String surName) {
	this.surName = surName;
}
public int getStaffNumber() {
	return staffNumber;
}

public void setStaffNumber(int staffNumber) {
	this.staffNumber = staffNumber;
}
public double getAnnualSalary() {
	return annualSalary;
}

public void setAnnualSalary(double annualSalary) {
	this.annualSalary = annualSalary;
}
}