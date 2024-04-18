package com.softtek.servicio;

import com.softtek.modelo.Producto;

import java.sql.SQLException;
import java.util.List;

public interface IProductoServicio {
    List<Producto> obtenerProducto() throws SQLException, ClassNotFoundException;
    Producto obtenerUnProd(int p) throws SQLException, ClassNotFoundException;
    Producto crearProducto(Producto p) throws SQLException, ClassNotFoundException;
    void eliminarProducto(int product_id) throws SQLException, ClassNotFoundException;
    Producto modificarProducto(Producto p) throws SQLException, ClassNotFoundException;

}