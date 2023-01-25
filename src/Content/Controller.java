package Content;

import Content.Content_Writing;

public class Controller {
    public  final MediatorPatternDemo model;
    private final Content_Writing  content_writing ;

    public Controller(MediatorPatternDemo model, Content_Writing content_writing) {
        this.model = model;
        this.content_writing =content_writing;
    }
    
    public String getCriminal_ID() {
        return model.getCriminal_ID();
    }
    public void setCriminal_ID(String Criminal_ID) {
        model.setCriminal_ID(Criminal_ID);    
    }
    
    public String getCriminal_Name() {
        return model.getCriminal_Name();
    }
    public void setCriminal_Name(String Criminal_Name) {
        model.setCriminal_Name(Criminal_Name);
    }
    
    public String getGender() {
        return model.getGender();
    }
    public void setGender(String Gender) {
        model.setGender(Gender);
    }
    
    public String getTime_period() {
        return model.getTime_period();
    }
    public void setTime_period(String Time_period) {
        model.setTime_period(Time_period);
    }

    public String getAddress() {
        return model.getAddress();
    }
    public void setAddress(String Address) {
        model.setAddress(Address);
    }
    
    public String getAge() {
        return model.getAge();
    }
    public void setAge(String Age) {
        model.setAge(Age);
    }
    
    public String getCity() {
        return model.getCity();
    }
    public void setCity(String City) {
        model.setCity(City);
    }
    
    public String getPhone_Number() {
        return model.getPhone_Number();
    }
    public void setPhone_Number(String Phone_Number) {
        model.setPhone_Number(Phone_Number);
    }
    
    public void updateWriting() {content_writing.displayData(model.getCriminal_ID(), model.getCriminal_Name(), model.getGender(),
            model.getTime_period(),model.getAge(),model.getAddress(),model.getPhone_Number(),model.getCity());
    }
     
}

