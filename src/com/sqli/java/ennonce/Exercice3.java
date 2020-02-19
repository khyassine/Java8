package com.sqli.java.ennonce;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Exercice3 {

    public static void main(String[] args) {
        //3  Supprimer les duplicatas dans une liste de chaines

        List<String> paysAvecDuplications = Arrays.asList("Egypt", "Algeria", "Kazakhstan",
                "Turkey", "Madagascar", "Belgium", "Greece", "Thailand", "Gambia", "Lebanon",
                "Serbia", "India", "Slovakia", "Belgium",
                "Romania", "Egypt", "India", "China", "China", "South", "Africa",
                "Moldova", "Germany", "Denmark",
                "Bangladesh", "Syria", "Ireland",
                "Italy");

        System.out.printf("nombre des éléments avec dupplications = %d %n", paysAvecDuplications.size());
        Set<String> paysSansDuplications = new TreeSet<>(paysAvecDuplications);
        System.out.printf("nombre des éléments sans dupplications = %d %n", paysSansDuplications.size());

        //Supprimer les duplicatas dans une liste de chaines
        System.out.printf("nombre des éléments avec dupplications = %d %n", paysAvecDuplications.size());
        System.out.println(paysAvecDuplications.stream().collect(Collectors.toSet()).size());

    }
}
