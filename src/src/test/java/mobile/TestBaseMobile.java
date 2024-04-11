package mobile;

import com.codeborne.selenide.Configuration;
import ui.config.WebConfig;
import help.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import mobile.drivers.BrowserstackDriver;
import mobile.drivers.LocalDriver;
import mobile.steps.*;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class TestBaseMobile {

    protected static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
    static boolean isRemote = Boolean.parseBoolean(System.getProperty("isRemote", config.isRemote()));
    SectionTheApplicationMobileStep sectionTheApplicationMobileStep = new SectionTheApplicationMobileStep();
    AuthorizationTheApplicationStep authorizationTheApplicationStep = new AuthorizationTheApplicationStep();
    CreatingACourseMobileStep creatingACourseMobileStep = new CreatingACourseMobileStep();
    LikesUnderTheArticleStep likesUnderTheArticleStep = new LikesUnderTheArticleStep();
    CommentsSectionStep commentsSectionStep = new CommentsSectionStep();
    CommonSteps commonSteps = new CommonSteps();

    @BeforeAll
    public static void setup() {
        addListener("AllureSelenide", new AllureSelenide());
//        Configuration.browser = LocalDriver.class.getName();
//        if (isRemote) {
             Configuration.browser = BrowserstackDriver.class.getName();
//        }
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 10000;
        Configuration.browserSize = null;
    }

    @BeforeEach
    public void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    public void afterEach() {
//        String sessionId = sessionId().toString();
//        if (isRemote) {
//            Attach.addVideo(sessionId);
//        }
        closeWebDriver();
    }
}
