import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PurpleFoxTest {

    @Test
    void shouldReturnTrueIfAUserIsRegistered() {
        PurpleFox purpleFox = new PurpleFox();

        boolean registered = purpleFox.registerUser("Aditya", "Aditya369");

        assertTrue(registered);
    }

    @Test
    void shouldAddServiceToSelectedServices() {

        PurpleFox purpleFox = new PurpleFox();

        purpleFox.selectService(EventService.DECORATION);

        assertThat(purpleFox.isServiceSelected(EventService.DECORATION), is(true));
    }
}
