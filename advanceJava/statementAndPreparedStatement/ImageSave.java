package advanceJava.statementAndPreparedStatement;

import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;

public class ImageSave {
    public static void main(String[] args) throws SQLException, IOException {
        insertImage();
//        createTable();

    }

    public static void createTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String name = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, name, password);
            Statement statement = connection.createStatement();
            String sqlQuery = "CREATE TABLE Image(id int,pic blob)";
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

    private static void insertImage() throws IOException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // loading and registering the drivers with driver manager
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            String query = "insert into image (image_data) values(?)";
            PreparedStatement prepareStatement = connection.prepareStatement(query);
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream("C:\\Users\\sande\\Downloads\\20230608040600_IMG_2369ry.jpg");
                prepareStatement.setBinaryStream(1, fileInputStream, fileInputStream.available());
                prepareStatement.executeUpdate();
                System.out.println("Image inserted");
            } catch (FileNotFoundException e) {
                System.out.println("image not found: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Exception occurred while connecting: " + e.getMessage());
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

}

