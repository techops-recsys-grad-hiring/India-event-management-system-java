import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    @Test
    void shouldReturnTrueIfAUserIsRegistered() {
        UserRegistration userRegistration = new UserRegistration();

        boolean registeredUser = userRegistration.register("Aditya", "Aditya369");

        assertTrue(registeredUser);
    }

    @Test
    void shouldReturnFalseIfAUserIsNotRegistered() {
        UserRegistration userRegistration = new UserRegistration();

        boolean registeredUser = userRegistration.register("Aditya", "");

        assertFalse(registeredUser);
    }


}
