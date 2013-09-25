package viewL.Gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectToDatabase {

    private Connection connect = null;
    private ResultSet resultSet = null;
    Statement statement;

    public void createUser(String userName, String passWord) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager.getConnection("jdbc:mysql://localhost/UKG?"
                + "user=root&password=123");
        statement = connect.createStatement();
        statement.executeUpdate("INSERT INTO users VALUES('"+userName+"','"+passWord+"')");
    }

    String getPassword(String userName) {
        String password = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/UKG?"
                    + "user=root&password=123");
            statement = connect.createStatement();
            resultSet = statement.executeQuery("SELECT Password from users WHERE UserName = '" + userName + "'");
            if (resultSet.next()) {
                password = resultSet.getString("Password");
                return password;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConnectToDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return password;
    }
}
