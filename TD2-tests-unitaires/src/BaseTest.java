import org.junit.Before;

public class BaseTest {
    @Before
    public void resetEmployeeCounter() {
        Employee.resetCounter();
    }
}
