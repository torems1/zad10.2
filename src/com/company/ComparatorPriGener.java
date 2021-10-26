package com.company;

public class ComparatorPriGener {
    public Integer[] reversed(Integer[] array) {
        Integer[] arrayReverse = new Integer[array.length];
        for (int i = (array.length - 1), j = 0; i >= 0; i--){
            arrayReverse[j] = array[i];
            j++;
        }
        return arrayReverse;
    }
}
