package bootcoding.junit.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxTest {
    @Test
    public void test()
    {
        FindMax max= new FindMax();
        int arr[]={3,4,5,1,2};
        int actual =max.findMaxElement(arr);
        int expected= 5;
        assertEquals(expected,actual);
    }


}