package com.softtek.modelo;

import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Producto {
    private int idProducto;
    private String nombreProducto;
    private double precioUnitario;
    private int unidadesStock;
    private int categoria;

    @Override
    public String toString() {
        return "\nProducto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", unidadesStock=" + unidadesStock +
                '}';
    }
}

