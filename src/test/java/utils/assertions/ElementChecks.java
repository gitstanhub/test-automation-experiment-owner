package utils.assertions;

import base.PlaywrightDriverHandler;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ElementChecks extends PlaywrightDriverHandler {

    private final Page page;

    public ElementChecks() {
        this.page = getPage();
    }

    public void hasText(String selector, String expectedText) {
        Locator element = page.locator(selector);
        assertThat(element).containsText(expectedText);
    }
}
