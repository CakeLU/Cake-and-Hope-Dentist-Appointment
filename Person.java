import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private String zipCode;

	//default constructor
	public Person() {
		firstName = "X";
		lastName = "X";
		zipCode = "X";
	}

	//overloading constructor that takes user inputs
	public Person(String f, String l, String z) {
		this.firstName = f;
		this.lastName = l;
		this.zipCode = z;
	}

	// Function allows user to change first name
	public void changeFirstName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the new first name: ");
		this.firstName = sc.nextLine();
	}

	// Function allows user to change last name
	public void changeLastName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the new last name: ");
		this.lastName = sc.nextLine();
	}

	// Function allows user to change zip code
	public void changeZipCode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the new zip code: ");
		this.zipCode = sc.nextLine();
	}

	// Function displays user information
	public void display() {
		System.out.println("" + firstName + "\n" + lastName + "\n" + zipCode);
	}

	public static void main(String [] args) {
		/*Person item = new Person();
		item.Person1();
		item.Person1(args[0], args[1], args[2]);
		item.display();*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		String f = sc.nextLine();
		System.out.print("Please enter your last name: ");
		String l = sc.nextLine();
		System.out.print("Please enter your zip code: ");
		String z = sc.nextLine();
		Person normalPerson = new Person();
		Person cake = new Person(f, l, z);
		normalPerson.display();
		cake.display();
		normalPerson.changeFirstName();
		normalPerson.changeLastName();
		normalPerson.changeZipCode();
		normalPerson.display();
	}
}