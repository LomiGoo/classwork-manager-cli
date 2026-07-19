package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static final String URL = "jdbc:sqlite:classwork.sqlite";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
