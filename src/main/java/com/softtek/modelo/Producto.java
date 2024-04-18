package com.softtek.modelo;

import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Producto {
    private int product_id;
    private String nombreProducto;
    private double precioUnitario;
    private int unidadesStock;
    private int categoria;
/*
    @Override
    public String toString() {
        return "\nProducto{" +
                "product_id=" + product_id +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", unidadesStock=" + unidadesStock +
                '}';
    }*/
}

