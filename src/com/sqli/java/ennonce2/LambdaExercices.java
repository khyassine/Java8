package com.sqli.java.ennonce2;

public class LambdaExercices {

    /**
     * Permet de faire un calcul entre les opérandes a et b par une opération en paramètres
     *
     * @param a         int
     * @param b         int
     * @param operation {@link Operation}
     * @return int
     */

    private static int faireCalcul(int a, int b, Operation<Integer> operation) {
        return operation.performOperation(a, b);
    }

    /**
     * Permet d'appliquer une transformation entre deux chaines de
     * caractères a et b par une opération en paramètres
     *
     * @param a         String
     * @param b         String
     * @param operation {@link Operation}
     * @return String
     */
    private String transformer(String a, String b, Operation<String> operation) {
        return operation.performOperation(a, b);
    }

    /**
     * TODO : compléter par une expression lambda
     * Renvoyer le produit de deux nombres a et b
     *
     * @param a int
     * @param b int
     * @return int
     */
    public int multiplication(int a, int b) {
        return faireCalcul(a, b, (x, y) ->x*y);
    }

    /**
     * TODO : compléter par une expression lambda
     * Renvoyer la somme de deux nombres a et b
     *
     * @param a int
     * @param b int
     * @return int
     */
    public int addition(int a, int b) {
        return faireCalcul(a, b, (x, y) ->x+y );
    }

    /**
     * TODO : compléter par une expression lambda
     * Renvoyer la différence entre de deux nombres a et b
     *
     * @param a int
     * @param b int
     * @return int
     */
    public static int soustraction(int a, int b) {
        return faireCalcul(a, b, (x, y) ->x-y);
    }

    /**
     * TODO : compléter par une expression lambda
     * Permet de concaténer deux chaines de caractères
     *
     * @param a String
     * @param b String
     * @return String
     */
    public String concatener(String a, String b) {
        return transformer(a, b, (x, y) ->x+y);
    }



    public static void main(String  [] args){
       // Operation operation=(x,y)->;
    }
}


