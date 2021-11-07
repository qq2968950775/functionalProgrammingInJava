package com.test.t2;

/**
 * 复合函数
 */
public class Test223 {
    public static void main(String[] args) {

        Function function = new Function() {
            @Override
            public int apply(int arg) {
                return arg * 3;
            }
        };

        Function square = new Function() {
            @Override
            public int apply(int arg) {
                return arg * 2;
            }
        };
        //18
        System.out.println(compose(square,function).apply(3));
    }

    static Function compose(final Function f1, final Function f2){
        return new Function() {
            @Override
            public int apply(int arg) {
                return f1.apply(f2.apply(arg));
            }
        };
    }
}
