/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Human_Resources;




public class Singleton_DesignPatternh {
               private static Singleton_DesignPatternh instance = new Singleton_DesignPatternh();

       public static Singleton_DesignPatternh getInstance(){
       return instance;
       }
       
       public void updateWritingh(MediatorPatternDemoh modelh,Human_Resources  human_resources) {
   
       human_resources.displayDatah(modelh.getEmp_ID(), modelh.getEmp_Name(), modelh.getGender(),
       modelh.getQualification(),modelh.getDesignation(),modelh.getAddress(),modelh.getPhone_Number(),modelh.getEmail());
    }
}

    

