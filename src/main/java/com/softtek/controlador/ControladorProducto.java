package com.softtek.controlador;


import com.softtek.modelo.Producto;
import com.softtek.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ControladorProducto {
    @Autowired
    private IProductoServicio servicio;
    @GetMapping
    public List<Producto> obtenerProducto() throws SQLException, ClassNotFoundException {
        return servicio.obtenerProducto();
    }
    @GetMapping("/{id}")
    public Producto obtenerUno(@PathVariable int product_id) throws SQLException, ClassNotFoundException {
        return servicio.obtenerUnProd(product_id);
    }
    @PostMapping
    public Producto crearProducto(@RequestBody Producto p) throws SQLException, ClassNotFoundException{
        return servicio.crearProducto(p);
    }
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable int id) throws SQLException, ClassNotFoundException{
        servicio.eliminarProducto(id);
    }

}
