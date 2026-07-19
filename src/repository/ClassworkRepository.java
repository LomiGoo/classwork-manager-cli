package repository;

import database.DatabaseManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.github.freva.asciitable.AsciiTable;

public class ClassworkRepository {
    public static void create(String courseName, String actionDescription, String dateCreated, String dateTarget) {
        String insert = "INSERT INTO classwork(course_name, action_description, date_created, date_target)" +
                "VALUES (?, ?, ?, ?)";

        try (
                Connection conn = DatabaseManager.connect();
                PreparedStatement preparedStatement = conn.prepareStatement(insert)
        ) {
            preparedStatement.setString(1, courseName);
            preparedStatement.setString(2, actionDescription);
            preparedStatement.setString(3, dateCreated);
            preparedStatement.setString(4, dateTarget);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error Inserting Values : " + e);
        }
    }

    public static void read(String sqlReadQuery) {
        ArrayList<String[]> rows = new ArrayList<>();

        try (
                Connection conn = DatabaseManager.connect();
                PreparedStatement preparedStatement = conn.prepareStatement(sqlReadQuery)
        ) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String[] row = {
                        String.valueOf(resultSet.getInt("wid")),
                        resultSet.getString("course_name"),
                        resultSet.getString("action_description"),
                        resultSet.getString("date_created"),
                        resultSet.getString("date_target"),
                        resultSet.getString("status")
                };
                rows.add(row);
            }
            String[][] data = rows.toArray(new String[0][]);
            System.out.println(
                    AsciiTable.getTable(
                            new String[]{
                                    "wid",
                                    "course_name",
                                    "action_description",
                                    "date_created",
                                    "date_target",
                                    "status"
                            },
                            data
                    )
            );
        } catch (SQLException e) {
            System.err.println("Error Reading Table : " + e);
        }
    }

    public static void update(int wid, String column, String newValue) {
        String updateQuery = "UPDATE classwork SET " + column + " = ? WHERE wid = ?";

        try (
                Connection conn = DatabaseManager.connect();
                PreparedStatement preparedStatement = conn.prepareStatement(updateQuery)
        ) {
            preparedStatement.setString(1, newValue);
            preparedStatement.setInt(2, wid);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error Updating Table : " + e);
        }
    }

    public static void delete(int wid) {
        String deleteQuery = "DELETE FROM classwork WHERE wid = ?";

        try (
                Connection conn = DatabaseManager.connect();
                PreparedStatement preparedStatement = conn.prepareStatement(deleteQuery)
        ) {
            preparedStatement.setInt(1, wid);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error Updating Table : " + e);
        }
    }
}
