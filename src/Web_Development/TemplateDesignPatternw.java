/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Development;




import javax.swing.JTable;

public abstract class TemplateDesignPatternw {
    public final void runFunctions(){

    }
    public abstract void removeSelectedRowsw(JTable table);
    public abstract MediatorPatternDemow retriveFromDatabase(String Emp_ID, String Emp_Name, String Gender,String Qualification, String Designation, String Address,String Phone_Number, String Email);
    
}
