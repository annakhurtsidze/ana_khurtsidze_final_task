package travel.actions;

import travel.elements.HotelsPageElements;

import java.time.Duration;
import java.time.LocalDate;
import static com.codeborne.selenide.Condition.visible;

public class HotelsPageSteps extends HotelsPageElements {

    public void clickCityDropdown(){
        city.click();
    }

    public void selectCity(){
        firstValueFromCityDropDown.shouldBe(visible).click();
    }


    public void setCheckinAndCheckoutDate(){
        LocalDate minCheckInDate = LocalDate.now();
        LocalDate maxheckoutDate = LocalDate.now().plusMonths(1);

        LocalDate checkInDate = minCheckInDate.plusDays(1);
        LocalDate checkOutDate = checkInDate.plusDays(3);

        if(checkInDate.isBefore(maxheckoutDate) && checkInDate.isAfter(minCheckInDate)){
            checkinDateElement.setValue(String.valueOf(checkInDate)).click();
        }

        if(checkOutDate.isAfter(minCheckInDate) && checkOutDate.isBefore(maxheckoutDate)){
            checkoutDateElement.setValue(String.valueOf(checkOutDate)).click();
        }
    }

    public void clickSearchButton(){
        hotelSearchButton.click();
    }

    public void waitUntilPageLoad(){
        hotelsLoader.shouldNotBe(visible, Duration.ofSeconds(10));
    }


    public void filterDescOrder(){
        highestToLowestPriceFilter.shouldBe(visible).scrollIntoView(true).click();
   }

    public void clickApplyFilterButton(){
        applyFilterButton.shouldBe(visible, Duration.ofSeconds(15)).click();
    }

    public void clickOnViewMoreButton(){
        viewMoreButton.scrollIntoView(true).shouldBe(visible, Duration.ofSeconds(10)).click();

    }



}