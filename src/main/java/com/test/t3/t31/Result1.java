package com.test.t3.t31;

public interface Result1 {
    public class Success implements Result1{}

    public class Failure implements Result1{
        private final String errorMessage;

        public  Failure(String s){
            this.errorMessage = s;
        }

        public String getMessage(){
            return errorMessage;
        }
    }
}
