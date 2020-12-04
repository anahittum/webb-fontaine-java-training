package homework4;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static homework4.Constants.*;

public class TestStringAPI {

    private StringAPI api;

    @BeforeClass
    public void setUp() {
        api = new StringAPI();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("after all tests");
        api = null;
    }

    //    Exercise #1

    @Test
    public void getCharAtIndexNull() {

        System.out.println(" test 1 for null value");
        String result = api.getCharAtIndex(null, 7);
        assert result.equals(OUT_OF_BOUNDS);
    }

    @Test
    public void getCharAtIndexEmpty() {

        System.out.println(" test 2 for empty string");

        String result = api.getCharAtIndex("", 7);
        assert result.equals(OUT_OF_BOUNDS);
    }

    @Test
    public void getCharAtIndexBigK() {

        System.out.println(" test 3 for big index");

        String result = api.getCharAtIndex("abcd", 10);
        assert result.equals(OUT_OF_BOUNDS);
    }

    @Test
    public void getCharAtIndexNegativeK() {

        System.out.println(" test 4 for big index");

        String result = api.getCharAtIndex("abcd", -10);
        assert result.equals(OUT_OF_BOUNDS);
    }

    @Test
    public void getCharAtIndexPositiveCase() {

        System.out.println(" test 5 for Positive Case");

        String result = api.getCharAtIndex("abcd", 3);
        assert result.equals("d");
    }

//    Exercise #4

    @Test
    public void testCheckBrackets() {
        String result = api.checkBrackets("(())");
        assert result.equals(VALID);
    }

    @Test
    public void testCheckBracketsInvalid() {
        String result = api.checkBrackets("((");
        assert result.equals(INVALID);
    }

    //    Exercise #2

    @Test
    public void testGetNumberOfWords() {
        int result = api.getNumberOfWords("one two three 4");
        assert result == 4;
    }

    //    Exercise #3

    @Test
    public void testIsStringPalindromePositiveCase() {
        boolean result = api.isStringPalindrome("aBcBa");
        assert result;
    }

    @Test
    public void testIsStringPalindromeNegativeCase() {
        boolean result = api.isStringPalindrome("abcdcb");
        assert !result;
    }

    //    Exercise #5

    @Test
    public void testContainsXSequencePositiveCase() {
        boolean result = api.containsXSequence("abcdcb", "ab");
        assert result;
    }

    //    Exercise #6

    @Test
    public void testStartsWithXCharsPositiveCase() {
        boolean result = api.startsWithXChars("abcdcb", "ab");
        assert result;
    }

    @Test
    public void testStartsWithXCharsNegativeCase() {
        boolean result = api.startsWithXChars("abcdcb", "az");
        assert !result;
    }

    //    Exercise #6

    @Test
    public void testEndsWithXCharsPositiveCase() {
        boolean result = api.endsWithXChars("abcdcb", "cb");
        assert result;
    }

    @Test
    public void testEndsWithXCharsNegativeCase() {
        boolean result = api.endsWithXChars("abcdcb", "az");
        assert !result;
    }

    @Test
    public void testReverseString() {
        String result = api.reverseString("reverse");
        assert result.equals("esrever");
    }
}