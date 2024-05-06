
public class PurpleFox {
    private UserRegistration userRegistration;

    public PurpleFox() {
         userRegistration = new UserRegistration();
    }

    public boolean registerUser(String username, String password) {
        return userRegistration.register(username, password);
    }

}