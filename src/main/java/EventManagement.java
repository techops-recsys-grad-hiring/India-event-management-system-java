import enums.Budget;
import enums.City;
import enums.EventService;
import enums.OccasionType;

import java.util.Scanner;

public class EventManagement {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PurpleFox purpleFox = new PurpleFox();
        UserRegistration userRegistration = new UserRegistration();

        System.out.println("Welcome to PurpleFox Event Management!");
        System.out.print("Enter username to register: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean isRegistered = userRegistration.register(username, password);
        if (isRegistered) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed. Please try again with valid credentials.");
            return;
        }

        System.out.println("Select a city for your event from the following options:");
        for (City city : City.values()) {
            System.out.println("- " + city);
        }
        System.out.print("Enter your choice: ");
        String cityChoice = scanner.nextLine();
        City selectedCity = City.valueOf(cityChoice.toUpperCase());
        purpleFox.selectCityForVenue(selectedCity);

        System.out.println("Select the type of event from the following options:");
        for (OccasionType occasion : OccasionType.values()) {
            System.out.println("- " + occasion);
        }
        System.out.print("Enter your choice: ");
        String occasionChoice = scanner.nextLine();
        OccasionType selectedOccasion = OccasionType.valueOf(occasionChoice.toUpperCase());
        purpleFox.selectOccasionType(selectedOccasion);

        System.out.println("Select services for your event from the following options:");
        for (EventService service : EventService.values()) {
            System.out.println("- " + service);
        }
        System.out.print("Enter your choice: ");
        String serviceChoice = scanner.nextLine();
        EventService selectedService = EventService.valueOf(serviceChoice.toUpperCase());
        purpleFox.selectService(selectedService);

        System.out.println("Select a budget preference from the following options:");
        for (Budget budget : Budget.values()) {
            System.out.println("- " + budget);
        }
        System.out.print("Enter your choice: ");
        String budgetChoice = scanner.nextLine();
        Budget selectedBudget = Budget.valueOf(budgetChoice.toUpperCase());
        purpleFox.selectBudget(selectedBudget);

        System.out.println("\nEvent Summary:");
        System.out.println("City: " + purpleFox.getSelectedCity());
        System.out.println("Occasion: " + purpleFox.getSelectedEvent());
        System.out.println("Services: " + purpleFox.getSelectedServices());
        System.out.println("Budget: " + purpleFox.getSelectedBudget());
        System.out.println("Thank you for using PurpleFox!");

        scanner.close();
    }
}
