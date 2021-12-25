/**
 *Java 1. Homework #3
 *
 * @author Liliya Chernobay
 * @version 20.12.2021
 */
import java.util.Arrays;
import java.util.Random;

class Homework3 {

    static Random random = new Random();

    public static void main(String[]args) {

        //1.Invent array values
        int[]arrOne = createAndFillArray(10, true, 2);
        System.out.println(Arrays.toString(arrOne));
        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = 1 - arrOne[i];
        }
        System.out.println(Arrays.toString(arrOne));

        //2.Fill the array with values from 1 to N
        int[]arrTwo = createAndFillArray(100, false, 1);
        System.out.println(Arrays.toString(arrTwo));

        //3. Loop over array elements with conditition
        int[]arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrThree));

        //4.Fill in the diagonals of the matrix
        int[][]matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        // 5. Create and fill an array with the same values
        int[]arrFive = createAndFillArray(15, 5);
        System.out.println(Arrays.toString(arrFive));

        // 6. Find the min and max value in an Array
        int[]arrSix = createAndFillArray(25, true, 25);
        System.out.println(Arrays.toString(arrSix));
        int[]minMax = findMinMax(arrSix);
        System.out.println(Arrays.toString(minMax));
    }

    static int[]createAndFillArray(int len, int initialValue) {
        int[]arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }


    static int[]createAndFillArray(int length, boolean rnd, int value) {
        int[]arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            if (rnd) {
                arr[i] = random.nextInt(value);
            } else {
                arr[i] = i + value;
            }
        }
    return arr;
}

static int[]findMinMax(int[]array) {
    int min = array[0],
    max = array[0];
    for (int i: array) {
        if (min > i) {
            min = i;
        }
        if (max < i) {
            max = i;
        }
    }
    return new int[]{min, max};
    }
}
