package com.test.t2;

/**
 * 复合函数 使用lambda
 */
public class Test225_ {
    public static void main(String[] args) {


        Function2<Integer, Integer> function2 = x -> x*3;

        Function2<Integer, Integer> square = x -> x*x;

        //18
        System.out.println(compose(square,function2).apply(3));
    }

    static Function2<Integer, Integer> compose(final Function2<Integer, Integer> f1, final Function2<Integer, Integer> f2){
        return x -> f1.apply(f2.apply(x));
    }
}
