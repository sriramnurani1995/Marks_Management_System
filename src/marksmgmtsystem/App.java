package marksmgmtsystem;

/**
 * Main class for the Marks Management System application. App.java is the entry
 * point for the application, initializing the menu and handling any exceptions.
 */
public class App {
    public static void main(String[] args) {

        try {
            // Initialize and display the main menu of the application
            Menu marksManagementSystemMenu = new Menu();
            marksManagementSystemMenu.displayMenu();
        } catch (Exception e) {
            //Exception handling to catch unexpected runtime errors
            System.out.println("An unexpected error occurred in the application. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
