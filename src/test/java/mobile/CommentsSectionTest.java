package mobile;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static help.GenerateRandomPage.generateRockStarText;

@Tag("JRMobile")
@Owner("Катасонова Мария")
@Story("Комментарии")
@Feature("Автотесты для Mobile")
@DisplayName("Блок Комментариев")
public class CommentsSectionTest extends TestBaseMobile {

    @Test
    @DisplayName("Добавление комментария под статьёй")
    void addCommentUnderAnArticle() {
        commonSteps.openApp();
        commentsSectionStep.pressIconComments();
        commentsSectionStep.checkingTitleComments();
        commentsSectionStep.addButtonCommentFab();
        commentsSectionStep.addComments();
        String expectedComment = generateRockStarText();
        commentsSectionStep.insertGeneratedText(expectedComment);
        commentsSectionStep.sendComment();
        commentsSectionStep.clickOnTheThreeDotsOfTheLastComment();
        commentsSectionStep.openEditMode();
        String actualComment = commentsSectionStep.checkAddedComment();
        Assertions.assertEquals((expectedComment), (actualComment), ":комментарий не добавлен");
        commentsSectionStep.closeEditMode();
        commentsSectionStep.clickOnTheThreeDotsOfTheLastComment();
        commentsSectionStep.deleteComment();
    }

    @Test
    @DisplayName("Проверка блоков комментариев")
    void checkCommentBlocks() {
        commonSteps.openApp();
        commentsSectionStep.pressIconComments();
        commentsSectionStep.checkingTitleComments();
        commentsSectionStep.checkingPopularComment();
        commentsSectionStep.checkNewsComment();
        commentsSectionStep.checkOldComment();
    }
}
