import RideShareSelector.data.ClientRepository;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.*;

class ClientRepositoryTest {

    @Test
    void getDistance() throws UnsupportedEncodingException {
        ClientRepository testDistance = new ClientRepository();
        String result = testDistance.getDistance("2401 W Belvedere Ave, Baltimore, MD", "5601 Loch Raven Blvd, Baltimore, MD");
        assertEquals("4.6 mi", result);
    }
}