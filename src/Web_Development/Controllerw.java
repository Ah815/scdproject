package Web_Development;

public class Controllerw {
    public  final MediatorPatternDemow modelw;
    private final Web_Development web_development ;

    public Controllerw(MediatorPatternDemow modelw, Web_Development web_development) {
        this.modelw = modelw;
        this.web_development =web_development;
    }
    
    public String getEmp_ID() {
        return modelw.getEmp_ID();
    }
    public void setEmp_ID(String Emp_ID) {
        modelw.setEmp_ID(Emp_ID);    
    }
    
    public String getEmp_Name() {
        return modelw.getEmp_Name();
    }
    public void setEmp_Name(String Emp_Name) {
        modelw.setEmp_Name(Emp_Name);
    }
    
    public String getGender() {
        return modelw.getGender();
    }
    public void setGender(String Gender) {
        modelw.setGender(Gender);
    }
    
    public String getQualification() {
        return modelw.getQualification();
    }
    public void setQualification(String Qualification) {
        modelw.setQualification(Qualification);
    }

    public String getDesignation() {
        return modelw.getDesignation();
    }
    public void setDesignation(String Designation) {
        modelw.setDesignation(Designation);
    }
    
    public String getAddress() {
        return modelw.getAddress();
    }
    public void setAddress(String Address) {
        modelw.setAddress(Address);
    }
    
    public String getPhone_Number() {
        return modelw.getPhone_Number();
    }
    public void setPhone_Number(String Phone_Number) {
        modelw.setPhone_Number(Phone_Number);
    }
    public String getEmail() {
        return modelw.getEmail();
    }
    public void setEmail(String Email) {
        modelw.setEmail(Email);
    }
    
    public void updateWritingw() {web_development.displayDataw(modelw.getEmp_ID(), modelw.getEmp_Name(), modelw.getGender(),
            modelw.getQualification(),modelw.getDesignation(),modelw.getAddress(),modelw.getPhone_Number(),modelw.getEmail());
    }
     
}

