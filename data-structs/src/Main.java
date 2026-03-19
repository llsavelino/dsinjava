import Mock.Mockage;
import Utils.Utils;

public class Main extends Mockage {

    private static boolean swapped;

    private static void gnomeSort(int[] a, final int n) {
        if (a == null || n < 2 || Utils.is0toN(a, n)) return;
        int index = 0;
        while (index < n) {
            if (index == 0 || a[index] >= a[index - 1]) index++;
            else { Utils.swapperBubble(a, index - 1); index--; }
        }
    }

    private static void reverseGnomeSort(int[] a, final int n) {
        if (a == null || n < 2 || Utils.isNto0(a, n)) return;
        int index = 0;
        while (index < n) {
            if (index == 0 || a[index] <= a[index - 1]) index++;
            else { Utils.swapperBubble(a, index - 1); index--; }
        }
    }

    private static void shellSort(int[] a, final int n) {
        if (a == null || n < 2 || Utils.is0toN(a, n)) return;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = a[i], j;
                for (j = i; j >= gap && a[j - gap] > temp; j -= gap) a[j] = a[j - gap];
                a[j] = temp;
            }
        }
    }

    private static void reverseShellSort(int[] a, final int n) {
        if (a == null || n < 2 || Utils.isNto0(a, n)) return;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = a[i], j;
                for (j = i; j >= gap && a[j - gap] < temp; j -= gap) a[j] = a[j - gap];
                a[j] = temp;
            }
        }
    }

    private static void combSort(int[] a, final int n) {
        if (a == null || n < 2 || Utils.is0toN(a, n)) return;
        int gap = n;
        boolean shrink = true;
        while (gap != 1 || shrink) {
            gap = (gap * 10) / 13;
            if (gap < 1) gap = 1;
            shrink = false;
            for (int i = 0; i < n - gap; i++) {
                if (a[i] > a[i + gap]) { Utils.swapperSelection(a, i, i + gap); shrink = true; }
            }
        }
    }

    private static void reverseCombSort(int[] a, final int n) {
        if (a == null || n < 2 || Utils.isNto0(a, n)) return;
        int gap = n;
        boolean shrink = true;
        while (gap != 1 || shrink) {
            gap = (gap * 10) / 13;
            if (gap < 1) gap = 1;
            shrink = false;
            for (int i = 0; i < n - gap; i++) {
                if (a[i] < a[i + gap]) { Utils.swapperSelection(a, i, i + gap); shrink = true; }
            }
        }
    }

    private static void cocktailShakerSort(int[] a, final int n) {
        if (a == null || n < 2 || Utils.is0toN(a, n)) return;
        int start = 0, end = n - 1;
        while (start < end) {
            swapped = false;
            for (int i = start; i < end; i++)
                if (a[i] > a[i + 1]) swapped = Utils.swapperBubble(a, i);
            if (!swapped) break;
            end--;
            swapped = false;
            for (int i = end - 1; i >= start; i--)
                if (a[i] > a[i + 1]) swapped = Utils.swapperBubble(a, i);
            start++;
        }
    }

    private static void reverseCocktailShakerSort(int[] a, final int n) {
        if (a == null || n < 2 || Utils.isNto0(a, n)) return;
        int start = 0, end = n - 1;
        while (start < end) {
            swapped = false;
            for (int i = start; i < end; i++)
                if (a[i] < a[i + 1]) swapped = Utils.swapperBubble(a, i);
            if (!swapped) break;
            end--;
            swapped = false;
            for (int i = end - 1; i >= start; i--)
                if (a[i] < a[i + 1]) swapped = Utils.swapperBubble(a, i);
            start++;
        }
    }

    private static void cycleSort(int[] a, final int n) {
        if (a == null || n < 2) return;
        for (int cycleStart = 0; cycleStart <= n - 2; cycleStart++) {
            int item = a[cycleStart], pos = cycleStart;
            for (int i = cycleStart + 1; i < n; i++) if (a[i] < item) pos++;
            if (pos == cycleStart) continue;
            while (item == a[pos]) pos++;
            int temp = a[pos]; a[pos] = item; item = temp;
            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < n; i++) if (a[i] < item) pos++;
                while (item == a[pos]) pos++;
                temp = a[pos]; a[pos] = item; item = temp;
            }
        }
    }

    private static void reverseCycleSort(int[] a, final int n) {
        if (a == null || n < 2) return;
        for (int cycleStart = 0; cycleStart <= n - 2; cycleStart++) {
            int item = a[cycleStart], pos = cycleStart;
            for (int i = cycleStart + 1; i < n; i++) if (a[i] > item) pos++;
            if (pos == cycleStart) continue;
            while (item == a[pos]) pos++;
            int temp = a[pos]; a[pos] = item; item = temp;
            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < n; i++) if (a[i] > item) pos++;
                while (item == a[pos]) pos++;
                temp = a[pos]; a[pos] = item; item = temp;
            }
        }
    }

    private static void pancakeSort(int[] a, final int n) {
        if (a == null || n < 2) return;
        for (int currSize = n; currSize > 1; --currSize) {
            int mi = 0;
            for (int i = 0; i < currSize; i++) if (a[i] > a[mi]) mi = i;
            if (mi != currSize - 1) { flip(a, mi); flip(a, currSize - 1); }
        }
    }

    private static void reversePancakeSort(int[] a, final int n) {
        if (a == null || n < 2) return;
        for (int currSize = n; currSize > 1; --currSize) {
            int mi = 0;
            for (int i = 0; i < currSize; i++) if (a[i] < a[mi]) mi = i;
            if (mi != currSize - 1) { flip(a, mi); flip(a, currSize - 1); }
        }
    }

    private static void flip(int[] a, int i) {
        int temp, start = 0;
        while (start < i) {
            temp = a[start]; a[start] = a[i]; a[i] = temp;
            start++; i--;
        }
    }

    public static void main(String[] noneArgs) {
        mockage1();
        mockage2(true);
        mockage2(false);
    }
}