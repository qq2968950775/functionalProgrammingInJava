package com.test.t2;

import com.test.interfaceDao.Function7;

/**
 * 将函数转化为柯里化函数
 */
public class Test239<T, U, V> {
    private static String format = "%s, %s, %s, %s";

    public static <A, B, C, D> Function7<A, Function7<B, Function7<C, Function7<D, String>>>> f() {
        return a -> b -> c -> d -> String.format(format, a, b, c, d);
    }
}
