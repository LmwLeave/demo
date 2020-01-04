package com.example.demo.knowledge;

public class StringTest {
    public static void main(String[] args) {
        testEquals();
    }
    static void testNew() {
        //        String x = new String("沉默王二");
//        x = "沉默王三";
        StringBuilder x = new StringBuilder("沉默王二");
        change(x);
        System.out.println(x);
    }
    public static void change(StringBuilder x) {
        x.delete(3,4).append("三");
    }

    static void testEquals() {
        String a = "2343";
        String b = "2343";
        System.out.println(a==b);
    }
}
