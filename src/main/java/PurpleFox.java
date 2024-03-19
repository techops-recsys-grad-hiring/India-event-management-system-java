import java.util.HashMap;

public class PurpleFox {
    private HashMap<String, String> users;

    public PurpleFox() {
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
