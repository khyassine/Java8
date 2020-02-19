package com.sqli.java.ennonce2;

import java.util.Optional;

public class OptionalExercices {

    /**
     * Cette méthode doit renvoyer un nome d'utilisateur depuis une chaine de caractères
     * Le nom d'utilisateur est composé des 4 premiers caractères
     * <p>
     * renvoyer "" si le format de l'entrée n'est pas adéquat
     * <p>
     * Utiliser {@link Optional}
     *
     * @param userNameAndPassword entrée
     * @return String
     */
    public String getUserName(String userNameAndPassword) {
        return Optional.ofNullable(userNameAndPassword)
                .filter(s->s.length()>=4)
                .map(s -> s.substring(0,4))
                .orElse("");
    }

    /**
     * Compléter cette méthode pour effectuer la division entre 2 nombres
     * si le diviseur b n'est pas null et est !=0, effectuer la division,
     * sinon ne pas diviser par 0 !
     * Un optional vide veut dire que la division n'est pas effectuée
     * @param a double
     * @param b double
     * @return Optional
     */
    public Optional<Double> division(Double a, Double b) {
        return Optional.ofNullable(b)
                .filter(number->number!=0.0)
                .map(number->a/number);
    }
}