package org.gael.naive.sort;

public class SortUtils {
    public static void swap(int [] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
