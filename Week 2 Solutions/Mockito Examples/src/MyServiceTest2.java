import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

public class MyServiceTest2 {

    @Test
    public void testVerifyInteraction() {
        // Arrange: create a mock of the external API
        ExternalApi2 mockApi = Mockito.mock(ExternalApi2.class);

        // Inject the mock into the service
        MyService2 service = new MyService2(mockApi);

        // Act: call the method
        service.fetchData();

        // Assert: verify the interaction occurred
        verify(mockApi).getData();  // ✅ This ensures the method was called
    }
}
