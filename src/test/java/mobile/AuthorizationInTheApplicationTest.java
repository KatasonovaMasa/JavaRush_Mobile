package mobile;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import mobile.config.AuthConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("JRMobile")
@Owner("Катасонова Мария")
@Story("Авторизация")
@Feature("Автотесты для Mobile")
@DisplayName("Авторизация в приложении")
public class AuthorizationInTheApplicationTest extends TestBaseMobile {

    static AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());

    @Test
    @DisplayName("Авторизация по логину и паролю")
    void authorizationInTheApplication() {
        authorizationTheApplicationStep.tapComeIn();
        authorizationTheApplicationStep.insertEmailKeys(config.login());
        authorizationTheApplicationStep.insertPasswordKeys(config.password());
        authorizationTheApplicationStep.tapLogin();
        authorizationTheApplicationStep.checkingBannerImage();
        authorizationTheApplicationStep.closeBanner();
        authorizationTheApplicationStep.checkingManualElli();
    }
}
