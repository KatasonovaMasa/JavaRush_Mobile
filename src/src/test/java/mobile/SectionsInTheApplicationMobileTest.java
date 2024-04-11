package mobile;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.sleep;

@Tag("JRMobile")
@Owner("Катасонова Мария")
@Story("Разделы в приложении")
@Feature("Автотесты для Mobile")
@DisplayName("Разделы в приложении")
public class SectionsInTheApplicationMobileTest extends TestBaseMobile {

    @CsvSource(value = {"Course, Java course", "Tasks, Tasks", "Help, Questions",
            "Groups, Community", "Chat, Chat", "Surveys & Quizzes, Surveys & Quizzes",
    })
    @ParameterizedTest
    @DisplayName("Проверка разделов приложения")
    void openSectionsInTheApplication(String param, String expectedText) {
        commonSteps.openApp();
        authorizationTheApplicationStep.pressComeBack();
        authorizationTheApplicationStep.pressComeBack();
        sleep(1000);
        authorizationTheApplicationStep.pressComeBack();
        sectionTheApplicationMobileStep.pressOnTheApplicationSection(param);
        sectionTheApplicationMobileStep.checkTitleSectionName(expectedText);
    }
}
