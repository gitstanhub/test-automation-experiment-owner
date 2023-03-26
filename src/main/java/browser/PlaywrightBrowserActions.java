package browser;

import base.PlaywrightDriverHandler;
import com.microsoft.playwright.Page;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlaywrightBrowserActions extends PlaywrightDriverHandler {

    private final Page page;

    public PlaywrightBrowserActions() {
        this.page = getPage();
    }

    public void navigateTo(String url) {
        log.info("Opening the web page: {}", url);
        page.navigate(url);
    }
}
