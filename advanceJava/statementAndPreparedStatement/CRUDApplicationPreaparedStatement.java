package advanceJava.statementAndPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CRUDApplicationPreaparedStatement {
    public static void main(String[] args) {
        insertIntoTable();
    }

    public static void insertIntoTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String name = "root";
        String password = "root";
        Connection connection = null;

        try {
            System.out.println("Enter the course id,name,price");
            Scanner scanner = new Scanner(System.in);
            int courseId = scanner.nextInt();
            String courseName = scanner.next();
            int coursePrice = scanner.nextInt();

            connection = DriverManager.getConnection(url, name, password);
            String sqlQuery = "Insert into course1 values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,courseId);
            preparedStatement.setString(2,courseName);
            preparedStatement.setInt(3,coursePrice);

            preparedStatement.executeUpdate();
            System.out.println("Data is created");

        } catch (SQLException e) {
            System.out.println("Exception occured while connecting"+e.getMessage());
        }

finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Issue in closing the connection " + e.getMessage());
            }

        }
    }


}
