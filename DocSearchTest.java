import static org.junit.Assert.assertEquals;
import java.net.URISyntaxException;
import java.beans.Transient;
import java.io.IOException;
import java.net.URI;

import org.junit.Test;

public class DocSearchTest {
    
    @Test
    public void emptyTest() throws IOException, URISyntaxException
    {
        Handler h = new Handler("/technical");
        URI url = new URI("http://localhost:4001");
        assertEquals("Don't know how to handle that path!", h.handleRequest(url));
    }
}
