package com.test.interfaceDao;

import java.util.List;
import java.util.function.Function;

/**
 * 多态函数
 */
public interface Function4<T,U> {
    Function4<T, Function4<T,T>> apply(Function4<T, Function4<T,T>> arg);

    static <T, U, V> Function<Function<U, V>, Function<Function<T, U>, Function<T, V>>> higherCompose() {
        return f -> g -> x -> f.apply(g.apply(x));
    }

    public <T> Restlt<T> ifElse(List<Boolean> conditions,List<T> ifTrue){
        return conditions.zip(ifTrue)
                .flatMap(x -> x.frist(y->y._1))
                .map(x -> x.x_2);
    }
    public <T> Restlt<T> ifElse2(List<Boolean> conditions,List<T> ifTrue){
         Function<Tuple<Boolean,T>> f1 = y -> y._1;
        return conditions.zip(ifTrue)
                .flatMap(f1)
                .map(x -> x.x_2);
    }
    
}
