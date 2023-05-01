import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayZigzag {
    public static void main(String[]args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements of array");
        n = scanner.nextInt();
        int [] array= new int[n];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("The Array elements are: "+Arrays.toString(array));

        Arrays.sort(array);
        for (int i = 1; i < n - 1; i += 2) {
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }
    System.out.println(Arrays.toString(array));
    }
}
