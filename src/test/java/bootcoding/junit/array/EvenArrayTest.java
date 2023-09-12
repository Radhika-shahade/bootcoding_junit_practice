package bootcoding.junit.array;

import org.junit.Test;

import javax.swing.border.BevelBorder;

import static org.junit.Assert.*;

public class EvenArrayTest {
    @Test
    public void TestWithAllPositiveNumbers()
    {
        int arr[]={2,3,4,7,8};
       int expectedArray[]={2,4,8};
       EvenArray evenArray= new EvenArray();
       int actualAns[]=evenArray.evenElementArray(arr);
       assertArrayEquals(expectedArray,actualAns);

    }
    @Test
    public void TestWithAllNegativeNumbers()
    {
        int arr[]={-2,-4,-5,-6};
        int expectedArray[]={-2,-4,-6};
        EvenArray evenArray=new EvenArray();
       int actualArray[]= evenArray.evenElementArray(arr);
       assertArrayEquals(expectedArray,actualArray);
    }

}