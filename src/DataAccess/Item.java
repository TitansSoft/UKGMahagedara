/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

/**
 *
 * @author Malsha Samani
 */
public class Item {

    String ID;
    String descrpt;
    String quanty;
    String type;
    String length_inches;
    String length_mm;

    public Item() {
    }

    public Item(String ID, String descrpt, String quanty) {
        this.ID = ID;
        this.descrpt = descrpt;
        this.quanty = quanty;
    }

    public Item(String id, String type, String length_inches, String length_mm) {
        this.ID = id;
        this.type = type;
        this.length_inches = length_inches;
        this.length_mm = length_mm;
    }

    public String getID() {
        return ID;
    }

    public String getDescrpt() {
        return descrpt;
    }

    public String getQuanty() {
        return quanty;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setDescrpt(String descrpt) {
        this.descrpt = descrpt;
    }

    public void setQuanty(String quanty) {
        this.quanty = quanty;
    }

    public String getType() {
        return type;
    }

    public String getLength_inches() {
        return length_inches;
    }

    public String getLength_mm() {
        return length_mm;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLength_inches(String length_inches) {
        this.length_inches = length_inches;
    }

    public void setLength_mm(String length_mm) {
        this.length_mm = length_mm;
    }
    
}
