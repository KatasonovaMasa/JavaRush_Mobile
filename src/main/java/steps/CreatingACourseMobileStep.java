package steps;

import com.codeborne.selenide.Condition;
import help.GenerateRandomPage;
import io.qameta.allure.Step;
import pages.CreatingACourseMobilePage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static java.time.Duration.ofSeconds;

public class CreatingACourseMobileStep {

    CreatingACourseMobilePage creatingACourseMobilePage = new CreatingACourseMobilePage();

    @Step("Нажать на 'Начать' ")
    public void pressStartButton() {
        creatingACourseMobilePage.startButton.click();
    }

    @Step("Нажать на 'Начать' ")
    public void pressStartQuizButton() {
        creatingACourseMobilePage.startQuizButtonOne.click();
    }

    @Step("Выбрать русский язык")
    public void choiceLanguage() {
        creatingACourseMobilePage.language.get(1).shouldHave(text("РУССКИЙ").because("Не смогли выбрать язык")).click();
    }

    @Step("Выбрать профессию тестирования")
    public void choiceQaEngineer() {
        creatingACourseMobilePage.qaEngineer.click();
    }

    @Step("Выбрать стиль подачи инфо - классический")
    public void choiceClassicStyle() {
        creatingACourseMobilePage.classicStyle.click();
    }

    @Step("Выбрать мотивации")
    public void choiceMotivationYesWhen() {
        creatingACourseMobilePage.motivationYesWhen.click();
    }

    @Step("Выбрать тёмную тему")
    public void choiceQuizThemeDark() {
        creatingACourseMobilePage.quizThemeDark.click();
    }

    @Step("Ответь 'НЕТ' опыта програмирования")
    public void replyExperienceNo() {
        creatingACourseMobilePage.experienceNo.click();
    }

    @Step("Проверить, что отобразилась надпись 'Создания аккаунта' ")
    public void checkingAuthHeaderTitle() {
        creatingACourseMobilePage.authHeaderTitle.get(1).shouldHave(text("Создание аккаунта").because("Не попали на форму создания аккаунта"), ofSeconds(10)).click();
    }

    @Step("Прохождение вопросов для получения курса")
    public void cycleOfQuestions() {
        creatingACourseMobilePage.nextQuestionButton.shouldBe(visible, Duration.ofSeconds(10));
        int count = creatingACourseMobilePage.elements.size();
        if (creatingACourseMobilePage.findOutLevelTitle.has(Condition.visible)) {
            for (int i = 0; i < count; i++) {
                creatingACourseMobilePage.radioButton.get(GenerateRandomPage.generateRandomNumber()).click();
                creatingACourseMobilePage.nextQuestionButton.shouldBe(visible, ofSeconds(10)).click();
            }
        }
    }

    @Step("Проверить, что идёт процесс создания курса")
    public void checkingProgressView() {
        creatingACourseMobilePage.progressView.click();
    }

    @Step("Проверить, что курс создался")
    public void checkingCourse() {
        creatingACourseMobilePage.courseTitle.click();
    }

    @Step("Нажать на 'Получить' курс")
    public void getCourse() {
        creatingACourseMobilePage.getCourse.click();
    }

    @Step("Ответь 'ДА' есть опыт програмирования")
    public void replyExperienceYes() {
        creatingACourseMobilePage.experienceYes.click();
    }

    @Step("Нажать на 'Начать' для определения уровня програмирования")
    public void pressStartQuizTwoButton() {
        creatingACourseMobilePage.startQuizButtonTwo.click();
    }
}
