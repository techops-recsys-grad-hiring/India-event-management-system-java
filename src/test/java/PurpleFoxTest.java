import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PurpleFoxTest {
    private static PurpleFox purpleFox;

    @BeforeAll
    static void setUp() {
        purpleFox = new PurpleFox();
    }

    @Test
    void shouldReturnTrueIfAUserIsRegistered() {

        boolean registered = purpleFox.registerUser("Aditya", "Aditya369");

        assertTrue(registered);
    }

    @Test
    void shouldAddServiceToSelectedServices() {

        purpleFox.selectService(EventService.DECORATION);

        assertThat(purpleFox.isServiceSelected(EventService.DECORATION), is(true));
    }

    @Test
    void shouldAddMultipleServicesToTheSelectedServiceList() {
        EventService[] servicesToAdd = {EventService.PHOTOGRAPHY, EventService.DECORATION};

        Arrays.stream(servicesToAdd).forEach(purpleFox::selectService);

        HashSet<EventService> expectedServices = new HashSet<>(Arrays.asList(servicesToAdd));
        assertTrue(purpleFox.getSelectedServices().containsAll(expectedServices));
    }
}
