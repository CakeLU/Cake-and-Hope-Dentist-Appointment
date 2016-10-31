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

	//overloading constructor
	public Person(String f, String l, String z) {
		this.firstName = f;
		this.lastName = l;
		this.zipCode = z;
	}

	public void display() {
		System.out.print("" + firstName + "\n" + lastName + "\n" + zipCode);
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String f = sc.nextLine();
		System.out.print("Enter last name: ");
		String l = sc.nextLine();
		System.out.print("Enter zip code: ");
		String z = sc.nextLine();

		if (f.equals("") && l.equals("") && z.equals("")) {
			Person item = new Person();
			item.display();
		}
		else {
			Person item = new Person(f, l, z);
			item.display();
		}
	
	}
}