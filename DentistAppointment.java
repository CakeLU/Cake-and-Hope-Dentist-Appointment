import java.util.Scanner;

public class DentistAppointment {

	// Attributes
	private Person person;
	private Time time;
	private Date date;
	private int duration;
	private Time endTime;


	// Default Constructor
	public DentistAppointment(String userFirstName, String userLastName, int userHour, int userMinute, int userMonth, int userDay, int userYear, int userDuration) {
		person = new Person(userFirstName, userLastName, "X");
		time = new Time(userHour, userMinute);
		date = new Date(userMonth, userDay, userYear);
		endTime = new Time(userHour, userMinute);
		if (userDuration > 240) {
			duration = 240;
		}
		else {
			duration = userDuration;
		}
	}

	// Constructor with no duration argument
	public DentistAppointment(String userFirstName, String userLastName, int userHour, int userMinute, int userMonth, int userDay, int userYear) {
		person = new Person(userFirstName, userLastName, "X");
		time = new Time(userHour, userMinute);
		date = new Date(userMonth, userDay, userYear);
		duration = 30;
		endTime = new Time(userHour, userMinute);
	}

	// Function that displays DentistAppointment information
	public void displayInfo() {
		person.display();
		date.display();
		System.out.print("This appointment will be at ");
		time.displayTime();
		System.out.print("The end of the appointment will be at ");
		endTime.addMinutes(this.duration);
		endTime.displayTime();
		System.out.println("The duration of this appointment will be " + this.duration + " minutes.");
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DentistAppointment[] appointmentsList = new DentistAppointment[3];
		DentistAppointment tmp;

		// This loop will create three dentist appointment objects and store them as it prompts the user for inputs
		for (int i = 0; i < appointmentsList.length; i++) {
			System.out.print("Please enter the patient's first name: ");
			String userFirstName = sc.nextLine();
			System.out.print("Please enter the patient's last name ");
			String userLastName = sc.nextLine();
			System.out.print("Please enter the number of the month of the appointment: ");
			int userMonth = sc.nextInt();
			System.out.print("Please enter the day of the appointment: ");
			int userDay = sc.nextInt();
			System.out.print("Please enter the year of the appointment: ");
			int userYear = sc.nextInt();
			System.out.print("Please enter the hour of the appointment: ");
			int userHour = sc.nextInt();
			System.out.print("Please enter the minute of the appointment: ");
			int userMinute = sc.nextInt();
			sc.nextLine();
			System.out.print("Please enter the duration of the appointment or press 'enter' if it is 30 minutes long. Appointments cannot be longer than 240 minutes. ");
			String userDuration = sc.nextLine();
			System.out.println("");

			// New object creation based on user input for duration
			if (userDuration.equals("")) {
				appointmentsList[i] = new DentistAppointment(userFirstName, userLastName, userHour, userMinute, userMonth, userDay, userYear);
			}
			else {
				int userduration = Integer.parseInt(userDuration);
				appointmentsList[i] = new DentistAppointment(userFirstName, userLastName, userHour, userMinute, userMonth, userDay, userYear, userduration);
			}
		}

		// Display all information
		for (int i = 0; i < appointmentsList.length; i++) {
			appointmentsList[i].displayInfo();
		}
	}

}