import java.util.HashSet;
import java.util.Set;

public class PurpleFox {
    private final UserRegistration userRegistration;
    private final Set<EventService> selectedServices;

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

    public Set<EventService> getSelectedServices() {
        return selectedServices;
    }
}