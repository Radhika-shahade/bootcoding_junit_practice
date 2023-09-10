package bootcoding.junit.array;

public class FindMax {

    public int findMaxElement(int n[])
    {
        int max=n[0];
        for(int i=1;i<n.length;i++)
        {
            if(max<n[i])
            {
                max=n[i];
            }
        }
        return max;
    }

}
