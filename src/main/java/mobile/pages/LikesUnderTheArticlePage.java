package mobile.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class LikesUnderTheArticlePage {

    public final SelenideElement element = $(AppiumBy.id("com.hitechrush.jaxarush:id/lectureLikesCount"));
    public final SelenideElement likeIcon = $(AppiumBy.id("com.hitechrush.jaxarush:id/lectureLikeIcon"));
    public final SelenideElement likeDesc = $(AppiumBy.id("com.hitechrush.jaxarush:id/itemLikeDesc"));
}
