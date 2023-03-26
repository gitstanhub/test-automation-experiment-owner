package elements;

import assertions.ElementChecks;
import base.PlaywrightDriverHandler;
import com.microsoft.playwright.Page;
import locators.SummaryHeaderLocators;

public class SummaryHeader extends PlaywrightDriverHandler {

    ElementChecks elementChecks = new ElementChecks();
    SummaryHeaderLocators summaryHeaderLocators = new SummaryHeaderLocators();

    private final Page page;

    public SummaryHeader() {
        this.page = getPage();
    }

    public void verifySelectedModel(String selectedModelDescription) {
        elementChecks.hasText(summaryHeaderLocators.SUMMARY_HEADER_TITLE, selectedModelDescription);
    }
}
