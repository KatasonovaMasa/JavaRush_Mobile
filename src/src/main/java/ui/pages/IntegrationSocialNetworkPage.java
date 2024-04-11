package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class IntegrationSocialNetworkPage {

    public final SelenideElement acceptYouTube = $x("//*[@aria-label='Accept all']");
    public final SelenideElement youTubeChannel = $x("//div[@id='inner-header-container']//yt-formatted-string[@id='text']");
    public final SelenideElement telegramChannel = $x("//span[@dir='auto']");
}
