package DataAccess;

import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import viewL.Gui.LogIn;

public class DataAccessor {

    private Connection connect = null;
    private ResultSet resultSet = null;
    Statement statement;

    public void createUser(String userName, String passWord) 
            throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager.getConnection("jdbc:mysql://localhost/UKG?"
                + "user=root&password=123");
        statement = connect.createStatement();
        statement.executeUpdate("INSERT INTO user VALUES('"+userName+"','"+passWord+"')");
    }

    public String getPassword(String userName) {
        String password = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/UKG?"
                    + "user=root&password=123");
            statement = connect.createStatement();
            resultSet = statement.executeQuery("SELECT Password from user WHERE UserID = '" + userName + "'");
            if (resultSet.next()) {
                password = resultSet.getString("Password");
                return password;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DataAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return password;
    }
    
    public String encrypt(char[] password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = Charset.forName("UTF-8").encode(CharBuffer.wrap(password)).array();
            md.update(bytes);

            byte byteData[] = md.digest();

            //convert the byte to hex format method 1
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }

            //convert the byte to hex format method 2
            StringBuilder hexString = new StringBuilder();
            for (int i = 0; i < byteData.length; i++) {
                String hex = Integer.toHexString(0xff & byteData[i]);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String checkPassword(String enteredPassword) {
        String userName = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/UKG?"
                    + "user=root&password=123");
            statement = connect.createStatement();
            resultSet = statement.executeQuery("SELECT UserID from user WHERE Password = '" + enteredPassword + "'");
            if (resultSet.next()) {
                userName = resultSet.getString("UserID");
                return userName;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DataAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userName;
    }

    public ArrayList<String> getItemList() {
        ArrayList<String> items = new ArrayList<>();
        items.add("");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/UKG?"
                    + "user=root&password=123");
            statement = connect.createStatement();
            resultSet = statement.executeQuery("SELECT * from item");
            while (resultSet.next()) {
                items.add(resultSet.getString("ItemCode"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DataAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }

    public ArrayList<String> getRepList() {
        ArrayList<String> reps = new ArrayList<>();
        reps.add("");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/UKG?"
                    + "user=root&password=123");
            statement = connect.createStatement();
            resultSet = statement.executeQuery("SELECT * from salesrep");
            while (resultSet.next()) {
                reps.add(resultSet.getString("RepID"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DataAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reps;
    }

    public String getIssueCode() {
        String issueCode = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/UKG?"
                    + "user=root&password=123");
            statement = connect.createStatement();
            resultSet = statement.executeQuery("ORDER BY ID DESC LIMIT 1");
            resultSet.next();
            issueCode = resultSet.getString("IssueCode");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DataAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return issueCode;
    }
}
