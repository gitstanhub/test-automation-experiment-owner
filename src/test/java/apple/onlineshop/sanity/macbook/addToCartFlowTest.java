package apple.onlineshop.sanity.macbook;

import elements.BundleSelector;
import elements.ConfigSummaryBar;
import elements.NavBar;
import org.junit.jupiter.api.Test;
import browser.PlaywrightBrowserActions;
import pages.mac.MBPCommonLandingPage;
import pages.mac.buy.model.MBP16BuyPage;
import pages.mac.buy.model.MBP16ConfiguratorPage;

public class addToCartFlowTest {

    PlaywrightBrowserActions playwrightBrowserActions = new PlaywrightBrowserActions();
    NavBar navBar = new NavBar();
    MBPCommonLandingPage mbpCommonLandingPage = new MBPCommonLandingPage();
    BundleSelector bundleSelector = new BundleSelector();
    MBP16BuyPage mbp16BuyPage = new MBP16BuyPage();
    MBP16ConfiguratorPage mbp16ConfiguratorPage = new MBP16ConfiguratorPage();
    ConfigSummaryBar configSummaryBar = new ConfigSummaryBar();


    @Test
    public void addMacBookPro() {
        String url = "apple_website_url/de";
        String categoryName = "[data-analytics-element-engagement='globalnav hover - mac']";
        String categoryItem = "[data-analytics-title='macbook pro']";
        String mbpModel = "[data-analytics-title='buy - 14 and 16 inch macbook pro']";
        String screenSize = "[data-autom='filterButton-16inch']";
        String MBPConfig = "[data-autom='proceed-16inch-better']";

        playwrightBrowserActions.navigateTo(url);
        navBar.selectItemFromCategory(categoryName, categoryItem);
        mbpCommonLandingPage.selectMBPModel(mbpModel);
        bundleSelector.selectScreenSize(screenSize);
        mbp16BuyPage.selectMBPConfig(MBPConfig);
        configSummaryBar.addToCart();
    }
}
