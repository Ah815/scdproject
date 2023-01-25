/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Security_Department;

import Human_Resources.*;



public class MediatorPatternDemos {
 private String Emp_ID;
    private String Emp_Name;
    private String Gender;
    private String Qualification;
    private String Address;
    private String Designation ;
    private String Email;
    private String Phone_Number;
    
    public String getEmp_ID() {
        return Emp_ID;
    }
    public void setEmp_ID(String Emp_ID) {
        this.Emp_ID = Emp_ID;
    }
    
    public String getEmp_Name() {
        return Emp_Name;
    }
    public void setEmp_Name(String Emp_Name) {
        this.Emp_Name = Emp_Name;
    }
    
    public String getGender() {
        return Gender;
    }
    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    public String getQualification() {
        return Qualification;
    }
    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }
 
    public String getDesignation() {
        return Designation;
    }
    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }
        
    public String getAddress() {
        return Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }
    public String getPhone_Number() {
        return Phone_Number;
    }
    public void setPhone_Number(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }
    
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
}
