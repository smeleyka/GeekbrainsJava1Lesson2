import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by smeleyka on 29.03.17.
 */
public class MainClass {
    public static void main(String[] args) {
        

    }

    public static void invertArray() {
        int[]array = {1,0,1,1,1,0,0,1,0,1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) array[i]=0;
            else array[i]=1;
            System.out.println(Arrays.toString(array));
        }


    }

}
