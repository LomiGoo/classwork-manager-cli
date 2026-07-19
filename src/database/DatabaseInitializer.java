package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {
    public static void initialize() {
        String sqlTbl = "CREATE TABLE IF NOT EXISTS classwork(" +
                "wid INTEGER AUTO_INCREMENT PRIMARY KEY," +
                "course_name VARCHAR(255) NOT NULL," +
                "action_description VARCHAR(255) NOT NULL," +
                "date_created DATE DEFAULT CURRENT_DATE," +
                "date_target VARCHAR(255) NOT NULL," +
                "status VARCHAR(255) DEFAULT 'PENDING')";

        try (
                Connection conn = DatabaseManager.connect();
                Statement statement = conn.createStatement()
        ) {
            statement.execute(sqlTbl);
        } catch (SQLException e) {
            System.err.println("Error Initializing Table : " + e);
        }
    }
}
