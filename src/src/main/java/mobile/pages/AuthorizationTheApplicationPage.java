package mobile.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class AuthorizationTheApplicationPage {

    public final SelenideElement comeIn = $(AppiumBy.id("com.hitechrush.jaxarush:id/enterTextViewLink"));
    public final SelenideElement emailInput = $(AppiumBy.id("com.hitechrush.jaxarush:id/emailEditText"));
    public final SelenideElement passwordInput = $(AppiumBy.id("com.hitechrush.jaxarush:id/passwordEditText"));
    public final SelenideElement login = $(AppiumBy.id("com.hitechrush.jaxarush:id/loginButton"));
    public final SelenideElement bannerImage = $(AppiumBy.id("com.hitechrush.jaxarush:id/bannerImage"));
    public final SelenideElement closeBanner = $(AppiumBy.id("com.hitechrush.jaxarush:id/bannerCloseButton"));
    public final SelenideElement miniInstructionsEllie = $(AppiumBy.id("com.hitechrush.jaxarush:id/toolTipDesc"));
    public final SelenideElement miniInstructionsEllieWindow = $(AppiumBy.className("android.widget.RelativeLayout"));
    public final SelenideElement comeBack = $(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
}
