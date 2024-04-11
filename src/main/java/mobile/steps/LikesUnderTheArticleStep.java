package mobile.steps;

import io.qameta.allure.Step;
import mobile.pages.LikesUnderTheArticlePage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.sleep;

public class LikesUnderTheArticleStep {

    static LikesUnderTheArticlePage likesUnderTheArticlePage = new LikesUnderTheArticlePage();

    @Step("Записать в переменную количетсво лайков")
    public int parsTextToNumber() {
        String countLike = likesUnderTheArticlePage.element.getText();
        return Integer.parseInt(countLike);
    }

    @Step("Нажать на сердечко")
    public void pressReactionsIcon() {
        sleep(1000);
        likesUnderTheArticlePage.likeIcon.click();
    }

    @Step("Нажать на 'Нравится' ")
    public void pressLikeDesc() {
        likesUnderTheArticlePage.likeDesc.shouldBe(exist.because("Не дождались появление елемента"));
        likesUnderTheArticlePage.likeDesc.click();
    }
}
