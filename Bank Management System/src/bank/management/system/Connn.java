package bank.management.system;

import java.sql.*;

public class Connn { // connection class & connection file.

    Connection connection;

    public Statement statement;

    public Connn() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "Anu@2003");
            statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
