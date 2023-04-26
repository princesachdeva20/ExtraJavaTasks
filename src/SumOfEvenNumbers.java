import java.util.ArrayList;
import java.util.Scanner;

public class SumOfEvenNumbers {


    int n , sum = 0;
    ArrayList<Integer> elements = new ArrayList<>();

    public void ProgramOverview(){
        System.out.println("The Program is to calculate the sum of the integer elements\nin the array given by the user");
    }
    public void GetNumberOfElements(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array");

        n = scan.nextInt();
    }

    public void GetElements(){
        System.out.println("Enter The Elements of the Array");
        Scanner scan = new Scanner(System.in);
        for (int i =0; i< n; i++) {
            int data = scan.nextInt();
            elements.add(i,data);
        }
    }
    public void PrintElements(){
        System.out.println("Elements in your array are :" );
        System.out.print(elements + " ");
    }
    public void GetTotal(){
        System.out.println("\nThe System is Calculating the sum of all the even numbers");

        for (Integer element : elements) {
            if (element % 2 == 0) {
                sum += element;
            }
        }
        System.out.println("The total of all the evan numbers is :" + sum);
    }

}
