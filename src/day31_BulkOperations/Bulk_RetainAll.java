package day31_BulkOperations;

import javafx.scene.chart.AxisBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RetainAll {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        //only keep 1,2,3,4
        list.retainAll(Arrays.asList(1,2,3));//will only keep listed 3 numbers
        System.out.println(list);

    }
}
