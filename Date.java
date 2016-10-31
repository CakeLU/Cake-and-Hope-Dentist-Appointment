import java.util.Scanner;
public class Date
{
	private int month;
	private int day;
	private int year;

	public Date() {
		month = 1;
		day = 1;
		year = 2000;
	}

	public Date(int f, int l, int z) {
		this.month = f;
		this.day = l;
		this.year = z;
	}

	public void display() {
		System.out.print("" + month + "/" + day + "/" + year);
	}

public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter month: ");
	String f = sc.nextLine();
	System.out.print("Enter day: ");
	String l = sc.nextLine();
	System.out.print("Enter year: ");
	String z = sc.nextLine();

	if (f.equals("") && l.equals("") && z.equals("")) {
		Date item = new Date();
		item.display();
	}
	else {
		int a = Integer.parseInt(f);
		int b = Integer.parseInt(l);
		int c = Integer.parseInt(z);
		Date item = new Date(a, b, c);
		item.display();
	}
	
}

	/*
	//Attributes
	private int month;
	private int day;
	private int year;

	private void setMonth() {
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
	}

	public void defaultDate() {
		day = 1;
		month = 1;
		year = 2000;
	}

	public void setDate() {
		setMonth();
		setDay();
		setYear();
	}

	public void display() {
		System.out.print("" + month + "/" + day + "/" + year);
	}

	public static void main(String [] args) {
		Date item = new Date();
		item.defaultDate();
		item.setDate();
		item.display();
	}
	*/
}