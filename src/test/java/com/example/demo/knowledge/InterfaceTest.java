package com.example.demo.knowledge;

public interface InterfaceTest {
    // 求平方根
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
    // 求平方根
    default double sqrt2(int a) {
        return Math.sqrt(a);
    }
    public static void main(String[] args){
        InterfaceTest test = new InterfaceTest() {
            @Override
            public double sqrt(int a) {
                return 0;
            }
        };
    }
}
