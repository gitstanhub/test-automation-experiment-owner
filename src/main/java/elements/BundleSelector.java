package elements;

import base.PlaywrightDriverHandler;
import com.microsoft.playwright.Page;

public class BundleSelector extends PlaywrightDriverHandler {

    private final Page page;

    public BundleSelector() {
        this.page = getPage();
    }

    public BundleSelector selectScreenSize(String screenSize) {
        page.click(screenSize);
        return this;
    }
}
