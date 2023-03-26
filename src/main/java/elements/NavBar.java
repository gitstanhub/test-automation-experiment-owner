package elements;

import base.PlaywrightDriverHandler;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;

public class NavBar extends PlaywrightDriverHandler {

    private final Page page;

    public NavBar() {
        this.page = getPage();
    }

    public NavBar selectItemFromCategory(String categorySelector, String itemSelector) {
        ElementHandle navBarCategory = page.querySelector(categorySelector);
        navBarCategory.hover();

        page.click(itemSelector);

        return this;
    }

}
