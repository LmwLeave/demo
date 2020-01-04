package com.example.demo.knowledge;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        System.arraycopy(a, 1, a, 2, 2);
        System.out.println(Arrays.toString(a));
    }
}
