package mobile.steps;

import io.qameta.allure.Step;
import mobile.pages.AuthorizationTheApplicationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class AuthorizationTheApplicationStep {

    AuthorizationTheApplicationPage authorizationTheApplicationPage = new AuthorizationTheApplicationPage();

    @Step("Нажать 'Войти' ")
    public void tapComeIn() {
        authorizationTheApplicationPage.comeIn.click();
    }

    @Step("Ввести в email почту")
    public void insertEmailKeys(String email) {
        authorizationTheApplicationPage.emailInput.sendKeys(email);
    }

    @Step("Ввести в password пароль")
    public void insertPasswordKeys(String password) {
        authorizationTheApplicationPage.passwordInput.sendKeys(password);
    }

    @Step("Нажать 'Войти' ")
    public void tapLogin() {
        authorizationTheApplicationPage.login.click();
    }

    @Step("Проверить, что появился баннер об Акции")
    public void checkingBannerImage() {
        authorizationTheApplicationPage.bannerImage.shouldBe(visible.because("Нет банера с Акциями"));
    }

    @Step("Закрыть баннер об Акции")
    public void closeBanner() {
        authorizationTheApplicationPage.closeBanner.click();
    }

    @Step("Проверить, что появилась инструкция об Элли")
    public void checkingManualElli() {
        authorizationTheApplicationPage.miniInstructionsEllie.shouldHave(text("Welcome to the JavaRush app").because("Не авторизовались"));
    }

    @Step("Закрыть мини инструкцию от Элли")
    public void closeMiniInstructionsEllie() {
        for (int i = 0; i < 4; i++) {
            authorizationTheApplicationPage.miniInstructionsEllie.click();
        }
    }

    @Step("Закрыть продолжение мини инструкции от Элли")
    public void closeMiniInstructionsEllieWindow() {
        for (int i = 0; i < 2; i++) {
            authorizationTheApplicationPage.miniInstructionsEllieWindow.click();
        }
    }

    @Step("Нажать на Назад")
    public void pressComeBack() {
        authorizationTheApplicationPage.comeBack.click();
    }
}
