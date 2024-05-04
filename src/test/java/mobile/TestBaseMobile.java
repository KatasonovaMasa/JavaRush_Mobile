package mobile;

import com.codeborne.selenide.Configuration;
import config.MobileConfig;
import drivers.LocalDriver;
import help.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import drivers.BrowserstackDriver;
import steps.*;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class TestBaseMobile {

    protected static MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
    static boolean isRemote = Boolean.parseBoolean(System.getProperty("isRemote", config.isRemote()));
    SectionTheApplicationMobileStep sectionTheApplicationMobileStep = new SectionTheApplicationMobileStep();
    AuthorizationTheApplicationStep authorizationTheApplicationStep = new AuthorizationTheApplicationStep();
    CreatingACourseMobileStep creatingACourseMobileStep = new CreatingACourseMobileStep();
    LikesUnderTheArticleStep likesUnderTheArticleStep = new LikesUnderTheArticleStep();
    CommentsSectionStep commentsSectionStep = new CommentsSectionStep();
    CommonSteps commonSteps = new CommonSteps();

    @BeforeAll
    public static void setup() {
        Configuration.browser = BrowserstackDriver.class.getName();
        Configuration.browser = LocalDriver.class.getName();
        if (isRemote) {
        }
        addListener("AllureSelenide", new AllureSelenide());
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 10000;
        Configuration.browserSize = null;
    }

    @BeforeEach
    public void startDriver() {
        open();
        addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    public void afterEach() {
        String sessionId = sessionId().toString();
        if (isRemote) {
            Attach.addVideo(sessionId);
        }
        closeWebDriver();
    }
}
