package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CreatingACourseMobilePage {

    public final SelenideElement startButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/start"));
    public final SelenideElement startQuizButtonOne = $(AppiumBy.id("com.hitechrush.jaxarush:id/startQuiz1"));
    public final SelenideElement qaEngineer = $(AppiumBy.id("com.hitechrush.jaxarush:id/qaEngineer"));
    public final SelenideElement classicStyle = $(AppiumBy.id("com.hitechrush.jaxarush:id/classicStyle"));
    public final SelenideElement motivationYesWhen = $(AppiumBy.id("com.hitechrush.jaxarush:id/motivationYesWhen"));
    public final SelenideElement quizThemeDark = $(AppiumBy.id("com.hitechrush.jaxarush:id/quizThemeDark"));
    public final SelenideElement experienceNo = $(AppiumBy.id("com.hitechrush.jaxarush:id/experienceNo"));
    public final SelenideElement experienceYes = $(AppiumBy.id("com.hitechrush.jaxarush:id/experienceYes"));
    public final SelenideElement startQuizButtonTwo = $(AppiumBy.id("com.hitechrush.jaxarush:id/startQuiz2"));
    public final SelenideElement progressView = $(AppiumBy.id("com.hitechrush.jaxarush:id/progressView"));
    public final SelenideElement courseTitle = $(AppiumBy.className("android.widget.TextView"));
    public final SelenideElement getCourse = $(AppiumBy.id("com.hitechrush.jaxarush:id/getCourse"));
    public final SelenideElement findOutLevelTitle = $(AppiumBy.id("com.hitechrush.jaxarush:id/findOutLevelTitle"));
    public final SelenideElement nextQuestionButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/nextQuestionButton"));

    public final ElementsCollection language = $$(AppiumBy.className("android.widget.TextView"));
    public final ElementsCollection authHeaderTitle = $$(AppiumBy.id("com.hitechrush.jaxarush:id/authHeaderTitle"));
    public final ElementsCollection elements = $$(AppiumBy.className("android.widget.ImageView"));
    public final ElementsCollection radioButton = $$(AppiumBy.className("android.widget.RadioButton"));
}
