import java.util.ArrayList;
import java.util.Collections;

public class ZigzagArraySorting {
    ArrayList<Integer> IncreasingArray , DecreasingArray;

    public ZigzagArraySorting(ArrayList<Integer> userArray) {
        super();
        this.IncreasingArray = userArray;
        this.DecreasingArray = userArray;
    }

    private void IncrementSorting() {
        for (Integer element : IncreasingArray) {
            for (int i = 0; i < IncreasingArray.size() - 1; i++) {
                if (IncreasingArray.get(i) > IncreasingArray.get(i + 1)) {
                    Collections.swap(IncreasingArray, i, i + 1);
                }
            }
        }
    }
        private void DecrementsSorting(){
            for (Integer element : DecreasingArray) {
                for (int i = 0; i < DecreasingArray.size() - 1; i++) {
                    if (DecreasingArray.get(i) < DecreasingArray.get(i + 1)) {
                        Collections.swap(DecreasingArray, i, i + 1);
                    }
                }
            }
        }
        public void ZigzagSorting(){
        IncrementSorting();
            System.out.println(IncreasingArray + " ");
        DecrementsSorting();
            System.out.println(DecreasingArray + " ");
    }
}