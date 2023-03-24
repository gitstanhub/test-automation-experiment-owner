package testbase;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class PlayWrightTestBase {

    static Playwright playwright;
    static Browser browser;
    private static BrowserContext context;
    static Page page;

    @BeforeAll
    public static void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context = browser.newContext();
        page = context.newPage();
        page.setViewportSize(1280, 720);
    }

    @AfterAll
    public static void tearDown() {
        context.close();
        playwright.close();
    }

    public static Page getPage() {
        return page;
    }
}
