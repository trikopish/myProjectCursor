package com.cursor.ed.lesson1;

public class Main {
    public static void main(String[] args) {
        byte a = 127 - 120;
        short b = (short) (1245 + a);
        int c = 7892567 % a;
        long d = 890567234456l / a;

        float x = 2.2f * a;
        double y = 3.3 * a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println();
        System.out.println(x);
        System.out.println(y);


    }
}
