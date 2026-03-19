package ImplementsSelection;

import Capsule.Algorithm.Inter.SelectionSort;
import Utils.Utils;

public class SS1 implements SelectionSort {

    public SS1() {}

    private void s1(int[] a, final int n) {
        if (a == null || n < 2 || Utils.is0toN(a, n)) return;
        for (int i = 0; i < n - 1; ++i) {
            int mii = i;
            for (int j = i + 1; j < n; j++) if (a[j] < a[mii]) mii = j;
            if (mii != i) Utils.swapperSelection(a, i, mii);
        }
    }

    private void s2(int[] a, final int n) {
        if (a == null || n < 2 || Utils.isNto0(a, n)) return;
        for (int i = 0; i < n - 1; ++i) {
            int mai = i;
            for (int j = i + 1; j < n; ++j) if (a[j] > a[mai]) mai = j;
            if (mai != i) Utils.swapperSelection(a, i, mai);
        }
    }

    // =====================================|
    @Override public void defaultSelectionSort(
            int[] a, final int n
    ) { this.s1(a, n); }
    // =====================================|
    @Override public void reverseSelectionSort(
            int[] a, final int n
    ) { this.s2(a, n); }
    // =====================================|

    @Override public void execTwoMethods(int[] v, final int n) {
        this.defaultSelectionSort(v, n);
        Utils.printArray(v);
        this.reverseSelectionSort(v, n);
        Utils.printArray(v);
    }
}
