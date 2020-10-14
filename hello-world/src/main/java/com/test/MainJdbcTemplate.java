package com.test;

import com.test.pojo.Item;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MainJdbcTemplate {

    public static void main(String[] args) throws SQLException, InterruptedException {
        // POZOR! PRED SPUSTENIM TETO METODY SPUSTIT hsqldb-eshop/bin/startup.bat
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        dataSource.setJdbcUrl("jdbc:hsqldb:hsql://localhost/eshop");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

//        List<String> strings = jdbcTemplate.queryForList("select name from item", String.class);
//        strings.forEach(System.out::println);

        List<Item> items = jdbcTemplate.query("select item_id, name from item", (rs, i) -> {
            return Item.builder()
                    .id(rs.getInt("item_id"))
                    .name(rs.getString("name"))
                    .build();
//            return new Item(rs.getInt("item_id"), rs.getString("name"));
        });
        items.forEach(System.out::println);


//        // try-with-resources block
//        try(Connection connection = dataSource.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement("select item_id, name from item");
//            ResultSet resultSet = preparedStatement.executeQuery()) {
//            while(resultSet.next()) {
//                int id = resultSet.getInt("item_id");
//                String name = resultSet.getString("name");
//                System.out.println(id + " " + name);
//            }
//        }

        System.out.println("done");
    }

}
