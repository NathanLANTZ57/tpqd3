package tp2;

import java.util.ArrayList;

public class CalculTab {

    public static int calculateSum(ArrayList<Integer> tab) {
        int sum = 0;
        for (int number : tab) {
            sum += number;
        }
        return sum;
    }
}
