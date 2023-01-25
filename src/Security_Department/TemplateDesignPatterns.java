/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Security_Department;



import javax.swing.JTable;

public abstract class TemplateDesignPatterns {
    public final void runFunctions(){

    }
    public abstract void removeSelectedRowss(JTable table);
    public abstract MediatorPatternDemos retriveFromDatabase(String Emp_ID, String Emp_Name, String Gender,String Qualification, String Designation, String Address,String Phone_Number, String Email);
    
}
