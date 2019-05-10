package solutions.introducingjava;

import java.util.*;
import java.util.stream.IntStream;

public class Intro {

    /**
     * Finds the greatest common divisor of two numbers.
     *
     * @param a integer entered by the user
     * @param b integer entered by the user
     * @return the greatest common divisor of both
     */
    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {

                a -= b;
            } else {

                b -= a;
            }
        }
        return a;

    }


    /**
     * Find the least common multiple of two numbers.
     *
     * @param a integer entered by the user
     * @param b integer entered by the user
     * @return least common multiple of both
     */
    private static int lcm(int a, int b)

    {
        return a * (b / gcd(a, b));
    }


    /**
     * Gets the minimum element of the array
     *
     * @param array
     * @return the minimum element of the array
     */
    public int getMinElement(int[] array) {
        int minValue = array[0];


        for (int i = 1; i < array.length; i++) {

            if (minValue > array[i]) {
                minValue = array[i];
            }
        }

        return minValue;


    }


    /**
     * Prints the elements of the array
     *
     * @param array
     */
    public void printArray(int[] array) {
        for (int element : array)

        {
            System.out.print(element);
            System.out.print(' ');

        }


    }


    /**
     * Calculate of sum of the elements in the array
     *
     * @param array
     * @return
     */
    public int getSum(int[] array) {
        return IntStream.of(array).sum();
    }


    /**
     * partitions the intput array and returns the pivot index
     * Works in combination with quickSort()
     *
     * @param array
     * @param begin
     * @param pivot
     * @return
     */
    public static int partition(int[] array, int begin, int pivot) {

        int x = array[pivot];

        int i = begin - 1;

        int tmp;


        for (int k = begin; k <= pivot - 1; k++) {

            int current = array[k];


            if (current < x) {
                i++;

                tmp = current;

                array[k] = array[i];
                array[i] = tmp;

            }

        }

        i++;

        tmp = array[i];


        array[i] = array[pivot];
        array[pivot] = tmp;

        return i;


    }


    /**
     * quicksort main algorithm
     *
     * @param array
     * @param left
     * @param right
     */
    public static void quickSort(int[] array, int left, int right) {
        int pivot;
        if (left < right) {

            pivot = partition(array, left, right);

            quickSort(array, left, pivot - 1);
            quickSort(array, pivot + 1, right);
        }
    }

    /**
     * Calls the quicksort main algorithm with the right input
     *
     * @param array
     */
    public static void sortArray(int[] array) {

        quickSort(array, 0, array.length - 1);

    }


    /**
     * Generates a random string with adjustable length
     *
     * @param lenght
     */
    public static void generateString(int lenght) {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = lenght;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        System.out.println(generatedString);
    }


    /**
     * Reverses the order of the elements in the array
     *
     * @param input
     */
    public static void reverseList(ArrayList input) {

        Collections.reverse(input);
    }


}
