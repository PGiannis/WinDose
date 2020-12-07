
import java.util.Scanner;

public class Informations extends Covid_19 {
	int id;
	int age;
	int option;
	String name;
	String surename;
	String positive;
	String negative;
	String sex;
	String Location;
	String State;

	public void elements() {

	}

	public String changeState(String x) {
		this.State = x;
		return State;

	}

	public static void main(String[] args) {
		System.out.println("Διαλέξτε τι θέλετε να κάνετε");
		System.out.println("Πατήστε 1 αν θέλετε να δείτε στοιχεία ενώς ασθενή");
		System.out.println("Πατήστε 2 αν θέλετε να αλλάξετε την κατάσταση ενός ασΘενή");
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		int i = option;
		while (i != 1 && i != 2) {
			System.out.println("Κάτι πήγε στραβά!");
			System.out.println("Παρακαλω εισάγετε ξανά αριθμο");
			int options = input.nextInt();
			i = options;

		}

		if (i == 1) {
			System.out.println("Εισήγαγε ID ασθενή");
			int id = input.nextInt();
			System.out.println();
		} else if (i == 2) {
			System.out.println("Εισήγαγε ID ασθενή");
			int id = input.nextInt();

			System.out.println("Κάτι πήγε στραβά!");
			System.out.println("Παρακαλω εισάγετε ξανά αριθμο");
			int options = input.nextInt();
			options = option;

		}

	}
}