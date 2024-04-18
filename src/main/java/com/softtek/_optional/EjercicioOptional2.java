package com.softtek._optional;

import java.util.List;
import java.util.Optional;
public class EjercicioOptional2 {
    private static final String ValorPredeterminado = "Aquí no hay nada que mostrar, elige mejor";

    private String obtenerValorLista(List<String>lista, int posicion){
        Optional<String>optionalValor = Optional.empty();

        if (!lista.isEmpty() && posicion >= 0 && posicion < lista.size()){
            optionalValor = Optional.of(lista.get(posicion));
        }
        return optionalValor.orElse(ValorPredeterminado);
    }

    public static void main(String[] args) {
        EjercicioOptional2 ej2 = new EjercicioOptional2();

        List<String> lista1 = List.of("Francisco","Ermenegildo","Rencesvinto","Manolo");
        int posicionLista1 = 1;
        System.out.println("El valor en la posición " + posicionLista1 + " es: " + ej2.obtenerValorLista(lista1, posicionLista1));

        List<String>lista2 = List.of();
        int posicionLista2 = 0;
        System.out.println("El valor en la posición " + posicionLista2 + " es: " + ej2.obtenerValorLista(lista2, posicionLista2));

        List<String>lista3 = List.of("Julian","Manuel","Nacho");
        int posicionLista3 = 5;
        System.out.println("El valor en la posición " + posicionLista3 + " es: " + ej2.obtenerValorLista(lista3, posicionLista3));

    }
}
