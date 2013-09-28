package bussinessLogicL.Authenticator;

import DataAccess.DataAccessor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import viewL.Users.User;

public class userAuthenticator {

    private static boolean testAuthentication = false;

    public static void main(String args[]) {
        boolean a = checkForAdmin("user");
        System.out.println("a = " + a);
    }

    public static boolean authenticated(String name, char [] passward) {
        DataAccessor da = new DataAccessor();
        if (da.getPassword(name) != null) {
            String storedPassword = da.getPassword(name);
            String enteredPassword = da.encrypt(passward);
            userAuthenticator.testAuthentication = storedPassword.equals(enteredPassword);
        }
        return testAuthentication;
    }

    public static boolean checkForAdmin(String userName) {
        boolean result = false;
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter an administrative password:");
        JPasswordField fldPassword = new JPasswordField("Password", 10);
        String[] options = new String[]{"OK", "Cancel"};
        char[] password = {};
        User user = User.getUser(userName);
        user = new User("user","Admin");

        panel.add(label);
        panel.add(fldPassword);

        int option = JOptionPane.showOptionDialog(null, panel, "Authentication required",
                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[1]);
        if (option == 0) {
            password = fldPassword.getPassword();
        }

        if (authenticated(userName, password) && user.getAuthority().equals("Admin")) {
            result = true;
        }

        return result;
    }
}