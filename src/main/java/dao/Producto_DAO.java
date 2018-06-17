package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import conexion.Conexion;
import exceptions.SinConexionException;
import modelo.Producto;

public class Producto_DAO {

	private Conexion conexion;

	public Producto_DAO() {
		this.conexion = new Conexion();
	}

	public Producto_DAO(Conexion conexion) {
		this.conexion = conexion;
	}

	public Conexion getConexion() {
		return conexion;
	}

	public void setConexion(Conexion conexion) {
		this.conexion = conexion;
	}

	public void Insetar_Alumnos(Producto producto) throws SQLException, SinConexionException {
		java.sql.Statement st = conexion.obtenerConexion().createStatement();
		st.executeUpdate("INSERT INTO producto (codigo,nombre,valor,mano_obra) VALUES ('" + producto.getCodigo() + "','"
				+ producto.getNombre() + "'," + producto.getValor() + "," + producto.getManoDeObra() + ");");
	}

	public List<Producto> Consulta_Productos(String nombre) throws SQLException, SinConexionException {
		List<Producto> producto = new ArrayList<Producto>();
		java.sql.Statement st = conexion.obtenerConexion().createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM producto Where nombre = '" + nombre + "';");
		while (rs.next()) {
			producto.add(new Producto(rs.getString("codigo"), rs.getString("nombre"), rs.getInt("valor"),
					rs.getInt("mano_obra")));
		}
		return producto;
	}

}
