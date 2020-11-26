/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pc2.entidades.Carro;

/**
 *
 * @author henrique
 */
public class CarroDAO {

    public static boolean inserir(Carro carro) {
        String sql = "insert into carros(placa, anomodelo, marca, modelo, anofabricacao, cpf_cliente) values (?, ?, ?, ?, ?, ?)";

        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, carro.getPlaca());
            statement.setInt(2, carro.getAnoModelo());
            statement.setString(3, carro.getMarca());
            statement.setString(4, carro.getModelo());
            statement.setInt(5, carro.getAnoFabricacao());
            statement.setString(6, carro.getCpfCliente());

            int res = statement.executeUpdate();

            if (res > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        } finally {
            ConnectionFactory.close(con);
        }
    }

    public static boolean alterar(Carro carro) {
        String sql = "update carros set anomodelo=?, marca=?, modelo=?, anofabricacao=?, cpf_cliente=? where placa=?";

        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setInt(1, carro.getAnoModelo());
            statement.setString(2, carro.getMarca());
            statement.setString(3, carro.getModelo());
            statement.setInt(4, carro.getAnoFabricacao());
            statement.setString(5, carro.getCpfCliente());

            statement.setString(6, carro.getPlaca());

            int res = statement.executeUpdate();

            if (res > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        } finally {
            ConnectionFactory.close(con);
        }
    }

    public static boolean excluir(Carro carro) {

        String sql = "delete from carros where placa=?";

        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, carro.getPlaca());

            int res = statement.executeUpdate();

            if (res > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        } finally {
            ConnectionFactory.close(con);
        }
    }

    public static List<Carro> listarTodos() {

        String sql = "select * from carros";

        Connection con = ConnectionFactory.getConnection();

        List<Carro> list = new ArrayList<>();

        try {
            PreparedStatement statement = con.prepareStatement(sql);

            ResultSet set = statement.executeQuery();

            if (set != null) {
                while (set.next()) {
                    list.add(new Carro(set.getString(1), set.getInt(2), set.getString(3), set.getString(4),
                            set.getInt(5), set.getString(6)));
                }

                return list;

            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        } finally {
            ConnectionFactory.close(con);
        }
    }

    public static List<Carro> pesquisar(String modelo) {

        String sql = "select * from carros where modelo=?";

        Connection con = ConnectionFactory.getConnection();

        List<Carro> list = new ArrayList<>();

        try {
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, modelo);

            ResultSet set = statement.executeQuery();

            if (set != null) {
                while (set.next()) {
                    list.add(new Carro(set.getString(1), set.getInt(2), set.getString(3), set.getString(4),
                            set.getInt(5), set.getString(6)));
                }

                return list;

            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        } finally {
            ConnectionFactory.close(con);
        }
    }

    public static Carro[] listarTodosArray() {

        String sql = "select * from carros";

        Connection con = ConnectionFactory.getConnection();

        List<Carro> list = new ArrayList<>();

        try {
            PreparedStatement statement = con.prepareStatement(sql);

            ResultSet set = statement.executeQuery();

            if (set != null) {
                while (set.next()) {
                    list.add(new Carro(set.getString(1), set.getInt(2), set.getString(3), set.getString(4),
                            set.getInt(5), set.getString(6)));
                }

                return (Carro[]) list.toArray();

            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        } finally {
            ConnectionFactory.close(con);
        }
    }
}
