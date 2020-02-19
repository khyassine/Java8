package com.sqli.java.ennonce2;

import com.sqli.java.ennonce.Produit;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercices {

    /**
     * Cette méthode doit renvoyer la somme d'une liste d'entiers
     * renvoyer 0 si la  liste est nulle ou vide
     *
     * @param integers entrée
     * @return int
     */
    public int arraySum(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).sum();
    }

    /**
     * Cette méthode doit renvoyer la somme des nombres impaires depuis une liste d'entiers
     * renvoyer 0 si le tableau est null ou vide
     * hint : penser à réutilser la méthode ci-dessus
     *
     * @param integers entrée
     * @return int
     */
    public int sumOfOddNumbers(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::valueOf).filter(integer->integer%2!=0).sum();
    }

    /**
     * Trier une liste de chaines de caractères par leurs longeurs
     *
     * @param stringList entrée
     * @return List
     */
    public List<String> sortStringsByLength(List<String> stringList) {
        return stringList.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
    }

    /**
     * Convertir les chaînes de caractères en etnrée en format majuscule
     * Exemple : "une chaine" ==> "UNE CHAINE"
     *
     * @param words entrée
     * @return String
     */
    public List<String> convertToUpperCase(List<String> words) {
        return words;
    }

    /**
     * Utiliser l'API stream pour performOperation le factorial d'un nombre entier positif < 10
     *
     * @param n entrée
     * @return int
     */
    public int factorial(int n) {
        throw new UnsupportedOperationException("not implemented yet !");

    }

}
