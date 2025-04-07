package org.david.model.sql.implementacion;


import org.david.model.agregarDisco.Cancion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CancionJdbcImpl extends CatalogoJdbcImpl<Cancion> {
    private static CancionJdbcImpl instance;

    private CancionJdbcImpl() {}

    public static CancionJdbcImpl getInstance() {
        if (instance == null) {
            instance = new CancionJdbcImpl();
        }
        return instance;
    }

    @Override
    public List<Cancion> findAll() {
        List<Cancion> list = new ArrayList<>();
        String sql = "SELECT * FROM TBL_CANCION";

        try {
            if (!openConnection()) return null;

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                Cancion c = new Cancion();
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setDuracion(rs.getString("duracion"));
                c.setIdDisco(rs.getInt("idDisco"));
                list.add(c);
            }

            rs.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeConnection();
        }

        return list;
    }

    @Override
    public boolean guardar(Cancion c) {
        String sql = "INSERT INTO TBL_CANCION (nombre, duracion, idDisco) VALUES (?, ?, ?)";

        try {
            if (!openConnection()) return false;

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getDuracion());
            ps.setInt(3, c.getIdDisco());

            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    c.setId(rs.getInt(1));
                }
                rs.close();
                ps.close();
                return true;
            }

            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeConnection();
        }

        return false;
    }

    @Override
    public boolean actualizar(Cancion c) {
        String sql = "UPDATE TBL_CANCION SET nombre = ?, duracion = ?, idDisco = ? WHERE id = ?";

        try {
            if (!openConnection()) return false;

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getDuracion());
            ps.setInt(3, c.getIdDisco());
            ps.setInt(4, c.getId());

            int affectedRows = ps.executeUpdate();
            ps.close();

            return affectedRows > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeConnection();
        }

        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "DELETE FROM TBL_CANCION WHERE id = ?";

        try {
            if (!openConnection()) return false;

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            int affectedRows = ps.executeUpdate();
            ps.close();

            return affectedRows > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeConnection();
        }

        return false;
    }
}
