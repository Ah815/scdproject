/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operational_Management;



public class Singleton_DesignPatterno {
               private static Singleton_DesignPatterno instance = new Singleton_DesignPatterno();

       public static Singleton_DesignPatterno getInstance(){
       return instance;
       }
       
       public void updateWritingo(MediatorPatternDemoo modelo,Operational_Management  operational_management) {
   
       operational_management.displayDatao(modelo.getEmp_ID(), modelo.getEmp_Name(), modelo.getGender(),
       modelo.getQualification(),modelo.getDesignation(),modelo.getAddress(),modelo.getPhone_Number(),modelo.getEmail());
    }
}

    

