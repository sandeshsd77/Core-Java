package advanceJava.statementAndPreparedStatement;

import java.sql.*;

public class CRUDapplication {
    public static void main(String[] args) {
        // CRUD : CREATE-READ-UPDATE-DELETE
        // 1. create table
//         createTable();

        // 2. insert into the table
//         insertIntoTable();

        // 3. update the table
//        updateTable();

        // 4. delete from table
//         deleteFromTable();

        // 5. read the table
        readTable();

        // 6. alter the table
        //alterTable();

        // 7. drop table
        //dropTable();
    }

    public static void createTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String name = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, name, password);
            Statement statement = connection.createStatement();
            String sqlQuery = "CREATE TABLE COURSE(id int,NAME VARCHAR(50), PRICE int)";
            //DDL : Data Definition Language : CREATE, DROP, ALTER, CREATE DATABASE
            statement.execute(sqlQuery);
            System.out.println("Table is created");

        } catch (SQLException e) {
            System.out.println("exception occurred while connecting " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Issue in closing the connection " + e.getMessage());
            }
        }
    }

    public static void insertTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String name = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, name, password);
            Statement statement = connection.createStatement();
            String sqlQuery = "Insert into course values(2,'python',3000)";
            statement.executeUpdate(sqlQuery);
            System.out.println("Data is created");
        } catch (SQLException e) {
            System.out.println("Exception occurred while connecting " + e.getMessage());
        }
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Issue in closing the connection " + e.getMessage());
        }

    }

    public static void updateTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String name = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, name, password);
            Statement statement = connection.createStatement();
            String sqlQuery = "update course set price = 5000 where id =2";
            statement.executeUpdate(sqlQuery);
            System.out.println("data is created");
        } catch (SQLException e) {
            System.out.println("Exception occured while connecting" + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Issue in closing the connection " + e.getMessage());
            }
        }

    }

    public static void deleteFromTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String name = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, name, password);
            Statement statement = connection.createStatement();
            String sqlQuery = "delete from course where id = 2";
            statement.executeUpdate(sqlQuery);
            System.out.println("Data is deleted ");

        } catch (SQLException e) {
            System.out.println("Exception occurred while connecting " + e.getMessage());

        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Exception occured while closing connection " + e.getMessage());
            }
        }


    }

    public static void readTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String name = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, name, password);
            Statement statement = connection.createStatement();
            String sqlQuery = " Select * from course";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String NAME = resultSet.getString(2);
                String price = resultSet.getString(3);
                System.out.println(id + "\t" + NAME + "\t" + price);
            }

        } catch (SQLException e) {
            System.out.println("Exception occured while connecting" + e.getMessage());
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Exception occured while closing connection"+e.getMessage());
            }
        }


    }
    public static void alterTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String name = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, name, password);
            Statement statement = connection.createStatement();
            String sqlQuery;
        } catch (SQLException e) {
            System.out.println("Exception occured while connecting database" + e.getMessage());
        }


    }


}
