package mobile.steps;

import io.qameta.allure.Step;
import mobile.pages.CommentsSectionPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;

public class CommentsSectionStep {

    CommentsSectionPage commentsSectionPage = new CommentsSectionPage();

    @Step("Нажать на кнопку Комментарий")
    public void pressIconComments() {
        commentsSectionPage.iconComments.shouldBe(visible).click();
    }

    @Step("Проверить, что мы перешли на вкладку Комментариев")
    public void checkingTitleComments() {
        commentsSectionPage.titleComments.shouldBe(text("Comments").because("Мы не в блоке Комментариев"));
    }

    @Step("Нажать на кнопку добавления комментария")
    public void addButtonCommentFab() {
        sleep(4000);
        commentsSectionPage.addCommentFab.shouldBe(visible).click();
    }

    @Step("Нажать на поле комментария")
    public void addComments() {
        commentsSectionPage.addComment.shouldBe(visible).click();
    }

    @Step("Вставить сгенерированный текст")
    public void insertGeneratedText(String textComment) {
        commentsSectionPage.addComment.sendKeys(textComment);
    }

    @Step("Нажать на 'Отправить' комментарий")
    public void sendComment() {
        commentsSectionPage.sendButton.shouldBe(visible).click();
    }

    @Step("Открыть режим редактирования")
    public void openEditMode() {
        commentsSectionPage.editButton.click();
    }

    @Step("Получить текст комментария "
            + "и проверить, что он соответствует тому что мы вводили")
    public String checkAddedComment() {
        return commentsSectionPage.addCommentText.getText();
    }

    @Step("Закрыть режим редактирования")
    public void closeEditMode() {
        commentsSectionPage.navigateUp.click();
    }

    @Step("Нажать на три точки последнего комментария")
    public void clickOnTheThreeDotsOfTheLastComment() {
        commentsSectionPage.menu.click();
    }

    @Step("Удалить комментарий")
    public void deleteComment() {
        commentsSectionPage.deleteButton.click();
    }

    @Step("Проверить, что есть блок 'Популярные' комментарии")
    public void checkingPopularComment() {
        commentsSectionPage.popularComment.shouldBe(visible.because("Нет блока 'Популярных' комментариев"));
    }

    @Step("Проверить, что есть блок 'Новые' комментарии")
    public void checkNewsComment() {
        commentsSectionPage.newsComment.shouldBe(visible.because("Нет блока 'Новых' комментариев"));
    }

    @Step("Проверить, что есть блок 'Старые' комментарии")
    public void checkOldComment() {
        commentsSectionPage.oldComment.shouldBe(visible.because("Нет блока 'Старых' комментариев"));
    }
}
