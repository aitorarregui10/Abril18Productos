package com.softtek.repo;

import com.softtek.modelo.Producto;

import java.util.List;

public interface IProductoRepo {
    List<Producto> obtenerProducto();
    Producto obtenerUnProd(int product_id);
    Producto crearProducto(Producto p);
    void eliminarProducto(int product_id);
}
