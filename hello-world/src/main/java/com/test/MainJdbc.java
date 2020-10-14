package com.test;

import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainJdbc {

    public static void main(String[] args) throws SQLException, InterruptedException {
        // POZOR! PRED SPUSTENIM TETO METODY SPUSTIT hsqldb-eshop/bin/startup.bat
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        dataSource.setJdbcUrl("jdbc:hsqldb:hsql://localhost/eshop");

        // try-with-resources block
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select item_id, name from item");
            ResultSet resultSet = preparedStatement.executeQuery()) {
            while(resultSet.next()) {
                int id = resultSet.getInt("item_id");
                String name = resultSet.getString("name");
                System.out.println(id + " " + name);
            }
        }

        System.out.println("done");
    }

}
