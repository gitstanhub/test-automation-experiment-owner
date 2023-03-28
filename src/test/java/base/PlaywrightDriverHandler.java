package base;

import config.BrowserName;
import com.microsoft.playwright.*;
import config.ApplicationConfig;
import config.ConfigReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class PlaywrightDriverHandler {

    private static final ApplicationConfig applicationConfig = ConfigReader.INSTANCE.read();
    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext context;
    private static Page page;

    @BeforeEach
    public void setUp() {
        playwright = Playwright.create();

        System.out.println(getApplicationConfig().browserName());
        if (applicationConfig.browserName().toString().equals(BrowserName.Chromium.toString())) {
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        } else if (applicationConfig.browserName().toString().equals(BrowserName.Firefox.toString())) {
            browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        } else {
            throw new IllegalArgumentException("Unknown browser");
        }

        context = browser.newContext();
        page = context.newPage();
        page.setViewportSize(getApplicationConfig().browserSizeWidth(), getApplicationConfig().browserSizeHeight());
    }

    @AfterEach
    public void tearDown() {
        context.close();
        playwright.close();
    }

    public static Page getPage() {
        if (page == null) {
            new PlaywrightDriverHandler().setUp();
        }
        return page;
    }

    public static ApplicationConfig getApplicationConfig() {
        return applicationConfig;
    }
}
