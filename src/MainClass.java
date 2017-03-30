import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by smeleyka on 29.03.17.
 */
public class MainClass {
    public static void main(String[] args) {
        invertArray();
        fillInArray();
        multiplyLess6();
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
        System.out.println(Arrays.toString(arr));
    }
}
