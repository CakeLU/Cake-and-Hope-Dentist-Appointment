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

	// Function that adds time to a current time
	public void addMinutes(int minutes) {

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


		System.out.println("The time is " + adjustedHours + ":" + adjustedMinutes);
	}

	public static void main(String[] args) {
		Time test1 = new Time(12, 45);
		test1.displayTime();
		test1.addMinutes(240);
		test1.displayTime();
	}

}