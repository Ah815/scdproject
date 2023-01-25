/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operational_Management;

import Content.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveRowMethodo extends TemplateDesignPatterno{

    @Override
    public void removeSelectedRowso(JTable table) {
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int[] rows = table.getSelectedRows();
        for (int i = 0; i < rows.length; i++) {
            model.removeRow(rows[i] - i);
        }
    }

    @Override
    public MediatorPatternDemoo retriveFromDatabase(String Emp_ID, String Emp_Name, String Gender, String Qualification, String Designation, String Address, String Phone_Number, String Email) {
        MediatorPatternDemoo modelo = new MediatorPatternDemoo();
        modelo.setEmp_ID(Emp_ID);
        modelo.setEmp_Name(Emp_Name);
        modelo.setGender(Gender);
        modelo.setQualification(Qualification);
        modelo.setDesignation(Designation);
        modelo.setAddress(Address);
        modelo.setPhone_Number(Phone_Number);
        modelo.setEmail(Email);
        
        return modelo;
    }
    
}
