package algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
    }

    @Test
    public void testSelectionSort() Sort sort;

    {

        int[] result = sort.selectionSort(unSortedArray);
        assertArrayEquals(result, sortedArray);
    }

    @Test
    public void testInsertionSort() {

        int[] result = sort.insertionSort(unSortedArray);
        assertArrayEquals(result, sortedArray);
    }

    @Test
    public void testBubbleSort() {

        int[] result = sort.bubbleSort(unSortedArray);
        assertArrayEquals(result, sortedArray);
    }


    @Test
    public void testQuickSort() {

        int[] result = sort.quickSort(unSortedArray, 0, unSortedArray.length - 1);
        assertArrayEquals(result, sortedArray);
    }

    @Test
    public void testHeapSort() {

        int[] result = sort.heapSort(unSortedArray);
        assertArrayEquals(result, sortedArray);
    }


    private void assertArrayEquals(int[] result, int[] sortedArray) {
    }

    @Test
    public void testShellSort() {

        int[] result = sort.shellSort(unSortedArray);
        assertArrayEquals(result, sortedArray);
    }


}
