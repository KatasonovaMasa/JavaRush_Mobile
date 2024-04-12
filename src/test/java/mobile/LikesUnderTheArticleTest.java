package mobile;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

//@Tag("JRMobile")
@Owner("Катасонова Мария")
@Story("Лайки")
@Feature("Автотесты для Mobile")
@DisplayName("Лайки")
public class LikesUnderTheArticleTest extends TestBaseMobile {

    @Test
    @DisplayName("Добавление лайка")
    void addLikeUnderTheArticle() {
        commonSteps.openApp();
        int likesBeforeLike = likesUnderTheArticleStep.parsTextToNumber();
        likesUnderTheArticleStep.pressReactionsIcon();
        likesUnderTheArticleStep.pressLikeDesc();
        int likesAfterLike = likesUnderTheArticleStep.parsTextToNumber();
        Assertions.assertEquals((likesBeforeLike + 1), (likesAfterLike), ":неправильное количество лайков");
    }
}
