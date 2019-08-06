package org.gael.naive;

import org.gael.naive.sort.BubbleSort;
import org.gael.naive.sort.InsertSort;
import org.gael.naive.sort.SelectSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class Main {
    @Test
    public void testBubleSort(){
        int test[] = new int[] {1, 6, 3, 2, 9};
        BubbleSort bubbleSort = new BubbleSort();
        int result[] = bubbleSort.sort(test);
        Arrays.sort(test);
        assertArrayEquals(test, result);
    }

    @Test
    public void testSelectSort(){
        int test[] = new int[] {1, 6, 3, 2, 9};
        SelectSort selectSort = new SelectSort();
        int result[] = selectSort.sort(test);
        Arrays.sort(test);
        assertArrayEquals(test, result);
    }

    @Test
    public void testInsertSort(){
        int test[] = new int[] {1, 6, 3, 2, 9};
        InsertSort insertSort = new InsertSort();
        int result[] = insertSort.sort(test);
        Arrays.sort(test);
        assertArrayEquals(test, result);
    }
}
