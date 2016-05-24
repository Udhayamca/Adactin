package pages;

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
}
