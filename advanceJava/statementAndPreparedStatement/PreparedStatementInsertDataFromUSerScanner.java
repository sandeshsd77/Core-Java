package advanceJava.statementAndPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementInsertDataFromUSerScanner {
    public static void main(String[] args) {
        insertIntoTable();
//        createTable();
    }

    //
    public static void insertIntoTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try {
            System.out.println("Enter the Student id, name, marks");
            Scanner scanner = new Scanner(System.in);
            int studentId = scanner.nextInt();
            String studentName = scanner.next();
            int studentMarks = scanner.nextInt();

            connection = DriverManager.getConnection(url, username, password);
            String query = "Insert into Students values (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, studentId);
            preparedStatement.setString(2, studentName);
            preparedStatement.setInt(3, studentMarks);
            preparedStatement.executeUpdate();

            System.out.println("Insert successfully in table");
        } catch (SQLException e) {
            System.out.println("Exception occured while connecting" + e.getMessage());
        }
finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Issue in closing the connection " + e.getMessage());
            }
        }

    }


//    public static void createTable() {
//        String url = "jdbc:mysql://localhost:3306/it_shaala";
//        String username = "root";
//        String password = "root";
//        Connection connection = null;
//
//        try {
//            connection = DriverManager.getConnection(url, username, password);
//            String query = "CREATE TABLE Students (id int, name varchar (50), marks int)";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.execute();
//            System.out.println("Table is created");
//
//        } catch (SQLException e) {
//            System.out.println("Exception occured while connecting to database : " + e.getMessage());
//        } finally {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
}
