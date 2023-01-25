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
public class AuthorizedEmployees extends AbstractEmploee {
   public AuthorizedEmployees(String name) {
      this.name = name;	

   }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

}
