package testbase;

import com.microsoft.playwright.Page;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlaywrightBrowserActions {

    protected final Page page;

    public PlaywrightBrowserActions(Page page) {
        this.page = page;
    }


    public PlaywrightBrowserActions navigateTo(String url) {
        log.info("Opening the web page: {}", url);
        page.navigate(url);
        return this;
    }
}
