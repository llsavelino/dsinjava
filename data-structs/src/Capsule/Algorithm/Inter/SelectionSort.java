package Capsule.Algorithm.Inter;

public interface SelectionSort {
    default void defaultSelectionSort(int[] a, final int n){ return; }
    default void reverseSelectionSort(int[] a, final int n){ return; }
    default void execTwoMethods(int[] v, final int n) { return; }
}
