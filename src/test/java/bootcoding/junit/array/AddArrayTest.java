package bootcoding.junit.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddArrayTest {
    @Test
    public void test()
    {
        AddArray obj= new AddArray();
        int arr[]={3,4,5,1,2};
        int expected= obj.addArray(arr);
        int actualSum= 15;
        assertEquals(expected,actualSum);
    }
    @Test
    public void test2()
    {

    }


}