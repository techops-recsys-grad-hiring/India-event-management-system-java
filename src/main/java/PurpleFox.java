import java.util.HashSet;
import java.util.Set;

public class PurpleFox {
    private UserRegistration userRegistration;
    private Set<EventService> selectedServices;

    public PurpleFox() {
         this.userRegistration = new UserRegistration();
         this.selectedServices = new HashSet<>();
    }

    public boolean registerUser(String username, String password) {
        return userRegistration.register(username, password);
    }

    public void selectService(EventService service) {
        selectedServices.add(service);
    }

    public boolean isServiceSelected(EventService service) {
        return selectedServices.contains(service);
    }
}