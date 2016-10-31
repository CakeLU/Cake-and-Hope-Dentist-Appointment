import java.util.Scanner;

public class DentistAppointment {

	// Attributes
	private Person person;
	private Time time;
	private Date date;
	private int duration;
	private String endTime;


	// Default Constructor
	public DentistAppointment(String userFirstName, String userLastName, int userHour, int userMinute, int userMonth, int userDay, int userYear, int userDuration) {
		person = new Person(userFirstName, userLastName);
		time = new Time(userHour, userMinute);
		date = new Date(userMonth, userDay, userYear);
		duration = userDuration;
		endTime = time.addMinutes(duration);
	}

	// Constructor with no duration argument
	public DentistAppointment(String userFirstName, String userLastName, int userHour, int userMinute, int userMonth, int userDay, int userYear) {
		this.person = new Person(userFirstName, userLastName);
		this.time = new Time(userHour, userMinute);
		this.date = new Date(userMonth, userDay, userYear);
		this.duration = 30;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the patient's first name: ");
		String userFirstName = sc.nextLine();
		System.out.print("Please enter the patient's last name ");
		String userLastName = sc.nextLine();
		System.out.print("Please enter the number of the month of the appointment: ");
		int userMonth = sc.nextInt();
		System.out.print("Please enter the date of the appointment: ");
		int userDay = sc.nextInt();
		System.out.print("Please enter the year of the appointment: ");
		int userYear = sc.nextInt();
		System.out.print("Please enter the hour of the appointment: ");
		int userHour = sc.nextInt();
		System.out.print("Please enter the minute of the appointment: ");
		int userMinute = sc.nextInt();
		System.out.print("Please enter the duration of the appointment or enter if it is 30 minutes long. Appointments cannot be longer than 240 minutes. ");
	}

}