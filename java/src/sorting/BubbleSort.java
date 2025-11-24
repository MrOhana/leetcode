package sorting;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        var listInt = new int[] {11,9,8,6,5,3,2,1};
        bubbleSort(listInt);
        System.out.print(Arrays.toString(listInt));
    }

    public static void bubbleSort(int[] li) {
        int n = li.length;
        boolean swapped;
        for (int i=0; i < (n - 1); i++) {
            swapped = false;
            for (int j=0; j < (n - i - 1); j++) {
                if (li[j] > li[j+1]) {
                    int tmp = li[j];
                    li[j] = li[j+1];
                    li[j+1] = tmp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }
}