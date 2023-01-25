/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Development;


import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveRowMethodw extends TemplateDesignPatternw{

    @Override
    public void removeSelectedRowsw(JTable table) {
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int[] rows = table.getSelectedRows();
        for (int i = 0; i < rows.length; i++) {
            model.removeRow(rows[i] - i);
        }
    }

    @Override
    public MediatorPatternDemow retriveFromDatabase(String Emp_ID, String Emp_Name, String Gender, String Qualification, String Designation, String Address, String Phone_Number, String Email) {
        MediatorPatternDemow modelw = new MediatorPatternDemow();
        modelw.setEmp_ID(Emp_ID);
        modelw.setEmp_Name(Emp_Name);
        modelw.setGender(Gender);
        modelw.setQualification(Qualification);
        modelw.setDesignation(Designation);
        modelw.setAddress(Address);
        modelw.setPhone_Number(Phone_Number);
        modelw.setEmail(Email);

        return modelw;
    }
    
}
