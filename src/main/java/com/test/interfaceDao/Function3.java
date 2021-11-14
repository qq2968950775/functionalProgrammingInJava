package com.test.interfaceDao;

import com.test.t2.Function2;

import java.util.function.Function;

/**
 * 多态函数
 */
public interface Function3<T,U> {
    Function3<T,Function3<T,T>> apply(Function3<T,Function3<T,T>>  arg);

    static <T, U, V> Function<Function<U, V>, Function<Function<T, U>, Function<T, V>>> higherCompose() {
        return f -> g -> x -> f.apply(g.apply(x));
    }

}
