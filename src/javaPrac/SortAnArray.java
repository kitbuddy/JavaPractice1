package javaPrac;

import java.util.Arrays;
import java.util.Collections;

public class SortAnArray {

    public static void main(String[] args) {

        Integer[] arr = {1,-2, -5,4,9};

        sortArray(arr);
    }

    private static void sortArray(Integer[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {

                int temp = 0;

                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        Arrays.stream(arr).forEach(value -> System.out.print(value));
        System.out.println("----------");

        Arrays.stream(arr).sorted();
        Arrays.stream(arr).forEach(value -> System.out.print(value));

        System.out.println("----------");

        Arrays.stream(arr).sequential();
        Arrays.stream(arr).forEach(value -> System.out.print(value));

        System.out.println("----------");

        Arrays.sort(arr);
        Arrays.stream(arr).forEach(value -> System.out.print(value));

        System.out.println("----------");


        Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.stream(arr).forEach(value -> System.out.print(value));

    }


}
