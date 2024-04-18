package com.softtek._optional;

import java.util.Optional;

public class EjerciciosOptional1 {
    private void validarUsuario(Optional<String> nombreUsuario) {
        if (nombreUsuario.isPresent() && !nombreUsuario.get().isEmpty()) {
            System.out.println("El usuario es válido: " + nombreUsuario.get());
        } else {
            System.out.println("Nombre de usuario inválido");
        }
    }

    public static void main(String[] args) {
        EjerciciosOptional1 validacion = new EjerciciosOptional1();

        Optional<String> usuarioValido = Optional.of("Juan");
        validacion.validarUsuario(usuarioValido);

        Optional<String> usuarioNulo = Optional.ofNullable(null);
        validacion.validarUsuario(usuarioNulo);

        Optional<String> usuarioVacio = Optional.of("");
        validacion.validarUsuario(usuarioVacio);
    }
}