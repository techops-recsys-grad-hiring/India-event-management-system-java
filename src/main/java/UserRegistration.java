import java.util.HashMap;

public class UserRegistration {
    private HashMap<String, String> users;

    public UserRegistration() {
        users = new HashMap<>();
    }

    public boolean register(String username, String password) {
        if (username.isEmpty() || password.isEmpty() || users.containsKey(username)) {
            return false;
        }
        users.put(username, password);
        return true;
    }
}
