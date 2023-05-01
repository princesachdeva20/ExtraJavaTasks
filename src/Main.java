import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> elements;
        GetUserArray user1 = new GetUserArray();
        elements = user1.GetArray();
        SumOfEvenNumbers _user1 = new SumOfEvenNumbers(elements);
        user1.PrintElements();
        _user1.GetTotal();
        System.out.println("Elements Before Sorting");
        user1.PrintElements();
        ZigzagArraySorting user1_1 = new ZigzagArraySorting(elements);
        user1_1.ZigzagSorting();

    }
}