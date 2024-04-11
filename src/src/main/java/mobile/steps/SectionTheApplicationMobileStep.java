package mobile.steps;

import io.qameta.allure.Step;
import mobile.pages.SectionsTheApplicationMobilePage;

import static com.codeborne.selenide.Condition.text;

public class SectionTheApplicationMobileStep {

    SectionsTheApplicationMobilePage sectionsTheApplicationMobilePage = new SectionsTheApplicationMobilePage();

    @Step("Нажать на раздел приложения")
    public void pressOnTheApplicationSection(String param) {
        sectionsTheApplicationMobilePage.tabName.find(text(param)).click();
    }

    @Step("Проверить заголовок открывшегося отдела")
    public void checkTitleSectionName(String expectedText) {
        sectionsTheApplicationMobilePage.titleTabName.shouldBe(text(expectedText).because("Название соответствует открытой вкладки"));
    }
}
