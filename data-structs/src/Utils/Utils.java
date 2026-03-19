package Utils;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {

    public static boolean is0toN(final int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) if (arr[i] > arr[i + 1]) return false;
        return true;
    }

    public static boolean isNto0(final int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) if (arr[i] < arr[i + 1]) return false;
        return true;
    }

    public static void printArray(final int[] arr) {
        System.out.print("[ ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println(" ]");
    }

    public static boolean swapperBubble(int[] arr, final int idx) {
        int temp = arr[idx];
        arr[idx] = arr[idx + 1];
        arr[idx + 1] = temp;
        return true;
    }

    public static void swapperSelection(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapperQuick(int[] arr, int i, int j) {
        swapperSelection(arr, i, j);
    }

    public static int[] randomVector() {
        int[] vet = new int[7];
        for (int i = 0; i < vet.length; i++) vet[i] = ThreadLocalRandom.
                current().
                nextInt(0, 99);
        return vet;
    }

    public static void newLine() {
        System.out.println("\n");
    }
}
