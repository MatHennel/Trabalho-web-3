package br.com.trabalhofinal.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private ConnectionFactory(){}

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver encontrado");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver nao encontrado");
            throw new RuntimeException(ex);
        }

        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/DespesasDB", "root", "");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
