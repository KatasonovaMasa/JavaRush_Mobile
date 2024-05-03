package steps;

import config.AuthConfig;
import steps.AuthorizationTheApplicationStep;
import org.aeonbits.owner.ConfigFactory;

public class CommonSteps {

    static AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());

    static AuthorizationTheApplicationStep authSteps = new AuthorizationTheApplicationStep();

    public void openApp() {
        authSteps.tapComeIn();
        authSteps.insertEmailKeys(config.login());
        authSteps.insertPasswordKeys(config.password());
        authSteps.tapLogin();
        authSteps.closeBanner();
        authSteps.closeMiniInstructionsEllie();
        authSteps.closeMiniInstructionsEllieWindow();
    }
}
