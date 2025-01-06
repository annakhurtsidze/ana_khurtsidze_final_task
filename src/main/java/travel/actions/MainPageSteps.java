package travel.actions;

import travel.elements.MainPageElements;

public class MainPageSteps extends MainPageElements {
   public void clickAccountButton(){
       accountDropdown.click();
   }

   public void clickSignupButton(){
       signUpButton.click();
   }

   public void goToHotelsPage(){
       hotelsLink.click();
   }

}
