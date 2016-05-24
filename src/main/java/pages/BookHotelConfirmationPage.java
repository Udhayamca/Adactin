package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

/**
 * Created by Udhayakumar PC2 on 23-05-2016.
 */
public class BookHotelConfirmationPage extends OpentapsWrappers {

    public BookedItineraryPage clickMyItinerary() {
        clickById(prop.getProperty("Home.Myitinerary.id"));
        return new BookedItineraryPage();
    }
    public BookHotelConfirmationPage  clickLogout() {
        clickByXpath(prop.getProperty("LogoutPage.Logout.Link"));
        return this;

    }

    public BookHotelConfirmationPage verifyTotelPrice(String price){
        if(!verifyTextboxValueById(prop.getProperty("bookconfirmation.totalprice.id"),price))
            Reporter.reportStep("Price Not Matched with the Entered Data ","FAIL");
        return this ;
    }
}
