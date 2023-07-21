package com.genesys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Connect {
    private static String dbUrl = "jdbc:sqlite:/home/thawes/src/projects/java/Quotes/sqlite.db";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbUrl);
        } catch (SQLException exc) {
            System.out.println(exc.getMessage());
        }
        return conn;
    }

    public static void createNewTable() {
        Connection conn = connect();
        String createTable = "CREATE TABLE IF NOT EXISTS quotes (\n"
            + "                id integert PRIMARY KEY,\n"
            + "                quote text NOT NULL,\n"
            + "                author text NOT NULL\n"
            + ");";
        try {
            Statement stmt = conn.createStatement();
            stmt.execute(createTable);
        } catch (SQLException exc) {
            System.out.println(exc.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException exc) {
                System.out.println(exc.getMessage());
            }
        }
    }

    public static void addQuote(String quote, String author) {
        String insertSql = "INSERT INTO quotes (quote, author) VALUES (?,?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(insertSql)){
            pstmt.setString(1, quote);
            pstmt.setString(2, author);
            pstmt.executeUpdate();
        } catch (SQLException exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void getQuotes() {
        String selectAll = "SELECT * FROM quotes";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectAll)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                                   rs.getString("quote") + "\t" +
                                   rs.getString("author"));
            }
        } catch (SQLException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
