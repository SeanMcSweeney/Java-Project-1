public class HourlyEmployee extends employee{

	private double hoursWorked;
	private double hourlyPay;
	
	public HourlyEmployee (String firstName, String surName, int staffNumber, double annualSalary,double hoursWorked,double hourlyPay ) {
		super(firstName, surName, staffNumber, annualSalary);
		this.hoursWorked = hoursWorked ; 
		this.hourlyPay = hourlyPay ;
	}
	public double calculatePay() {
	double pay = (hoursWorked * hourlyPay); 
	return pay;
	}
	public String toString()
	{
		return super.toString() + "\n" + "pay =" + calculatePay() ;
	}
}