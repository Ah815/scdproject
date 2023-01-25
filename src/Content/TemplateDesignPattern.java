/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Content;

import javax.swing.JTable;

public abstract class TemplateDesignPattern {
    public final void runFunctions(){

    }
    public abstract void removeSelectedRows(JTable table);
    public abstract MediatorPatternDemo retriveFromDatabase(String Emp_ID, String Emp_Name, String Gender,String Qualification, String Designation, String Address, String Email,String Phone_Number);
    
}
