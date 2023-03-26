package pages;

import base.PlaywrightDriverHandler;
import browser.PlaywrightBrowserActions;
import com.microsoft.playwright.Page;

public class HomePage extends PlaywrightDriverHandler {

    PlaywrightBrowserActions playwrightBrowserActions = new PlaywrightBrowserActions();

    private final Page page;

    public HomePage() {
        this.page = getPage();
    }

    public void open() {
        String url = "apple_website_url/de";

        playwrightBrowserActions.navigateTo(url);
    }
}
