/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Content;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveRowMethod extends TemplateDesignPattern{

    @Override
    public void removeSelectedRows(JTable table) {
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int[] rows = table.getSelectedRows();
        for (int i = 0; i < rows.length; i++) {
            model.removeRow(rows[i] - i);
        }
    }

    @Override
    public MediatorPatternDemo retriveFromDatabase(String Criminal_ID, String Criminal_Name, String Gender, 
            String Time_period, String Age, String Address, String City, String Phone_Number) {
        MediatorPatternDemo model = new MediatorPatternDemo();
        model.setCriminal_ID(Criminal_ID);
        model.setCriminal_Name(Criminal_Name);
        model.setGender(Gender);
        model.setTime_period(Time_period);
        model.setAge(Age);
        model.setAddress(Address);
        model.setCity(City);
        model.setPhone_Number(Phone_Number);
        return model;
    }
    
}
