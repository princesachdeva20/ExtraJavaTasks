import java.util.ArrayList;
import java.util.Scanner;

public class GetUserArray {

    int n;
    ArrayList<Integer> elements = new ArrayList<>();

    public ArrayList<Integer> GetArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array");

        n = scan.nextInt();

        System.out.println("Enter The Elements of the Array");
        for (int i = 0; i < n; i++) {
            int data = scan.nextInt();
            elements.add(i, data);
        }
        return elements;
    }
    public void PrintElements(){
        System.out.println("Elements in your array are :" );
        System.out.print(elements + " ");
    }
}
