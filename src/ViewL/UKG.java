package ViewL;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class UKG {

    public static void main(String[] args) {
  
            try {
                UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UKG.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(UKG.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(UKG.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(UKG.class.getName()).log(Level.SEVERE, null, ex);
            }
  
        
        MainGUI mi = new MainGUI();
        mi.setVisible(true);
//        TestJframe tj = new TestJframe();
//        tj.setVisible(true);
    }
}
