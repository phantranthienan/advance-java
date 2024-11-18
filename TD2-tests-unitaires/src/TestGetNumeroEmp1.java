import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestGetNumeroEmp1 extends BaseTest {
    @Test
    public void testNumeroEmp1() {
        Employee employee = new Employee("PHAN", "An", 1000, 125);
        assertEquals(employee.getNumeroEmp(), 0);
    }
}
