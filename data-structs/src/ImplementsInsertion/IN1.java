package ImplementsInsertion;

import Capsule.Algorithm.Inter.InsertionSort;
import Utils.Utils;

public class IN1 implements InsertionSort {

    public IN1() {}

    private void i1(int[] a, final int n) {
        if (a == null || n < 2 || Utils.is0toN(a, n)) return;
        for (int i = 1; i < n; ++i) {
            int aux = a[i], j;
            for (j = i - 1; j >= 0 && a[j] > aux; --j) a[j + 1] = a[j];
            a[j + 1] = aux;
        }
    }

    private void i2(int[] a, final int n) {
        if (a == null || n < 2 || Utils.isNto0(a, n)) return;
        for (int i = 1; i < n; ++i) {
            int aux = a[i], j;
            for (j = i - 1; j >= 0 && a[j] < aux; --j) a[j + 1] = a[j];
            a[j + 1] = aux;
        }
    }

    // =====================================|
    @Override public void defaultInsertionSort(
            int[] a, final int n
    ) { this.i1(a, n); }
    // =====================================|
    @Override public void reverseInsertionSort(
            int[] a, final int n
    ) { this.i2(a, n); }
    // =====================================|

    @Override public void execTwoMethods(int[] v, final int n) {
        this.defaultInsertionSort(v, n);
        Utils.printArray(v);
        this.reverseInsertionSort(v, n);
        Utils.printArray(v);
    }
}
