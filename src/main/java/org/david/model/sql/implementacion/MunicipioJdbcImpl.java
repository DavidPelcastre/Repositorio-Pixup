package org.david.model.sql.implementacion;

import org.david.model.registrarUsuario.Municipio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MunicipioJdbcImpl extends CatalogoJdbcImpl<Municipio> {
    private static MunicipioJdbcImpl instance;

    private MunicipioJdbcImpl() {}

    public static MunicipioJdbcImpl getInstance() {
        if (instance == null) {
            instance = new MunicipioJdbcImpl();
        }
        return instance;
    }

    @Override
    public List<Municipio> findAll() {
        List<Municipio> list = new ArrayList<>();
        String sql = "SELECT * FROM TBL_MUNICIPIO";

        try {
            if (!openConnection()) {
                System.out.println("No se pudo abrir la conexión.");
                return null;
            }

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                Municipio m = new Municipio();
                m.setId(rs.getInt("id"));
                m.setNombre(rs.getString("nombre"));
                m.setIdEstado(rs.getInt("idEstado")); // Relación con Estado
                list.add(m);
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
    public boolean guardar(Municipio m) {
        String sql = "INSERT INTO TBL_MUNICIPIO (nombre, idEstado) VALUES (?, ?)";

        try {
            if (!openConnection()) return false;

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, m.getNombre());
            ps.setInt(2, m.getIdEstado()); // Relación con Estado

            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    m.setId(rs.getInt(1));
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
    public boolean actualizar(Municipio m) {
        String sql = "UPDATE TBL_MUNICIPIO SET nombre = ?, idEstado = ? WHERE id = ?";

        try {
            if (!openConnection()) return false;

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, m.getNombre());
            ps.setInt(2, m.getIdEstado()); // Relación con Estado
            ps.setInt(3, m.getId());

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
        String sql = "DELETE FROM TBL_MUNICIPIO WHERE id = ?";

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
