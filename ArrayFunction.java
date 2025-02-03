import java.util.*;

class ArrayFunctions {
    public void display(ArrayList<Integer> array) {
        System.out.println("Array is: " + array);
    }

    public void oddEven(int[] array) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        display(odd);
        display(even);
    }

    // New function to find the minimum difference between consecutive numbers
    public int findMinDifference(int[] array) {
        if (array.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1;
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - array[i - 1]);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }
}
