package QuickSort;

import Utils.Utils;

public class QuickSort {

    // --- Public API ---

    protected static void quickDefault() {
        int[] arr = Utils.randomVector();
        quickSort(arr, 0, arr.length - 1, true);
        printArray(arr);
    }

    protected static void quickReverse() {
        int[] arr = Utils.randomVector();
        quickSort(arr, 0, arr.length - 1, false);
        printArray(arr);
    }

    // --- Private Core Logic ---

    private static void quickSort(int[] arr, int low, int high, boolean ascending) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high, ascending);
            quickSort(arr, low, pivotIndex - 1, ascending);
            quickSort(arr, pivotIndex + 1, high, ascending);
        }
    }

    private static int partition(int[] arr, int low, int high, boolean ascending) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            boolean condition = ascending ? (arr[j] < pivot) : (arr[j] > pivot);

            if (condition) {
                i++;
                Utils.swapperQuick(arr, i, j);
            }
        }

        Utils.swapperQuick(arr, i + 1, high);
        return (i + 1);
    }

    // --- Helpers ---

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}