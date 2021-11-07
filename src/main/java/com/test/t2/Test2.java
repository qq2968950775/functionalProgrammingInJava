package com.test.t2;

public class Test2 {
    public static void main(String[] args) {
        Function function = new Function() {
            @Override
            public int apply(int arg) {
                return arg * 3;
            }
        };

        System.out.println(function.apply(3));
    }
}
