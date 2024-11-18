import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestGetNumeroEmp2 extends BaseTest {
    @Test
    public void testNumeroEmps() {
        Employee employee1 = new Employee("PHAN", "An", 1200, 150);
        Employee employee2 = new Employee("NGO", "Thu", 1000, 125);

        assertEquals(employee1.getNumeroEmp(), 0);
        assertEquals(employee2.getNumeroEmp(), 1);
    }
}
