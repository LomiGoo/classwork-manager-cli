package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static final String URL = "jdbc:h2:/storage/emulated/0/Android/data/com.lomigoo.classworkmanager/.database/cmli";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, "sa", "");
    }
}
