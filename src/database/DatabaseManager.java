package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    // ANDROID
    //private static final String URL = "jdbc:h2:/storage/emulated/0/.classworkmanagerCLI/database/cmli";

    // PC
    private static final String URL = "jdbc:h2:/Documents/classworkmanagerCLI/database/cmli";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, "sa", "");
    }
}