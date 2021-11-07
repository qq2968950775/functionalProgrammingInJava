package com.test.t2;

import com.test.interfaceDao.Function3;

/**
 * 复合函数 使用lambda
 */
public class Test233<T> {
    public static void main(String[] args) {


        Function2<Integer, Integer> function2 = x -> x*3;

        Function2<Integer, Integer> square = x -> x*x;
        //重写了apply方法
        Function3<Function3<Integer,Integer>,Function3<Integer,Function3<Integer,Integer>>> compose
                = x-> y-> z-> x.apply(y.apply(z));

        //Function3<Integer,Integer> tripe = x -> x*3;


        //18
        System.out.println(compose(square,function2).apply(3));
    }

    static Function2<Integer, Integer> compose(final Function2<Integer, Integer> f1, final Function2<Integer, Integer> f2){
        return x -> f1.apply(f2.apply(x));
    }
}
