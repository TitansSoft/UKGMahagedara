package viewL.Gui;

import DataAccess.DataAccessor;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class LogIn extends javax.swing.JFrame {

    // Variables declaration - do not modify
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel lableWelcome;
    private javax.swing.JLabel lableUser;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtfldPassword;
    private javax.swing.JTextField txtfldUserName;
    private DataAccessor connection = new DataAccessor();
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
        txtfldUserName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                txtfldPassword.requestFocus();
            }
        });
        txtfldPassword.addActionListener(new ActionListener() {
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
        txtfldPassword = new javax.swing.JPasswordField("Password", 8);
        txtfldUserName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));

        lableWelcome.setFont(new java.awt.Font("Times New Roman", 1, 18));
        lableWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lableWelcome.setText("Please Log In To Proceed");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lableWelcome, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
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
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

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
                if (passwordLength == 8) {
                    txtfldPassword.setEditable(false);
                }
            }
        };

        txtfldPassword.setText("passWord");
        txtfldUserName.setText("User name");
        txtfldPassword.addKeyListener(kl);
        txtfldPassword.addCaretListener(caretListener);

        txtfldUserName.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                txtfldUserName.setText("");
            }

            @Override
            public void focusLost(FocusEvent fe) {
                txtfldPassword.setText("Password");
            }
        });

        txtfldPassword.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                txtfldPassword.setText("");
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
                .addComponent(txtfldPassword))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(lableUser)
                .addGap(18, 18, 18)
                .addComponent(txtfldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
                javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 25, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lableUser)
                .addComponent(txtfldUserName, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(labelPassword)
                .addComponent(txtfldPassword, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogIn)
                .addContainerGap()));

        txtfldUserName.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>

    private void logIn(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {

        String userName = txtfldUserName.getText();
        char[] passwordEntered = this.txtfldPassword.getPassword();
        String passwordStored;

        passwordStored = connection.getPassword(userName);
        String password = encrypt(passwordEntered);

        //connection.createUser("user",encrypt(this.txtfldPassword.getPassword()));
        System.out.println("Entered : " + password);
        System.out.println("Stored  : " + passwordStored);
        boolean loggedIn = (password.equals(passwordStored));

        if (loggedIn) {
            JOptionPane.showMessageDialog(this, "Login Successful.");
            try {
                PrintWriter out;
                java.util.Date date = new java.util.Date();
                String dateFormatted = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm").format(date.getTime());
                out = new PrintWriter(new BufferedWriter(new FileWriter("log.tmp", true)));
                String encoded;
                encoded = Base64.encode(("User Name : " + userName + "\tTime : " + dateFormatted).getBytes("UTF-16"));
                out.println(encoded);
                readLogIn();
                //System.out.println(new String(Base64.decode(encoded)));
                out.close();
            } catch (IOException e) {
            }
            this.setVisible(false);
        } else if (passwordStored == null) {
            JOptionPane.showMessageDialog(this, "Login Failure.\nInvalid User Name");
        } else {
            JOptionPane.showMessageDialog(this, "Login Failure.\nInvalid Password");
        }
    }

    private String encrypt(char[] password) {
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

    public void readLogIn() {
        try {
            FileReader fr = new FileReader("log.tmp");
            BufferedReader br = new BufferedReader(fr);
            String str;
            try {
                while ((str = br.readLine()) != null) {
                    System.out.println(new String(Base64.decode(str)));
                }
            } catch (IOException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}