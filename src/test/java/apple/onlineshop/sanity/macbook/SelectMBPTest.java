package apple.onlineshop.sanity.macbook;

import elements.NavBar;
import org.junit.jupiter.api.Test;
import browser.PlaywrightBrowserActions;

public class SelectMBPTest {

    PlaywrightBrowserActions playwrightBrowserActions = new PlaywrightBrowserActions();
    NavBar navBar = new NavBar();

    @Test
    public void pageOpenTest() {
        String url = "https://apple.com/de";
        String categoryName = "[data-analytics-element-engagement='globalnav hover - mac']";
        String categoryItem = "[data-analytics-title='macbook pro']";

        playwrightBrowserActions.navigateTo(url);
        navBar.selectItemFromCategory(categoryName, categoryItem);
    }
}
