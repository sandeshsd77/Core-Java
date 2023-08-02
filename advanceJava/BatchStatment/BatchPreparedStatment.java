package advanceJava.BatchStatment;

import java.sql.*;

public class BatchPreparedStatment {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // steps to connect to the db from java application
        // 1. load and register the Driver [java.sql.Driver(I)] with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver"); //optional from java 7 onwards

        //2. Get connection object
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);
        String dynamicQuery = "insert into students values (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(dynamicQuery);
        preparedStatement.setInt(1, 4);
        preparedStatement.setString(2, "xyz");
        preparedStatement.setInt(3, 65);
        preparedStatement.addBatch();

        preparedStatement.setInt(1, 5);
        preparedStatement.setString(2, "abc");
        preparedStatement.setInt(3, 55);
        preparedStatement.addBatch();


        int[] updateCount = preparedStatement.executeBatch();
        preparedStatement.close();
        System.out.println("Batch sql query executed");
        connection.close();



    }
}
