package advanceJava.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CollableStatement2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // steps to connect to the db from java application
        // 1. load and register the Driver [java.sql.Driver(I)] with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver"); //optional from java 7 onwards

        //2. Get connection object
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "call bulk_insert()";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();
        connection.close();
        System.out.println("Stored procedure call");
    }
}
