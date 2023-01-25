package Operational_Management;



public class Controllero {
    public  final MediatorPatternDemoo modelo;
    private final Operational_Management  operational_management ;

    public Controllero(MediatorPatternDemoo modelo, Operational_Management  operational_management) {
        this.modelo = modelo;
        this.operational_management =operational_management;
    }
    
    public String getEmp_ID() {
        return modelo.getEmp_ID();
    }
    public void setEmp_ID(String Emp_ID) {
        modelo.setEmp_ID(Emp_ID);    
    }
    
    public String getEmp_Name() {
        return modelo.getEmp_Name();
    }
    public void setEmp_Name(String Emp_Name) {
        modelo.setEmp_Name(Emp_Name);
    }
    
    public String getGender() {
        return modelo.getGender();
    }
    public void setGender(String Gender) {
        modelo.setGender(Gender);
    }
    
    public String getQualification() {
        return modelo.getQualification();
    }
    public void setQualification(String Qualification) {
        modelo.setQualification(Qualification);
    }

    public String getDesignation() {
        return modelo.getDesignation();
    }
    public void setDesignation(String Designation) {
        modelo.setDesignation(Designation);
    }
    
    public String getAddress() {
        return modelo.getAddress();
    }
    public void setAddress(String Address) {
        modelo.setAddress(Address);
    } 
    
    public String getPhone_Number() {
        return modelo.getPhone_Number();
    }
    public void setPhone_Number(String Phone_Number) {
        modelo.setPhone_Number(Phone_Number);
    }
    public String getEmail() {
        return modelo.getEmail();
    }
    public void setEmail(String Email) {
        modelo.setEmail(Email);
    }

    
    public void updateWritingo() {operational_management.displayDatao(modelo.getEmp_ID(), modelo.getEmp_Name(), modelo.getGender(),
            modelo.getQualification(),modelo.getDesignation(),modelo.getAddress(),modelo.getPhone_Number(),modelo.getEmail());
    }
     
}

