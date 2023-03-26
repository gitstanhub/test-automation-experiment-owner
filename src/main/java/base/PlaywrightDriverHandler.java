package base;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class PlaywrightDriverHandler {

    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext context;
    private static Page page;

    @BeforeEach
    public void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context = browser.newContext();
        page = context.newPage();
        page.setViewportSize(1280, 720);
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
}
