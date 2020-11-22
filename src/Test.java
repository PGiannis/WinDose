import java.util.*;

public class Test {
	
	/**The method diagnosis will be the first stage in the choice number 1 of the program
	 * where the user will insert the diagnosis of a person */
	
	public static void diagnosis() {
		try {
			System.out.println("Is the person positive to the virus? (true/false)");
			Scanner sc = new Scanner(System.in);
			boolean result = sc.nextBoolean();
			if (result == true) {
				System.out.println("Positive");
		} 	else if  (result == false) {
				System.out.println("Negative");
		}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}
	}
}
	