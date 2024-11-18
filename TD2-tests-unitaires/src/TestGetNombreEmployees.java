import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestGetNombreEmployees extends BaseTest {
    @Test
    public void testGetNombreEmployees() {
        // Scenario 1: No employees
        assertEquals(0, Employee.getNombreEmployes());

        // Scenario 2: One employee
        Employee emp1 = new Employee("PHAN", "An", 3000.0, 5000.0);
        assertEquals(1, Employee.getNombreEmployes());

        // Scenario 3: Multiple employees
        Employee emp2 = new Employee("NGUYEN", "Thanh Thuy", 4000.0, 7000.0);
        Employee emp3 = new Employee("NGO", "Anh Thu", 3500.0, 6000.0);
        assertEquals(3, Employee.getNombreEmployes());
    }
}
