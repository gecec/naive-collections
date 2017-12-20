package org.gael.naive;

import org.gael.naive.sort.BubbleSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main");
    }

    @Test
    public void testBubleSort(){
        int test[] = new int[] {1, 6, 3, 2, 9};
        BubbleSort bubbleSort = new BubbleSort();
        int result[] = bubbleSort.sort(test);
        Arrays.sort(test);
        assertArrayEquals(test, result);
    }
}
