package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {
    public static void initialize() {
        String sqlTbl = "CREATE TABLE IF NOT EXISTS classwork(" +
                "wid INTEGER PRIMARY KEY AUTOINCREMENT," +
                "course_name TEXT NOT NULL," +
                "action_description TEXT NOT NULL," +
                "date_created TEXT DEFAULT (DATE('now', '+8 hours'))," +
                "date_target TEXT NOT NULL," +
                "status TEXT DEFAULT 'PENDING')";

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
