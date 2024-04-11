package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StartPage {

    public final SelenideElement startLearningOne = $x("//*[contains(@class, 'header__start-d')]//span[contains(text(),'Начать обучение')]");
    public final SelenideElement startLearningTwo = $x("//a[@id='id_button_jr_welcome_start_learning_2']");
    public final SelenideElement closeCookie = $x("//button[contains(@class, 'button') and contains(@class,'button--sm-wide') and contains(@class, 'button--apply')]");
    public final SelenideElement downloadButton = $x("//img[@alt='Google Play']");
    public final SelenideElement openYouTube = $x("//*[contains(@class, 'footer-soc__link--youtube')]");
    public final SelenideElement openTelegram = $x("//*[contains(@class, 'footer-soc__link--telegram')]");
}
