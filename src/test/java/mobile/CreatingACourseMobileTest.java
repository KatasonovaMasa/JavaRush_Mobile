package mobile;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("JRMobile")
@Owner("Катасонова Мария")
@Feature("Автотесты для Mobile")
@Story("Создание персонального курса")
@DisplayName("Создание персонального курса")
public class CreatingACourseMobileTest extends TestBaseMobile {

    @Test
    @DisplayName("Создание курса БЕЗ прохождения опроса")
    void creatProgrammingCourseWithoutTakingQuestions() {
        creatingACourseMobileStep.pressStartButton();
        creatingACourseMobileStep.pressStartQuizButton();
        creatingACourseMobileStep.choiceLanguage();
        creatingACourseMobileStep.choiceQaEngineer();
        creatingACourseMobileStep.choiceClassicStyle();
        creatingACourseMobileStep.choiceMotivationYesWhen();
        creatingACourseMobileStep.choiceQuizThemeDark();
        creatingACourseMobileStep.replyExperienceNo();
        creatingACourseMobileStep.checkingAuthHeaderTitle();
    }

    @Test
    @DisplayName("Создание курса ПРИ прохождении опроса")
    void creatProgrammingCourseByPassingTheQuestions() {
        creatingACourseMobileStep.pressStartButton();
        creatingACourseMobileStep.pressStartQuizButton();
        creatingACourseMobileStep.choiceLanguage();
        creatingACourseMobileStep.choiceQaEngineer();
        creatingACourseMobileStep.choiceClassicStyle();
        creatingACourseMobileStep.choiceMotivationYesWhen();
        creatingACourseMobileStep.choiceQuizThemeDark();
        creatingACourseMobileStep.replyExperienceYes();
        creatingACourseMobileStep.pressStartQuizTwoButton();
        creatingACourseMobileStep.cycleOfQuestions();
        creatingACourseMobileStep.checkingProgressView();
        creatingACourseMobileStep.checkingCourse();
        creatingACourseMobileStep.getCourse();
        creatingACourseMobileStep.checkingAuthHeaderTitle();
    }
}


