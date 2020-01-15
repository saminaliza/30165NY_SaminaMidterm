package math.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestingMath {

    @Test
    public void testPositiveFindFactorial() {
        long expectedResult = 120;
        long actualResult = Factorial.findFactorial(5);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testNegativeFindFactorial() {
        long expectedResult = 123;
        long actualResult = Factorial.findFactorial(5);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveFindLowestDifference() {
        int expectResult = 1;
        int actualResult = FindLowestDifference.findLowestDifference(new int[]{1, 0, 4, 5, 8});
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void testNegativeFindLowestDifference() {
        int expectResult = 5;
        int actualResult = FindLowestDifference.findLowestDifference(new int[]{1, 0, 4, 5, 8});
        Assert.assertEquals(expectResult, actualResult);


    }

}



