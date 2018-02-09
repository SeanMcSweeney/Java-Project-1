public class EmployeeOnComission extends employee {
	
	private double comissionEarned;
	
	public EmployeeOnComission (String firstName, String surName, int staffNumber, double annualSalary, double comissionEarned) {
		super(firstName, surName, staffNumber, annualSalary);
		this.comissionEarned = comissionEarned ; 
	}
	
	public double calculatePay()
	{
		double monthlySalary = (getAnnualSalary() / 12 + comissionEarned);
		return monthlySalary;
	}
	public String toString()
	{
		return super.toString() + "\n" + "pay =" + calculatePay() ;
	}
}