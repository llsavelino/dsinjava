package ImplementsBubble;

import Capsule.Algorithm.Inter.BubbleSort;
import Utils.Utils;

public class BS1 implements BubbleSort {

    public BS1() {}

    private void b1(int[] a, final int n) {
        if (a == null || n < 2 || Utils.is0toN(a, n)) return;
        boolean swapped;
        for (int i = 0; i < (n - 1); ++i) {
            swapped = false;
            for (int j = 0; j < (n - i - 1); ++j)
                if (a[j] > a[j + 1]) swapped = Utils.swapperBubble(a, j);
            if (!swapped) break;
        }
    }

    private void b2(int[] a, final int n) {
        if (a == null || n < 2 || Utils.isNto0(a, n)) return;
        boolean swapped;
        for (int i = 0; i < (n - 1); ++i) {
            swapped = false;
            for (int j = 0; j < (n - i - 1); ++j)
                if (a[j] < a[j + 1]) swapped = Utils.swapperBubble(a, j);
            if (!swapped) break;
        }
    }

    // =====================================|
    @Override public void defaultBubbleSort(
            int[] a, final int n
    ) { this.b1(a, n); }
    // =====================================|
    @Override public void reverseBubbleSort(
            int[] a, final int n
    ) { this.b2(a, n); }
    // =====================================|

    @Override public void execTwoMethods(int[] v, final int n) {
        this.defaultBubbleSort(v, n);
        Utils.printArray(v);
        this.reverseBubbleSort(v, n);
        Utils.printArray(v);
    }
}
