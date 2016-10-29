import java.util.Scanner;
public class Date
{
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
}