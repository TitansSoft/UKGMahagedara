/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Malsha Samani
 */
public class ItemController {
    private static String a;

    public static int addItem(Item item) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnection().getConnection();
        Statement stm = conn.createStatement();
        
        String sql = "INSERT INTO issueditem VALUES('IS0021','" + item.getID() + "','2013-5-23','" + item.getQuanty()+ "','','')";
        int res = stm.executeUpdate(sql);
        return res;
    }
    //give id number and then search type,length_inches,length_mm

    public static Item searchItem(String id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnection().getConnection();
        Statement stm = conn.createStatement();
        String sql = "Select * From Item where ItemCode='" + id + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            Item item = new Item(rst.getString("ItemCode"), rst.getString("Type"), rst.getString("Length_Inches"), rst.getString("Length_mm"));
            return item;

        } else {
            return null;
        }
    }
    

    
}
