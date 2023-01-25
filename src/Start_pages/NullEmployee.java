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

    
   public class NullEmployee extends AbstractEmploee {
   @Override
   public String getName() {
      return "This Employee is not Authenticated";
   }
   @Override
   public boolean isNil() {
      return true;
   }

}

    

