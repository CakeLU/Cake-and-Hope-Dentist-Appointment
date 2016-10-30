import java.util.Scanner;

public class DentistAppointment {

	// Attributes
	private Person person;
	private Time time;
	private Date date;
	private int duration;

	// Default Constructor
	public DentistAppointment(String userFirsName, String userLastName, String userZipCode, int userHour, int userMinute, int userMonth, int userDay, int userYear, int userDuration) {
		person = new Person(userFirstName, userLastName, userZipCode);
		time = new Time(userHour, userMinute);
		date = new Date(userMonth, userDay, userYear);
		duration = userDuration;
	}

	// Constructor with no duration argument
	public DentistAppointment(String userFirsName, String userLastName, String userZipCode, int userHour, int userMinute, int userMonth, int userDay, int userYear) {
		this.person = new Person(userFirstName, userLastName, userZipCode);
		this.time = new Time(userHour, userMinute);
		this.date = new Date(userMonth, userDay, userYear);
		this.duration = 30;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}

}