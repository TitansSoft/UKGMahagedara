package viewL.Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {

    // Variables declaration - do not modify
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel lableWelcome;
    private javax.swing.JLabel lableUser;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jUserName;
    ConnectToDatabase connection = new ConnectToDatabase();
    // End of variables declaration

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
        btnLogIn.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    btnLogIn.doClick();
                }
            }
            
        });
        jUserName.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                jPassword.requestFocus();
            }
        });
        jPassword.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                btnLogIn.requestFocus();
            }
        });
        
        
        
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lableWelcome = new javax.swing.JLabel();
        lableUser = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jUserName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));

        lableWelcome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lableWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lableWelcome.setText("Please Log In To Proceed");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lableWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lableWelcome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        lableUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lableUser.setText("User Name:");

        labelPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelPassword.setText("Password   :");

        btnLogIn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLogIn.setText("Log In");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    logIn(evt);
                } catch (        ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jPassword.setText("passWord");
        jUserName.setText("User name");
        jUserName.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                jUserName.setText("");
            }

            @Override
            public void focusLost(FocusEvent fe) {
            }
        });

        jPassword.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                jPassword.setText("");
            }

            @Override
            public void focusLost(FocusEvent fe) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(btnLogIn)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                .addComponent(labelPassword)
                .addGap(18, 18, 18)
                .addComponent(jPassword))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(lableUser)
                .addGap(18, 18, 18)
                .addComponent(jUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 25, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lableUser)
                .addComponent(jUserName, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(labelPassword)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogIn)
                .addContainerGap()));

        jUserName.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>

    private void logIn(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {
        String userName = jUserName.getText();
        String passwordEntered = this.jPassword.getText();

        String passwordStored = connection.getPassword(userName);
        passwordEntered = encrypt(passwordEntered);

        boolean loggedIn = (passwordEntered.equals(passwordStored));

        if (loggedIn) {
            JOptionPane.showMessageDialog(this, "Login Successful.");
            this.setVisible(false);
        } else if (passwordStored == null) {
            JOptionPane.showMessageDialog(this, "Login Failure.\nInvalid User Name");
        } else {
            JOptionPane.showMessageDialog(this, "Login Failure.\nInvalid Password");
        }
    }

    private String encrypt(String s1) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(s1.getBytes());

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
}
