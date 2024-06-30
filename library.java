import java.util.Scanner;

public class library {

	public static void main(String[] args) {
		// Code to start up the library system
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		
		do { 
	        displayMenu();
	        int choice;
	        try {
	            choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    addBooks(scanner);
	                    break;
	                case 2:
	                    borrowBooks(scanner);
	                    break;
	                case 3:
	                    returnBooks(scanner);
	                    break;
	                case 4:
	                    System.out.println("Exiting the library system...");
	                    running = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    continue; // Skip the rest of the loop and go back to the menu
	            }
	        } catch (Exception e) {
	            System.out.println("Error: Invalid input. Please try again.");
	            scanner.nextLine(); // Consume the invalid input
	            continue; // Skip the rest of the loop and go back to the menu
	        }
	    } while (running);
		
		// Code to be executed after the loop
	    System.out.println("You have successfully exited the program.");

	}
	
	private static void displayMenu() {
		// Code for menu display  
		System.out.println("1. Add Books");
        System.out.println("2. Borrow Books");
        System.out.println("3. Return Books");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
	}
	
	private static void addBooks(Scanner scanner) {
        // Implement the logic to add books to the library
        System.out.println("Adding books to the library...");
    }

    private static void borrowBooks(Scanner scanner) {
        // Implement the logic to borrow books from the library
        System.out.println("Borrowing books from the library...");
    }

    private static void returnBooks(Scanner scanner) {
        // Implement the logic to return books to the library
        System.out.println("Returning books to the library...");
    }
	
	

}
