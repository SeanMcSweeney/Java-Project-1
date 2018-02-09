public class Control {

	public static void main(String[] arg)
	{
		employee [] myEmployees = new employee[ 4];
		myEmployees[0]=new employee("James  ", "Shane  ", 400, 21);
		myEmployees[1]=new HourlyEmployee("Jack  ", "Peter  ", 6, 0, 64, 23);
		myEmployees[2]=new EmployeeOnComission("Fred  ", "Larry  ", 211,67,355);

		System.out.println(myEmployees[0].calculatePay());
		System.out.println(myEmployees[1].calculatePay());
		System.out.println(myEmployees[2].calculatePay());

		System.out.println("\n"+myEmployees[0]);
		System.out.println("\n"+myEmployees[1]);
		System.out.println("\n"+myEmployees[2]);
	}
}