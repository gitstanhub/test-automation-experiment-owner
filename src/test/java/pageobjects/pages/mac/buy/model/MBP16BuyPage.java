package pageobjects.pages.mac.buy.model;

import base.PlaywrightDriverHandler;
import com.microsoft.playwright.Page;

public class MBP16BuyPage extends PlaywrightDriverHandler {

    private Page page;

    public MBP16BuyPage() {
        this.page = getPage();
    }

    public MBP16BuyPage selectMBPConfig(String MBPConfig) {
        page.click(MBPConfig);
        return this;
    }
}
