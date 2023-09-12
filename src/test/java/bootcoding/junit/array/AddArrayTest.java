package bootcoding.junit.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddArrayTest {
    @Test
    public void testWithPositiveNumbers()
    {
        AddArray obj= new AddArray();
        int arr[]={3,4,5,1,2};
        int actualSum = obj.addArray(arr);
        int expected= 15;
        assertEquals(expected,actualSum);
    }
    @Test
    public void testWithNegativeNumbers() {
        int arr[] = {-1, -3, -4, -5};
        int expectedSum = -13;
        AddArray addArray = new AddArray();
        int actualSum = addArray.addArray(arr);
        assertEquals(expectedSum, actualSum);
    }

     @Test
       public void testWithMixedNumbers()
        {
            int arr[]={1 ,-2 ,-3 ,-4 ,5};
             int expectedSum= -3;
             AddArray addArray= new AddArray();
           int actualSum=addArray.addArray(arr);
             assertEquals(expectedSum,actualSum);
        }


    }


