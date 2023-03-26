package apple.onlineshop.sanity.macbook;

import TestData.MBPModelsData;
import elements.BundleSelector;
import elements.ConfigSummaryBar;
import elements.NavBar;
import elements.SummaryHeader;
import locators.CategoryLocators;
import locators.MBPConfigLocators;
import locators.MBPLocators;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.mac.MBPCommonLandingPage;
import pages.mac.buy.model.MBP16BuyPage;

public class AddToCartFlowTest {

    HomePage homePage = new HomePage();
    NavBar navBar = new NavBar();
    MBPCommonLandingPage mbpCommonLandingPage = new MBPCommonLandingPage();
    BundleSelector bundleSelector = new BundleSelector();
    MBP16BuyPage mbp16BuyPage = new MBP16BuyPage();
    ConfigSummaryBar configSummaryBar = new ConfigSummaryBar();

    CategoryLocators categoryLocators = new CategoryLocators();

    MBPLocators mbpLocators = new MBPLocators();

    MBPConfigLocators mbpConfigLocators = new MBPConfigLocators();

    SummaryHeader summaryHeader = new SummaryHeader();

    MBPModelsData mbpModelsData = new MBPModelsData();

    @Test
    public void addMacBookPro() {

        homePage.open();

        navBar.selectItemFromCategory(categoryLocators.MACBOOK, categoryLocators.MACBOOK_PRO);
        mbpCommonLandingPage.selectMBPModel(mbpLocators.MBP_14_16_INCH);
        bundleSelector.selectScreenSize(mbpConfigLocators.SCREEN_SIZE_16_INCH);
        mbp16BuyPage.selectMBPConfig(mbpConfigLocators.CONFIG_16_INCH_BETTER);
        configSummaryBar.addToCart();

        summaryHeader.verifySelectedModel(mbpModelsData.MBP16_MODEL_DESCRIPTION_DE);
    }
}
