package com.test.interfaceDao;


public interface Function7<T, U> {

  U apply(T arg);

  static <T, U, V> Function7<Function7<U, V>, Function7<Function7<T, U>, Function7<T, V>>> higherCompose() {
    return f -> g -> x -> f.apply(g.apply(x));
  }

  static <T, U, V> Function7<Function7<T, U>, Function7<Function7<U, V>, Function7<T, V>>> higherAndThen() {
    return f -> g -> z -> g.apply(f.apply(z));
  }
}
