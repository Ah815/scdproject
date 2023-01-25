/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Security_Department;






public class Singleton_DesignPatterns {
               private static Singleton_DesignPatterns instance = new Singleton_DesignPatterns();

       public static Singleton_DesignPatterns getInstance(){
       return instance;
       }
       
       public void updateWritings(MediatorPatternDemos models,Security_Department  security_department) {
   
       security_department.displayDatas(models.getEmp_ID(), models.getEmp_Name(), models.getGender(),
       models.getQualification(),models.getDesignation(),models.getAddress(),models.getPhone_Number(),models.getEmail());
    }
}

    

