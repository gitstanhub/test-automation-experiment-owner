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
        String url = "https://apple.com/de";

        playwrightBrowserActions.navigateTo(url);
    }
}
