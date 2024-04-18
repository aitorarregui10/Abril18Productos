package com.softtek.repo;
/*
import com.softtek.modelo.Producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Repository
public class ProductoRepo extends Conexion implements IProductoRepo {
    public Statement sentencia;
    public ResultSet resultado;
    @Override
    public List<Producto> obtenerProducto() throws SQLException, ClassNotFoundException {
        abrirConexion();
        String sql = "SELECT * FROM products;";
        List<Producto> productos = new ArrayList<>();
        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);
        while (resultado.next()) {
            productos.add(new Producto(resultado.getInt("product_id"),
                    resultado.getString("product_name"),
                    resultado.getDouble("unit_price"),
                    resultado.getInt("units_in_stock"),
                    resultado.getInt("category_id")));
        }
        return productos;
    }


    @Override
    public Producto obtenerUnProd(int product_id) throws SQLException, ClassNotFoundException {
        abrirConexion();
        String query = "SELECT * FROM products WHERE product_id=?;";
        PreparedStatement ps = miConexion.prepareStatement(query);
        ps.setInt(1,product_id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()){
            int id = rs.getInt("product_id");
            String nombre = rs.getString("product_name");
            double precio = rs.getDouble("unit_price");
            int stock = rs.getInt("units_in_stock");
            int categoria = rs.getInt("category_id");
            return new Producto(id, nombre, precio, stock, categoria);
        }
        return new Producto(int product_id);
    }

    @Override
    public Producto crearProducto(int product_id, int stock) throws SQLException, ClassNotFoundException {
        abrirConexion();
        String query = "UPDATE products SET units_in_stock=? WHERE product_id=?";
        PreparedStatement ps = miConexion.prepareStatement(query);
        ps.setInt(1,stock);
        ps.setInt(2,product_id);
        ps.executeUpdate();
        return new Producto();
    }

    @Override
    public void eliminarProducto(int product_id) throws SQLException, ClassNotFoundException {
        abrirConexion();
        String query = "DELETE FROM products WHERE product_id=?;";
        PreparedStatement ps = miConexion.prepareStatement(query);
        ps.setInt(1,product_id);
        ps.executeUpdate();
    }
}
*/