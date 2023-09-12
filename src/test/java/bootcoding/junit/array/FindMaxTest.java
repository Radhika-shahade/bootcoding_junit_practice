package bootcoding.junit.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxTest {
    @Test
    public void testWithPositiveNumbers()
    {
        FindMax max= new FindMax();
        int arr[]={3,4,5,1,2};
        int actual =max.findMaxElement(arr);
        int expected= 5;
        assertEquals(expected,actual);
    }
    @Test
    public void testWitheNumbers(){
        int arr[]={2,33,45,67};
        int expectedAns=67;
        FindMax max= new FindMax();
        int actualAns= max.findMaxElement(arr);
        assertEquals(expectedAns,actualAns);
    }
    @Test
    public void testWithNegativeNumbers()
    {
        int arr[]={-3,-4,-55,-9};
        int expectedAns=-3;
        FindMax max= new FindMax();
        int actualAns=max.findMaxElement(arr);
        assertEquals(expectedAns,actualAns);
    }
    @Test
    public void testWithZeroAndNegativeNum()
    {
        int arr[]={0,-1,-3,-6};
        int expectedAns=0;
        FindMax max= new FindMax();
        int actualAns=max.findMaxElement(arr);
        assertEquals(expectedAns,actualAns);
    }




}