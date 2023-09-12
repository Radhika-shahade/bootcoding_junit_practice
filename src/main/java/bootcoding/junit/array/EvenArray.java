package bootcoding.junit.array;

// Get Even Element Array from given array
public class EvenArray {
    public int[] evenElementArray(int[] num) {
        int count = 0;

        for (int n : num) {
            if (n % 2 == 0) {
                count++;
            }
        }
        int evenArray[] = new int[count];
        int i = 0;
        for (int evenNum : num) {
            if (evenNum % 2 == 0) {
                evenArray[i++] = evenNum;
            }

        }

        return evenArray;

    }
}
