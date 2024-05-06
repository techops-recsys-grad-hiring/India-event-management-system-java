import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PurpleFoxTest {

    @Test
    void shouldReturnTrueIfAUserIsRegistered() {
        PurpleFox purpleFox = new PurpleFox();

        boolean registeredUser = purpleFox.register("Aditya", "Aditya369");

        assertTrue(registeredUser);
    }

    @Test
    void shouldReturnFalseIfAUserIsNotRegistered() {
        PurpleFox purpleFox = new PurpleFox();

        boolean registeredUser = purpleFox.register("Aditya", "");

        assertFalse(registeredUser);
    }


}
