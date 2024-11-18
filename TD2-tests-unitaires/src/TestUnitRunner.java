import org.junit.internal.runners.statements.Fail;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestUnitRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(
                TestGetNumeroEmp1.class,
                TestGetNumeroEmp2.class,
                TestGetNombreEmployees.class
        );
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
