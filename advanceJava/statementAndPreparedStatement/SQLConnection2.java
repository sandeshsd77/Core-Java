package advanceJava.statementAndPreparedStatement;

import java.sql.*;

public class SQLConnection2 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String name = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, password, name);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM it_shaala.student");

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String namee = resultSet.getString(2);
            String email = resultSet.getNString(3);
            String phoneNumber = resultSet.getString(4);

            System.out.println("student id : " + id + " student Name : " + namee + " student email : " + email + " student phone : " + phoneNumber);
        }
        connection.close();

    }
}
