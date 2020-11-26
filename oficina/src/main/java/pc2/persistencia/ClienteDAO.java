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

import pc2.entidades.Cliente;

/**
 *
 * @author henrique
 */
public class ClienteDAO {
    public static boolean inserir(Cliente cliente) {
        String sql = "insert into clientes(cpf, nome, idade, rg, telefone) values (?, ?, ?, ?, ?)";

        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, cliente.getCpf());
            statement.setString(2, cliente.getNome());
            statement.setInt(3, cliente.getIdade());
            statement.setString(4, cliente.getRg());
            statement.setString(5, cliente.getTelefone());

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

    public static boolean alterar(Cliente cliente) {
        String sql = "update clientes set nome=?, idade=?, rg=?, telefone=? where cpf=?";

        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, cliente.getNome());
            statement.setInt(2, cliente.getIdade());
            statement.setString(3, cliente.getRg());
            statement.setString(4, cliente.getTelefone());

            statement.setString(5, cliente.getCpf());

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

    public static boolean excluir(Cliente cliente) {

        String sql = "delete from clientes where cpf=?";

        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, cliente.getCpf());

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

    public static List<Cliente> listarTodos() {

        String sql = "select * from clientes";

        Connection con = ConnectionFactory.getConnection();

        List<Cliente> list = new ArrayList<>();

        try {
            PreparedStatement statement = con.prepareStatement(sql);

            ResultSet set = statement.executeQuery();

            if (set != null) {
                while (set.next()) {
                    list.add(new Cliente(set.getString(1), set.getString(2), set.getInt(3), set.getString(4),
                            set.getString(5)));
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

    public static List<Cliente> pesquisar(String nome) {

        String sql = "select * from clientes where nome=?";

        Connection con = ConnectionFactory.getConnection();

        List<Cliente> list = new ArrayList<>();

        try {
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, nome);

            ResultSet set = statement.executeQuery();

            if (set != null) {
                while (set.next()) {
                    list.add(new Cliente(set.getString(1), set.getString(2), set.getInt(3), set.getString(4),
                            set.getString(5)));
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

    public static Cliente pesquisarCpf(String cpf) {

        String sql = "select * from clientes where cpf=?";

        Connection con = ConnectionFactory.getConnection();

        Cliente cliente = null;

        try {
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, cpf);

            ResultSet set = statement.executeQuery();

            if (set != null) {
                if (set.next()) {
                    cliente = new Cliente(set.getString(1), set.getString(2), set.getInt(3), set.getString(4),
                            set.getString(5));
                }

                return cliente;

            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        } finally {
            ConnectionFactory.close(con);
        }
    }

    public static Cliente[] listarTodosArray() {

        String sql = "select * from clientes";

        Connection con = ConnectionFactory.getConnection();

        List<Cliente> list = new ArrayList<>();

        try {
            PreparedStatement statement = con.prepareStatement(sql);

            ResultSet set = statement.executeQuery();

            if (set != null) {
                while (set.next()) {
                    list.add(new Cliente(set.getString(1), set.getString(2), set.getInt(3), set.getString(4),
                            set.getString(5)));
                }

                return (Cliente[]) list.toArray();

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
