/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Human_Resources;

import Content.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveRowMethodh extends TemplateDesignPatternh{

    @Override
    public void removeSelectedRowsh(JTable table) {
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int[] rows = table.getSelectedRows();
        for (int i = 0; i < rows.length; i++) {
            model.removeRow(rows[i] - i);
        }
    }

    @Override
    public MediatorPatternDemoh retriveFromDatabase(String Emp_ID, String Emp_Name, String Gender, String Qualification, String Designation, String Address, String Phone_Number, String Email) {
        MediatorPatternDemoh modelh = new MediatorPatternDemoh();
        modelh.setEmp_ID(Emp_ID);
        modelh.setEmp_Name(Emp_Name);
        modelh.setGender(Gender);
        modelh.setQualification(Qualification);
        modelh.setDesignation(Designation);
        modelh.setAddress(Address);
        modelh.setPhone_Number(Phone_Number);
        modelh.setEmail(Email);

        return modelh;
    }
    
}
