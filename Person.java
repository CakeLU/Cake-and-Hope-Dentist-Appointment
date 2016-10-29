public class Person {
	private String firstName;
	private String lastName;
	private String zipCode;

	//default constructor
	public void Person1() {
		firstName = "X";
		lastName = "X";
		zipCode = "X";
	}

	//overloading constructor
	public void Person1(String f, String l, String z) {
		this.firstName = f;
		this.lastName = l;
		this.zipCode = z;
	}

	public void display() {
		System.out.print("" + firstName + "\n" + lastName + "\n" + zipCode);
	}

	public static void main(String [] args) {
		Person item = new Person();
		item.Person1();
		item.Person1(args[0], args[1], args[2]);
	}
}