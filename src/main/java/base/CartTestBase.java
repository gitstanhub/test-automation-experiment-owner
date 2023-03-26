package base;

import TestData.MBPModelsData;
import elements.BundleSelector;
import elements.ConfigSummaryBar;
import elements.NavBar;
import elements.SummaryHeader;
import locators.CategoryLocators;
import locators.MBPConfigLocators;
import locators.MBPLocators;
import pages.HomePage;
import pages.mac.MBPCommonLandingPage;
import pages.mac.buy.model.MBP16BuyPage;

public class CartTestBase {

    protected HomePage homePage = new HomePage();
    protected NavBar navBar = new NavBar();
    protected MBPCommonLandingPage mbpCommonLandingPage = new MBPCommonLandingPage();
    protected BundleSelector bundleSelector = new BundleSelector();
    protected MBP16BuyPage mbp16BuyPage = new MBP16BuyPage();
    protected ConfigSummaryBar configSummaryBar = new ConfigSummaryBar();
    protected CategoryLocators categoryLocators = new CategoryLocators();
    protected MBPLocators mbpLocators = new MBPLocators();
    protected MBPConfigLocators mbpConfigLocators = new MBPConfigLocators();
    protected SummaryHeader summaryHeader = new SummaryHeader();
    protected MBPModelsData mbpModelsData = new MBPModelsData();
}
