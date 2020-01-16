package design;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class UnitTestingEmployeeInfo {

    //Write Unit Test for all the methods has been implemented in this package.
    private EmployeeInfo employeeInfo;

    @BeforeTest
    public void initTest() {

        employeeInfo = new EmployeeInfo();

        employeeInfo.setEmployeeName("John Doe");
        employeeInfo.setEmployeeId(001);
        EmployeeInfo.setCompanyName("Google");
    }

    @Test
    public void testEmployeeName() {

        System.out.println("Testing employeeName()");
        assertEquals("John Doe", employeeInfo.employeeName());
    }

    @Test
    public void testEmployeeId() {

        System.out.println("Testing employeeId()");
        assertEquals(12345, employeeInfo.employeeId());
    }


    @Test
    public void testCompanyName() {

        System.out.println("Testing setCompanyName()");
        assertEquals("Google", employeeInfo.getCompanyName());
    }

//    @Test
//    public void testCalculateSalary() {
//
//        System.out.println("Testing calculateSalary()");
//        assertEquals(120000, employeeInfo.calculateSalary());
//    }
}
