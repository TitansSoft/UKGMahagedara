package bussinessLogicL.Authenticator;

import DataAccess.DataAccessor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import viewL.Users.User;

public class userAuthenticator {

    private static boolean authenticated = false;

    public static void main(String args[]) {
        boolean a = authenticated();
        System.out.println("a = " + a);
    }

    public static boolean authenticated() {
        DataAccessor da = new DataAccessor();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter an administrative password:");
        JPasswordField fldPassword = new JPasswordField("Password", 10);
        String[] options = new String[]{"OK", "Cancel"};
        char[] password = {};

        panel.add(label);
        panel.add(fldPassword);

        while (!authenticated) {
            int option = JOptionPane.showOptionDialog(null, panel, "Authentication required",
                    JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options, options[1]);
            if (option == 0) {
                password = fldPassword.getPassword();
                String enteredPassword = da.encrypt(password);
                String givenAdmin = da.checkPassword(enteredPassword);
                //user = User.getUser(givenAdmin);
                User user = new User("user", "Admin");

                if(givenAdmin != null ){
                    authenticated = givenAdmin.equals(user.getAuthority());
                }
                if(!authenticated){
                    JOptionPane.showMessageDialog(panel, "Access denied.");
                }
            }else{
                break;
            }
            
        }
        return authenticated;
    }
}