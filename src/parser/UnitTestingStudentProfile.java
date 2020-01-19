package parser;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {


        //Apply Unit Test into all the methods in this package.
        try {
            Student student = new Student();
            student.firstName.toString();
            Assert.assertEquals("John", "Doe", "does not match");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test
    void testGetLastName() {
        Student student = new Student("Jon", "Doe");
        String displayLastName = student.getLastName();
        Assert.assertEquals("Doe, Watson", displayLastName);
    }
}

