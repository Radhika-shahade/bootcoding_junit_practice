package bootcoding.junit.array;

public class AddArray {

    public int addArray(int num[])
    {
        int sum=0;
        for(int n: num )
        {
            sum += n;
        }
        return sum;
    }

}
