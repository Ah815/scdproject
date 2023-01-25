package Human_Resources;

import Content.*;


public class Controllerh {
    public  final MediatorPatternDemoh modelh;
    private final Human_Resources human_resources ;

    public Controllerh(MediatorPatternDemoh modelh, Human_Resources human_resources) {
        this.modelh = modelh;
        this.human_resources =human_resources;
    }
    
    public String getEmp_ID() {
        return modelh.getEmp_ID();
    }
    public void setEmp_ID(String Emp_ID) {
        modelh.setEmp_ID(Emp_ID);    
    }
    
    public String getEmp_Name() {
        return modelh.getEmp_Name();
    }
    public void setEmp_Name(String Emp_Name) {
        modelh.setEmp_Name(Emp_Name);
    }
    
    public String getGender() {
        return modelh.getGender();
    }
    public void setGender(String Gender) {
        modelh.setGender(Gender);
    }
    
    public String getQualification() {
        return modelh.getQualification();
    }
    public void setQualification(String Qualification) {
        modelh.setQualification(Qualification);
    }

    public String getAddress() {
        return modelh.getAddress();
    }
    public void setAddress(String Address) {
        modelh.setAddress(Address);
    }
    
    public String getDesignation() {
        return modelh.getDesignation();
    }
    public void setDesignation(String Designation) {
        modelh.setDesignation(Designation);
    }
    
    public String getEmail() {
        return modelh.getEmail();
    }
    public void setEmail(String Email) {
        modelh.setEmail(Email);
    }
    
    public String getPhone_Number() {
        return modelh.getPhone_Number();
    }
    public void setPhone_Number(String Phone_Number) {
        modelh.setPhone_Number(Phone_Number);
    }
    
    public void updateWritingh() {human_resources.displayDatah(modelh.getEmp_ID(), modelh.getEmp_Name(), modelh.getGender(),
            modelh.getQualification(),modelh.getDesignation(),modelh.getAddress(),modelh.getPhone_Number(),modelh.getEmail());
    }
     
}

