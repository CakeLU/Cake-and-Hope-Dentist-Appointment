import java.util.Scanner;

public class Time {

	// Class attributes
	private int hours;
	private int minutes;

	// Default constructor with only hours argument
	public Time(int hours) {

		if (hours > 23) {
			this.hours = 23;
			this.minutes = 59;
		}

		else {
			this.hours = hours;
			this.minutes = 0;
		}
	}

	// Optional constructor with hours and minutes arguments
	public Time(int hours, int minutes) {

		// Series of conditionals check if arguments exceed maximum values and
		// default to these values whenever exceeded.
		if (hours > 23 && minutes > 59) {
			this.hours = 23;
			this.minutes = 59;
		}

		else if (minutes > 59) {
			this.hours = hours;
			this.minutes = 59;
		}

		else if (hours > 23) {
			this.hours = 23;
			this.minutes = minutes;
		}

		else {
			this.hours = hours;
			this.minutes = minutes;
		}
	}

	//Function that changes the time
	public void changeTime() {
		Scanner sc = new Scanner(System.in);

		System.out.println("What would you like to change the hour to?");
		// this.hours = sc.nextInt();
		int newHour = sc.nextInt();

		if (newHour > 23) {
			newHour %= 24;
		}

		System.out.println("What would you like to change the minute to?");
		// this.minutes = sc.nextInt();
		int newMinute = sc.nextInt();

		if (newMinute > 59) {
			newMinute %= 60;
		}
	}

	// Function that adds time to a current time
	public void addMinutes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much time would you like to add?");

		int minutes = 0;
		if (sc.hasNextInt()) {
			minutes = sc.nextInt();
		}

		this.minutes += minutes;
		int addtionalHours = 0;

		// This statement adjusts hours and minutes based on amount of added time
		if (this.minutes >= 60) {
			addtionalHours = (int) Math.floor((double) this.minutes / (double) 60);
			this.minutes %= 60;
			this.hours += addtionalHours;

			// This statement adjusts hours if it exceed 23
			if (this.hours >= 24) {
				this.hours -= 24;
			}

		}
	}

	// Function that takes a printed time and returns it as an array of two ints
	// public int[] printToInt(String printTime) {
		
	// }

	// Function that adjusts time format and displays it
	public void displayTime() {

		String adjustedHours, adjustedMinutes;

		if (this.hours < 10) {
			adjustedHours = "0" + this.hours;
		}

		else {
			adjustedHours = Integer.toString(this.hours);
			adjustedMinutes = Integer.toString(this.minutes);
		}

		if (this.minutes < 10) {
			adjustedMinutes = "0" + this.minutes;
		}

		else {
			adjustedHours = Integer.toString(this.hours);
			adjustedMinutes = Integer.toString(this.minutes);
		}

		String printTime = adjustedHours + ":" + adjustedMinutes;
		System.out.println("The time is " + printTime);
	}

	public static void main(String[] args) {
		Time test1 = new Time(12, 45);
		test1.displayTime();
		test1.addMinutes();
		test1.displayTime();
		test1.changeTime();
		test1.displayTime();
	}

}