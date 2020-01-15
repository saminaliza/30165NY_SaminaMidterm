package string.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestingStringProblem {
        //Apply Unit Test into all the methods in this package.
//        @Test
//        public void testPositiveIsAnagram() {
//            boolean ExpectedResult = true;
//            boolean ActualResult = Anagram.areAnagram("ARMY", "MARY");
//            Assert.assertEquals(ExpectedResult, ActualResult);
//        }
//
//    @Test
//    public void testNegativeIsAnagram() {
//        boolean ExpectedResult = false;
//        boolean ActualResult = Anagram.areAnagram("ARMY", "MARY");
//        Assert.assertEquals(ExpectedResult, ActualResult);
//    }

    @Test
    public void testPositiveIsPalindrome() {
        boolean ExpectedResult = true;
        boolean ActualResult = Palindrome.isPalindrome("MADAM");
        Assert.assertEquals(ExpectedResult, ActualResult);
    }

    @Test
    public void testNegativeIsPalindrome() {
        boolean ExpectedResult = false;
        boolean ActualResult = Palindrome.isPalindrome("SIR");
        Assert.assertEquals(ExpectedResult, ActualResult);
    }
    }

