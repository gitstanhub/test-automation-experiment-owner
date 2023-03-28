package pageobjects.pages;

import base.PlaywrightDriverHandler;
import utils.browseractions.PlaywrightBrowserActions;
import com.microsoft.playwright.Page;

public class HomePage extends PlaywrightDriverHandler {

    PlaywrightBrowserActions playwrightBrowserActions = new PlaywrightBrowserActions();

    private final Page page;

    public HomePage() {
        this.page = getPage();
    }

    public void open() {
        String url = getApplicationConfig().baseURL() + getApplicationConfig().locale();

        playwrightBrowserActions.navigateTo(url);
    }
}
