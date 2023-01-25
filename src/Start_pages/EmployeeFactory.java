/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start_pages;

/**
 *
 * @author Ammar
 */
public class EmployeeFactory {
    
      public static final String[] names = {"ashraf", "ahmed", "muham","sajid","miss Sitwat"};

      public static AbstractEmploee getCustomer(String name){
      for (int i = 0; i < names.length; i++) {
         if (names[i].equalsIgnoreCase(name) ){
            return new AuthorizedEmployees(name);
         }      }
      return new NullEmployee();
   }

}
