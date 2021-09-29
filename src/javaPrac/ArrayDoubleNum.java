package javaPrac;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDoubleNum {

    public static void main(String[] args) {
        ArrayDoubleNum arrayDoubleNum = new ArrayDoubleNum();

        arrayDoubleNum.findMaxOfNum();
    }

    private void findMaxOfNum() {

       long[] arr = { 1, 2, 4, 11, 12, 8 };

       // sorting array
        Arrays.sort(arr);
        for (long l : arr) {
            System.out.println(l);
        }

       int num = 2;

        for (long l : arr) {
           if (l == num) {
               num += num;
           }
        }
        System.out.println(num);
    }
}
