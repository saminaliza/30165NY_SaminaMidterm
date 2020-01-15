package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        minDiffElements(array1, array2);
    }

    private static void minDiffElements(int[] array1, int[] array2) {
    }

    public static int lowestDiffOfArray () {
            int [] array1 = {30,12,5,9,2,20,33,1};
            int [] array2 = {18,25,41,47,17,36,14,19};
            lowestDiffOfArray();


            int lowest = array1[0];
            for(int i=0; i<array1.length; i++){

                for(int j=0;j<array2.length; j++){

                    int diff = Math.abs(array1[i]-array2[j]);
                    if(diff<lowest)
                    { lowest = diff;
                    }
                }
            }

            return lowest;
        }

    }




