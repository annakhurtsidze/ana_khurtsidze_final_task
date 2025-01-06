package travel.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HotelsPageElements {
    public SelenideElement


            city =$x("//div[@class='input-items']"),
    citySearchField = $x("//input[@class='select2-search__field']"),
    checkinDateElement = $("#checkin"),
    checkoutDateElement = $("#checkout"),
    hotelSearchButton = $x("//button[contains(@class, 'search_button')]"),
    firstValueFromCityDropDown = $x("//div[@class='most--popular-hotels']/div[1]"),
    highestToLowestPriceFilter = $("#desc"),
    applyFilterButton = $x("//div[@class='w-100 filter--input filter-search']"),
    viewMoreButton = $x("(//a[contains(text(), 'View More')])[1]"),
    hotelsLoader = $("#loaderAnimation");
    ;
}
