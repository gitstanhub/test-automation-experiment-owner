package elements;

import base.PlaywrightDriverHandler;
import com.microsoft.playwright.Page;

public class ConfigSummaryBar extends PlaywrightDriverHandler {

    private final Page page;

    public ConfigSummaryBar() {
        this.page = getPage();
    }

    public ConfigSummaryBar addToCart() {
        String addToCartLocator = "[data-autom='addToCart']";

        page.click(addToCartLocator);
        return this;
    }
}
