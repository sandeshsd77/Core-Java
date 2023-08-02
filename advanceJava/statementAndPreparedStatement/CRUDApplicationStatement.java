package advanceJava.statementAndPreparedStatement;

import java.sql.*;

public class CRUDApplicationStatement {
    public static void main(String[] args) {
        createTable();
//        insertTable();
//        dropTable();
//        selectTable();
//        updateData();
//        RemoveDuplicates();
    }

    public static void createTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, username, password);
            String query = "CREATE TABLE itCourses (id int, name varchar (50), fees int)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.execute();
            System.out.println("Table is created");

        } catch (SQLException e) {
            System.out.println("Exception occured while connecting to database : " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
//
//
//    }
//    public  static  void insertTable(){
//        String url = "jdbc:mysql://localhost:3306/it_shaala";
//        String username = "root";
//        String password = "root";
//        Connection connection = null;
//
//        try {
//            connection = DriverManager.getConnection(url, username, password);
////            String query = "Insert into itCourses (? int, ? varchar (50), fees int)";
//            String query = "INSERT INTO itCourses (id, name, fees) VALUES (?, ?, ?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setInt(1,1); // Set the value for the first parameter (id)
//            preparedStatement.setString(2,"Java Backend"); // Set the value for the second parameter (name)
//            preparedStatement.setInt(3,1500); // Set the value for the third parameter (fees)
//            preparedStatement.executeUpdate(); // Use executeUpdate() instead of execute()
//            System.out.println("Data is inserted succesfully");
//
//        } catch (SQLException e) {
//            System.out.println("Exception occured while connecting to database : "+  e.getMessage());
//        }
//        finally {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//
//    }


        //    public  static  void dropTable(){
//        String url = "jdbc:mysql://localhost:3306/it_shaala";
//        String username = "root";
//        String password = "root";
//        Connection connection = null;
//
//        try {
//           connection = DriverManager.getConnection(url, username, password);
//           String query = "drop TABLE itCourses";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.execute();
//            System.out.println("Table is drop");
//
//        } catch (SQLException e) {
//            System.out.println("Exception occured while connecting to database : "+  e.getMessage());
//        }
//        finally {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//
//    }
//    public static void selectTable() {
//        String url = "jdbc:mysql://localhost:3306/it_shaala";
//        String username = "root";
//        String password = "root";
//        Connection connection = null;
//
//        try {
//            connection = DriverManager.getConnection(url, username, password);
//            String query = "select * from itCourses where id = 1";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                int id = resultSet.getInt(1);
//                String name = resultSet.getString(2);
//                String fees = resultSet.getString(3);
//                System.out.println("Table is selected : " + id + "\t" + name + "\t" + fees);
//            }
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
//
//
//    }
//    public static void updateData() {
//        String url = "jdbc:mysql://localhost:3306/it_shaala";
//        String username = "root";
//        String password = "root";
//        Connection connection = null;
//
//        try {
//            connection = DriverManager.getConnection(url, username, password);
//            String query = "UPDATE itCourses SET name = ? WHERE id = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1, "Java backend");
//            preparedStatement.setInt(2, 1);
//            preparedStatement.executeUpdate();
//            System.out.println(" name is  updated");
//        } catch (SQLException ex) {
//            System.out.println("exception occurred while connecting " + ex.getMessage());
//        }
//        finally {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                System.out.println(" Exception occured while closing connection "+e.getMessage());
//            }
//        }


    }
}





