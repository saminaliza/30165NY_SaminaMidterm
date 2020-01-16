package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int n = list.length;
        for (int i = 1; i < n; ++i) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        
        
        return list;
    }
    public void merge(int list[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; ++i) {
            left[i] = list[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            right[j] = list[m + 1 + j];
        }
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                list[k] = left[i];
                i++;
            } else {
                list[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            list[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            list[k] = right[j];
            j++;
            k++;
        }
    }

    public int [] mergeSort(int [] array, int l, int r){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        if (l < r) {

            int m = (l + r) / 2;

            mergeSort(list, l, m);
            mergeSort(list, m + 1, r);

            merge(list, l, m, r);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    int partition(int list[], int low, int high) {
        int pivot = list[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (list[j] <= pivot) {
                i++;
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        int temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;

        return i + 1;
    }

    public int [] quickSort(int [] array, int l, int h){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        if (l < h) {

            int pi = partition(list, l, h);

            quickSort(list, l, pi - 1);
            quickSort(list, pi + 1, h);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
