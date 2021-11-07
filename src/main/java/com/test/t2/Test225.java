package com.test.t2;

/**
 * 复合函数
 */
public class Test225 {
    public static void main(String[] args) {


        Function2<Integer, Integer> function2 = new Function2<Integer, Integer>() {
            @Override
            public Integer apply(Integer arg) {
                return arg+1;
            }
        };

        Function2<Integer, Integer> square = new Function2<Integer, Integer>() {
            @Override
            public Integer apply(Integer arg) {
                return arg*2;
            }
        };
        //18
        System.out.println(compose(square,function2).apply(3));
        int funm = 10000;
        Function2<Integer,Integer> g = null;
        for (int i = 0; i < 10000; i++) {
            g = compose(function2,square);
        }
        System.out.println(g.apply(1));

    }

    static Function2<Integer, Integer> compose(final Function2<Integer, Integer> f1, final Function2<Integer, Integer> f2){
        return new Function2<Integer, Integer>() {
            @Override
            public Integer apply(Integer arg) {
                return f1.apply(f2.apply(arg));
            }
        };
    }
}
