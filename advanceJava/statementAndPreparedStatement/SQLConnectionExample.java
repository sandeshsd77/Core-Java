package advanceJava.statementAndPreparedStatement;

import java.sql.*;

public class SQLConnectionExample {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Customers";
        String userName = "root";
        String passWord = "root";

        Connection connection = DriverManager.getConnection(url, userName, passWord);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from Customers");
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            String address = resultSet.getString(4);
            String phone = resultSet.getString(5);
            String date_of_birth = resultSet.getString(6);
            System.out.println("Customer ID:" + id + " CustomerName:" + name + " CustomerEmail: " + email + " CustomerAddress:" +
                    address + "CustomerPhone: " + phone + "Customer DoB: " + date_of_birth);
        }
            connection.close();
    }
}
