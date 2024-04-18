package com.softtek.repo;

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
        Producto p = null;
        String query = "SELECT * FROM products WHERE product_id=?;";
        PreparedStatement ps = miConexion.prepareStatement(query);
        ps.setInt(1,product_id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()){
            p = new Producto(
                rs.getInt("product_id"),
                rs.getString("product_name"),
                rs.getDouble("unit_price"),
                rs.getInt("units_in_stock"),
                rs.getInt("category_id")
            );
        }
        return p;
    }

    @Override
    public Producto crearProducto(Producto p) throws SQLException, ClassNotFoundException{
        abrirConexion();
        String sql= "INSERT INTO products (product_id, product_name,unit_price,units_in_stock,category_id) VALUES (?,?,?,?,?)";
        PreparedStatement ps = miConexion.prepareStatement(sql);

        ps.setInt(1,p.getProduct_id());
        ps.setString(2,p.getNombreProducto());
        ps.setDouble(3,p.getPrecioUnitario());
        ps.setInt(4,p.getUnidadesStock());
        ps.setInt(5,p.getCategoria());

        if (ps.executeUpdate()>0){
            return p;
        } else {
            return null;
        }
    }

    @Override
    public Producto modificarProducto(Producto p) throws SQLException, ClassNotFoundException {
        abrirConexion();
        String query = "UPDATE products SET units_in_stock=? WHERE product_id=?";
        PreparedStatement ps = miConexion.prepareStatement(query);
        ps.setInt(1,p.getUnidadesStock());
        ps.setInt(2,p.getProduct_id());
        ps.executeUpdate();
        return p;
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
