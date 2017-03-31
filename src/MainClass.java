import com.sun.javafx.print.PrintHelper;

import java.lang.reflect.Array;
import java.security.Principal;
import java.util.Arrays;

/**
 * Created by smeleyka on 29.03.17.
 */
public class MainClass {
    public static void main(String[] args) {
        invertArray();
        fillInArray();
        multiplyLess6();
        makeSquareArrayDiag();
        findMinMax();

        int[] balanceArr = {1, 1, 1, 2, 1,6};
        System.out.println(checkBalance(balanceArr));
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 1, 1, 0, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillInArray() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < 8; i++, j += 3) {
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void multiplyLess6() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
    }

    public static void makeSquareArrayDiag() {
        int[][] arr = new int[5][5];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            arr[i][i] = 1;
            arr[i][j] = 1;
        }
    }

    public static void findMinMax() {
        int[] arr = {1, 45, 3, 6, 67, -7, 4, -10};
        int max = arr[1];
        int min = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }
        System.out.println("Max=" + max + " Min=" + min);
    }

    public static boolean checkBalance(int[] arr) {
        int left = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int right = 0;
            left += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                right += arr[j];
            }
            if (left==right) return true;
        }
        return false;
    }
}
