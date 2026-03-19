package Mock;

import ImplementsBubble.BS1;
import ImplementsInsertion.IN1;
import ImplementsSelection.SS1;
import Capsule.Algorithm.Inter.BubbleSort;
import Capsule.Algorithm.Inter.InsertionSort;
import Capsule.Algorithm.Inter.SelectionSort;
import QuickSort.QuickSort;
import Utils.Utils;

public class Mockage extends QuickSort {

    protected static void mockage1() {{
        {System.out.println("Mock .1");{{
        InsertionSort i = new IN1();
        i.execTwoMethods(Utils.randomVector(), Utils.randomVector().length);

        SelectionSort s = new SS1();
        s.execTwoMethods(Utils.randomVector(), Utils.randomVector().length);

        BubbleSort b = new BS1();
        b.execTwoMethods(Utils.randomVector(), Utils.randomVector().length);

    }{Utils.newLine();}}{System.out.println("Ordenação simples");}}}}

    protected static void mockage2(boolean op) {{
        {System.out.println("Mock .1");{{
            if (op) quickDefault();
            else quickReverse();
    }{Utils.newLine();}}{System.out.println("Quick Sort");}}}}
}
