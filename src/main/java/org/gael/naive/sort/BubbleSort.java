package org.gael.naive.sort;

public class BubbleSort {
    public int [] sort(int [] array){
        int length = array.length;

        int [] result = new int[length];

        System.arraycopy(array, 0, result, 0, length);

        for (int i = (length - 1); i > 1; i--){
            for (int j = 0; j<i; j++){
                if (result[j] > result[j+1]){
                    swap(result, j, j+1);
                }
            }
        }

        return result;
    }

    private void swap(int [] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
