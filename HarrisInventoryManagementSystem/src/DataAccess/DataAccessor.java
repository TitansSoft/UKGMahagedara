package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataAccessor {

    private Connection connect = null;
    private ResultSet resultSet = null;
    Statement statement;

    public void createUser(String userName, String passWord) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager.getConnection("jdbc:mysql://localhost/UKG?"
                + "user=root&password=123");
        statement = connect.createStatement();
        statement.executeUpdate("INSERT INTO user VALUES('"+userName+"','"+passWord+"')");
    }

    public char [] getPassword(String userName) {
        char [] password = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/UKG?"
                    + "user=root&password=123");
            statement = connect.createStatement();
            resultSet = statement.executeQuery("SELECT Password from user WHERE UserID = '" + userName + "'");
            if (resultSet.next()) {
                password = resultSet.getString("Password").toCharArray();
                return password;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DataAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return password;
    }
}
