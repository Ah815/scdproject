/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Development;

import Security_Department.*;






public class Singleton_DesignPatternw {
               private static Singleton_DesignPatternw instance = new Singleton_DesignPatternw();

       public static Singleton_DesignPatternw getInstance(){
       return instance;
       }
       
       public void updateWritingw(MediatorPatternDemow modelw,Web_Development  web_development) {
   
       web_development.displayDataw(modelw.getEmp_ID(), modelw.getEmp_Name(), modelw.getGender(),
       modelw.getQualification(),modelw.getDesignation(),modelw.getAddress(),modelw.getPhone_Number(),modelw.getEmail());
    }
}

    

