package pageobjects.pages.mac;

import base.PlaywrightDriverHandler;
import com.microsoft.playwright.Page;

public class MBPCommonLandingPage extends PlaywrightDriverHandler {

    private Page page;

    public MBPCommonLandingPage() {
        this.page = getPage();
    }

    public MBPCommonLandingPage selectMBPModel(String mbpModel) {
        page.click(mbpModel);
        return this;
    }
}
