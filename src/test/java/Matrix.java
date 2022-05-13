import java.util.ArrayList;

public class Matrix {

    public static int[] numbersDivisibleByThree(int[][] matrix) {
        int[] index = new int[2];
        boolean flag = true;

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] != 0) {
                    index[1] = j;
                    break;
                }
            }
            break;
        }
        return index;
    }

    public static ArrayList<Integer> minimum(int[][] matrix) {
        ArrayList<Integer> minRows = new ArrayList<>();
        int minimum;

        for (int[] ints : matrix) {
            minimum = ints[0];
            for (int j = 1; j < matrix[0].length; j++) {
                if (ints[j] < minimum) {
                    minimum = ints[j];
                }
            }
            minRows.add(minimum);
        }
        return minRows;
    }
}
