/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Security_Department;

import Human_Resources.*;
import Content.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveRowMethods extends TemplateDesignPatterns{

    @Override
    public void removeSelectedRowss(JTable table) {
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int[] rows = table.getSelectedRows();
        for (int i = 0; i < rows.length; i++) {
            model.removeRow(rows[i] - i);
        }
    }

    @Override
    public MediatorPatternDemos retriveFromDatabase(String Emp_ID, String Emp_Name, String Gender, String Qualification, String Designation, String Address, String Phone_Number, String Email) {
        MediatorPatternDemos models = new MediatorPatternDemos();
        models.setEmp_ID(Emp_ID);
        models.setEmp_Name(Emp_Name);
        models.setGender(Gender);
        models.setQualification(Qualification);
        models.setDesignation(Designation);
        models.setAddress(Address);
        models.setPhone_Number(Phone_Number);
        models.setEmail(Email);

        return models;
    }
    
}
