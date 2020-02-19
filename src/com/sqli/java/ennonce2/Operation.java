package com.sqli.java.ennonce2;

@FunctionalInterface
interface Operation<T> {
     static int methode(int a, int b){
            return a*b;
        }

    T performOperation(T operandeA, T operandeB);
}