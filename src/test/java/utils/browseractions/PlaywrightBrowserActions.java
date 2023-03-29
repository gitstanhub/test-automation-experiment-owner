package utils.browseractions;

import base.PlaywrightDriverHandler;
import com.microsoft.playwright.Page;

public class PlaywrightBrowserActions extends PlaywrightDriverHandler {

    private final Page page;

    public PlaywrightBrowserActions() {
        this.page = getPage();
    }

    public void navigateTo(String url) {
        System.out.println("Opening the web page: " + url);
        page.navigate(url);
    }
}
