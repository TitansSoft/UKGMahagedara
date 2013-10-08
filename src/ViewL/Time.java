/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewL;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author Amila Silantha
 */
public class Time extends TimerTask {

    String strDate;
    JLabel date;

    Time(JLabel j) {
        date = j;
    }

    public void run() {

        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
        Date now = new Date();
        strDate = sdfDate.format(now);
        date.setText(strDate);

    }
}
