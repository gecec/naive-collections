package org.gael.naive.sort;

public class SelectSort {
    public int [] sort(int [] array){
        int length = array.length;
        int [] result = new int[length];
        System.arraycopy(array, 0, result, 0, length);

        for (int i = 0; i < length - 1; i++){
            int minIndex = i;

            for (int j = i+1; j < length; j++) {
                if (result[j] < result[minIndex]) {
                    minIndex = j;
                }
            }

            SortUtils.swap(result, i, minIndex);
        }

        return result;
    }
}
