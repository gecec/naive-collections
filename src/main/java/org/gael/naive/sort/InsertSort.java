package org.gael.naive.sort;

public class InsertSort {
    public int [] sort(int [] array){
        int length = array.length;
        int [] result = new int[length];
        System.arraycopy(array, 0, result, 0, length);

        for (int i = 1; i < length; i++){
            int temp = result[i];

            int j = i;
            while ((j > 0) && (result[j-1] >= temp)){
                result[j] = result[--j];
            }

            result[j] = temp;
        }

        return result;
    }
}
