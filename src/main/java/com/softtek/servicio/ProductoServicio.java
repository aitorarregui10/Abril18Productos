package com.softtek.servicio;

import com.softtek.modelo.Producto;
import com.softtek.repo.IProductoRepo;
import com.softtek.repo.ProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProductoServicio implements IProductoServicio{
    @Autowired
    private IProductoRepo repo;
    @Override
    public List<Producto> obtenerProducto() throws SQLException, ClassNotFoundException {
        return repo.obtenerProducto();
    }

    @Override
    public Producto obtenerUnProd(int product_id) throws SQLException, ClassNotFoundException {
        return repo.obtenerUnProd(product_id);
    }

    @Override
    public Producto crearProducto(Producto p) throws SQLException, ClassNotFoundException {
        return repo.crearProducto(p);
    }

    @Override
    public void eliminarProducto(int product_id) throws SQLException, ClassNotFoundException {
        repo.eliminarProducto(product_id);
    }

    @Override
    public Producto modificarProducto(Producto p) throws SQLException, ClassNotFoundException {
        return null;
    }
}
