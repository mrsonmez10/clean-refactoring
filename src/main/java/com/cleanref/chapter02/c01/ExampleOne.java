package com.cleanref.chapter02.c01;

import java.util.ArrayList;
import java.util.List;

public class ExampleOne {



    public List<int[]> getThem(int[][] theList) {
        List<int[]> list1 = new ArrayList<>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }

}
