package mobile.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class CommentsSectionPage {

    public final SelenideElement iconComments = $(AppiumBy.id("com.hitechrush.jaxarush:id/lectureCommentsIcon"));
    public final SelenideElement titleComments = $(AppiumBy.id("com.hitechrush.jaxarush:id/toolbarTitle"));
    public final SelenideElement addCommentFab = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentFab"));
    public final SelenideElement addComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText"));
    public final SelenideElement sendButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/send"));
    public final SelenideElement popularComment = $(AppiumBy.xpath("//android.widget.LinearLayout[@content-desc=\"Popular\"]/android.widget.TextView"));
    public final SelenideElement newsComment = $(AppiumBy.xpath("//android.widget.LinearLayout[@content-desc=\"New\"]/android.widget.TextView"));
    public final SelenideElement oldComment = $(AppiumBy.xpath("//android.widget.LinearLayout[@content-desc=\"Old\"]/android.widget.TextView"));
    public final SelenideElement menu = $(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"JavaRush\"])[2]"));
    public final SelenideElement editButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/editButton"));
    public final SelenideElement addCommentText = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText"));
    public final SelenideElement navigateUp = $(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
    public final SelenideElement deleteButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/deleteButton"));
}
