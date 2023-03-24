package apple.onlineshop.sanity.macbook;

import org.junit.jupiter.api.Test;
import pages.HomePage;
import testbase.PlayWrightTestBase;
import testbase.PlaywrightBrowserActions;

public class SelectMBPTest extends PlayWrightTestBase {

    PlaywrightBrowserActions playwrightBrowserActions = new PlaywrightBrowserActions(getPage());
    HomePage homePage = new HomePage(getPage());
    @Test
    public void pageOpenTest() {
        String url = "https://apple.com/de";
        playwrightBrowserActions.navigateTo(url);

    }
}
