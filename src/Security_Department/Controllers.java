package Security_Department;




public class Controllers {
    public  final MediatorPatternDemos models;
    private final Security_Department security_department ;

    public Controllers(MediatorPatternDemos models, Security_Department security_department) {
        this.models = models;
        this.security_department =security_department;
    }
    
    public String getEmp_ID() {
        return models.getEmp_ID();
    }
    public void setEmp_ID(String Emp_ID) {
        models.setEmp_ID(Emp_ID);    
    }
    
    public String getEmp_Name() {
        return models.getEmp_Name();
    }
    public void setEmp_Name(String Emp_Name) {
        models.setEmp_Name(Emp_Name);
    }
    
    public String getGender() {
        return models.getGender();
    }
    public void setGender(String Gender) {
        models.setGender(Gender);
    }
    
    public String getQualification() {
        return models.getQualification();
    }
    public void setQualification(String Qualification) {
        models.setQualification(Qualification);
    }

    public String getAddress() {
        return models.getAddress();
    }
    public void setAddress(String Address) {
        models.setAddress(Address);
    }
    
    public String getDesignation() {
        return models.getDesignation();
    }
    public void setDesignation(String Designation) {
        models.setDesignation(Designation);
    }
    
    public String getEmail() {
        return models.getEmail();
    }
    public void setEmail(String Email) {
        models.setEmail(Email);
    }
    
    public String getPhone_Number() {
        return models.getPhone_Number();
    }
    public void setPhone_Number(String Phone_Number) {
        models.setPhone_Number(Phone_Number);
    }
    
    public void updateWritings() {security_department.displayDatas(models.getEmp_ID(), models.getEmp_Name(), models.getGender(),
            models.getQualification(),models.getDesignation(),models.getAddress(),models.getPhone_Number(),models.getEmail());
    }
     
}

