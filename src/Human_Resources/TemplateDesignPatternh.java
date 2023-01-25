/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Human_Resources;


import javax.swing.JTable;

public abstract class TemplateDesignPatternh {
    public final void runFunctions(){

    }
    public abstract void removeSelectedRowsh(JTable table);
    public abstract MediatorPatternDemoh retriveFromDatabase(String Emp_ID, String Emp_Name, String Gender,String Qualification, String Designation, String Address,String Phone_Number, String Email);
    
}
