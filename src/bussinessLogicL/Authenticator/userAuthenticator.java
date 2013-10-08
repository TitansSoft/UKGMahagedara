package bussinessLogicL.Authenticator;

import DataAccess.DataAccessor;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
//import viewL.Users.User;

public class userAuthenticator {

    private static boolean authenticated = false;

    public static void main(String args[]) {
        boolean a = authenticated();
        System.out.println("a = " + a);
    }

    public static boolean authenticated() {
        DataAccessor da = new DataAccessor();
        final JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter an administrative password:");
        final JPasswordField txtfldPassword = new JPasswordField("Password", 10);
        String[] options = new String[]{"OK", "Cancel"};
        char[] password = {};

        panel.add(label);
        panel.add(txtfldPassword);
        
        //Create key listener that will listen when someone press Backspace key  
        KeyListener kl = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent event) {
                if (event.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    txtfldPassword.setEditable(true);
                }
            }
        };

        CaretListener caretListener = new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent event) {
                int passwordLength = txtfldPassword.getText().length();

                //If password length equal to 8 characters, password field will uneditable  
                if (passwordLength > 8) {
                    txtfldPassword.setEditable(false);
                }
            }
        };
        txtfldPassword.addKeyListener(kl);
        txtfldPassword.addCaretListener(caretListener);

        txtfldPassword.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                txtfldPassword.setText("");
            }

            @Override
            public void focusLost(FocusEvent fe) {
            }
        });

        while (!authenticated) {
            int option = JOptionPane.showOptionDialog(null, panel, "Authentication required",
                    JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options, options[1]);
            if (option == 0) {
                password = txtfldPassword.getPassword();
                String enteredPassword = da.encrypt(password);
                String givenAdmin = da.checkPassword(enteredPassword);
                //user = User.getUser(givenAdmin);
                //User user = new User("user", "Admin");

                if (givenAdmin != null) {
                    //authenticated = givenAdmin.equals(user.getAuthority());
                }
                if (!authenticated) {
                    JOptionPane.showMessageDialog(panel, "Access denied.");
                }
            } else {
                break;
            }

        }
        return authenticated;
    }
}

/**
 *  issue items
    receive items
    update Bin
 */