package com.softtek.servicio;

import com.softtek.modelo.Producto;

import java.sql.SQLException;

public interface IProductoServicio {
    Producto obtenerProducto() throws SQLException, ClassNotFoundException;
    Producto obtenerUnProd(Producto p);
    Producto crearProducto(Producto p);
    void eliminarProducto(int product_id);

}