package javaPrac;

import java.util.Arrays;
import java.util.Collections;

public class SortingAnArray {
    public static void main(String[] args) {
        SortingAnArray.sortAnArray();
        SortingAnArray.sortingUsingMethod();

        SortingAnArray.reverseOrder();
    }

    private static void reverseOrder() {
        Integer[] arrayInt;
        arrayInt = new Integer[] {1,2,4,3,6,4,7,3};

        Arrays.sort(arrayInt, Collections.reverseOrder());
        System.out.println("\n Arrays in descending/reverse");
        for (int i: arrayInt) {
            System.out.print(i + ", ");
        }
    }

    private static void sortingUsingMethod() {
        int[] arrayInt;
        arrayInt = new int[] {1,2,4,3,6,4,7,3};

        Arrays.sort(arrayInt);
        System.out.println(" \n using method");

        for (int i: arrayInt) {
            System.out.print(i + ", ");
        }
    }

    private static void sortAnArray() {
        int[] arrayInt;
        arrayInt = new int[] {1,2,4,3,6,4,7,3};
        int temp = 0;
        for(int i = 0; i<arrayInt.length; i++) {
            for(int j = i+1; j<arrayInt.length ; j++) {

                if(arrayInt[i] > arrayInt[j]) {

                    temp = arrayInt[i];
                    arrayInt[i] = arrayInt[j];
                    arrayInt[j] = temp;
                }
            }
        }
        for (int i: arrayInt) {
            System.out.print(i + ", ");
        }
    }
}
