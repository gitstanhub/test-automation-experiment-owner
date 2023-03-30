package web.appleonlineshop.sanityflow.macbook;

import base.CartTestBase;
import org.junit.jupiter.api.Test;

public class AddToCartFlowTest extends CartTestBase {

    @Test
    public void addMacBookPro() {

        homePage.open();

        navBar.selectItemFromCategory(categoryLocators.MACBOOK, categoryLocators.MACBOOK_PRO);
        mbpCommonLandingPage.selectMBPModel(mbpLocators.MBP_14_16_INCH);
        bundleSelector.selectScreenSize(mbpConfigLocators.SCREEN_SIZE_16_INCH);
        mbp16BuyPage.selectMBPConfig(mbpConfigLocators.CONFIG_16_INCH_BETTER);
        configSummaryBar.addToCart();

        summaryHeader.verifySelectedModel(mbpModelsData.MBP16_MODEL_DESCRIPTION);
    }
}
