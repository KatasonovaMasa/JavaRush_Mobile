package ui.steps;

import io.qameta.allure.Step;
import ui.pages.FunctionOfTheStartTrainingPage;

import static com.codeborne.selenide.Condition.text;

public class FunctionOfTheStartTrainingStep {

    FunctionOfTheStartTrainingPage functionOfTheStartTrainPage = new FunctionOfTheStartTrainingPage();

    @Step("Проверить, что курс создался")
    public void checkThisIsWhereTheyBecomeJavaProgrammers() {
        functionOfTheStartTrainPage.checkThisIsWhereTheyBecomeJavaProgrammers.shouldHave(text("Здесь становятся Java‑программистами").because("Не отображается варианты создания аккаунта")).click();
    }
}
