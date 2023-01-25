/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Content;

public class MediatorPatternDemo {
 private String Criminal_ID;
    private String Criminal_Name;
    private String Gender;
    private String Time_period;
    private String Age ;
    private String Address;    
    private String Phone_Number;
    private String City;
    
    public String getCriminal_ID() {
        return Criminal_ID;
    }
    public void setCriminal_ID(String Criminal_ID) {
        this.Criminal_ID = Criminal_ID;
    }
    
    public String getCriminal_Name() {
        return Criminal_Name;
    }
    public void setCriminal_Name(String Criminal_Name) {
        this.Criminal_Name = Criminal_Name;
    }
    
    public String getGender() {
        return Gender;
    }
    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    public String getTime_period() {
        return Time_period;
    }
    public void setTime_period(String Time_period) {
        this.Time_period = Time_period;
    }
    
    public String getAddress() {
        return Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    public String getAge() {
        return Age;
    }
    public void setAge(String Age) {
        this.Age = Age;
    }
    
    public String getCity() {
        return City;
    }
    public void setCity(String City) {
        this.City = City;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }
    public void setPhone_Number(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

}
