import java.util.Scanner;

public class Date
{
	//Attributes
	private int month;
	private int day;
	private int year;

	// Default Constructor
	public Date() {
		this.month = 1;
		this.day = 1;
		this.year = 2000;
	}

	// Constructor that receives user inputs from the main function
	public Date(int userMonth, int userDay, int userYear) {
		this.month = userMonth;
		this.day = userDay;
		this.year = userYear;
	}

	// This function prompts the user to change the date
	public void setDate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the month's number: ");
		if (sc.hasNextInt()) {
			this.month = sc.nextInt();
		}

		System.out.print("Please enter the day: ");
		if (sc.hasNextInt()) {
			this.day = sc.nextInt();
		}

		System.out.print("Please enter the year: ");
		if (sc.hasNextInt()) {
			this.year = sc.nextInt();
		}
	}

	/*private void setMonth() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter month: ");
		String userMonth = sc.nextLine();
		if (userMonth.equals("")) {
			month = month;
		}
		else {
			int userMonth1 = Integer.parseInt(userMonth);
			month = userMonth1;
		}
	}

	private void setDay() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter day: ");
		String userDay = sc.nextLine();
		if (userDay.equals("")) {
			day = day;
		}
		else {
			int userDay1 = Integer.parseInt(userDay);
			day = userDay1;
		}
	}

	private void setYear() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter year: ");
		String userYear = sc.nextLine();
		if (userYear.equals("")) {
			year = year;
		}
		else {
			int userYear1 = Integer.parseInt(userYear);
			year = userYear1;
		}
	}*/

	/*public void defaultDate() {
		day = 1;
		month = 1;
		year = 2000;
	}

	public void setDate() {
		setMonth();
		setDay();
		setYear();
	}*/

	// Function that displays the object's information
	public void display() {
		System.out.println("" + month + "/" + day + "/" + year);
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		int userMonth = 1;
		int userDay = 1;
		int userYear = 2000;

		// Prompt the user for information to be passed to the non-default constructor
		System.out.print("Please enter the month's number: ");
		if (sc.hasNextInt()) {
			userMonth = sc.nextInt();
		}

		System.out.print("Please enter the day: ");
		if (sc.hasNextInt()) {
			userDay = sc.nextInt();
		}

		System.out.print("Please enter the year: ");
		if (sc.hasNextInt()) {
			userYear = sc.nextInt();
		}

		Date date1 = new Date(userMonth, userDay, userYear);
		Date date2 = new Date();
		date1.display();
		date2.display();
		date1.setDate();
		date2.setDate();
		date1.display();
		date2.display();
		/*item.defaultDate();
		item.setDate();
		item.display();*/
	}
}