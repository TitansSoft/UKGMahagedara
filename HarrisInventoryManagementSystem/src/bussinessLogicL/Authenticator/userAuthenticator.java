package bussinessLogicL.Authenticator;

import DataAccess.DataAccessor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import viewL.Users.User;

public class userAuthenticator {

    private static boolean testAuthentication = false;

    public static void main(String args[]) {
        boolean a = checkForAdmin("user");
        System.out.println("a = " + a);
    }

    public static boolean authenticated(String name, String passward) {
        DataAccessor da = new DataAccessor();
        if (da.getPassword(name) != null) {
            String storedPassword = da.getPassword(name);
            userAuthenticator.testAuthentication = storedPassword.equals(passward);
        }
        return testAuthentication;
    }

    public static boolean checkForAdmin(String userName) {
        boolean result = false;
        
        JFrame temp = new JFrame("temp");
        String password = JOptionPane.showInputDialog(temp,
                "Please input an administrator password to proceed",
                "Authentication required...",
                JOptionPane.QUESTION_MESSAGE
                );
        User user = User.getUser(userName);

        if (authenticated(userName, password) && user.getAuthority().equals("Admin")) {
            result = true;
        }

        return result;
    }
}