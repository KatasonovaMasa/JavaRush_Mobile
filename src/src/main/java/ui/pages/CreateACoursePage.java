package ui.pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CreateACoursePage {

    public final SelenideElement startLearning = $x("//button[@id='id_button_jr_welcome_start_learning_1']");
    public final SelenideElement selectLanguage = $x(" //div[contains(text(),'Русский')]");
    public final SelenideElement chooseQa = $x("//div[contains(text(),'Инженером тестирования')]");
    public final SelenideElement chooseTheme = $x("//div[@id='id_button_jr_welcome_light_theme']");
    public final SelenideElement yesExperience = $x("//div[@id='id_button_jr_welcome_determine_my_level']");
    public final SelenideElement notExperience = $x("//div[@id='id_button_jr_welcome_start_from_scratch']");
    public final SelenideElement levelOfExperience = $x("//*[@id='id_button_jr_welcome_start_testing']");
    public final SelenideElement nextButton = $x("//button[contains(@class, 'btn')]");
    public final SelenideElement welcomeSignUpNot = $x("//*[@id='id_button_jr_welcome_sign_up_not_now']");
    public final SelenideElement checkCreatCourse = $x("//div[contains(@class, 'section-title') and contains(@class, 'svelte') and contains(@class, 'section-title--center')]");
    public final SelenideElement oneRadioButton = $x("//*[contains(@class, 'quiz-content')]//div[5]//label[1]//span[1]");
    public final SelenideElement unitRadioButton = $x("//div[contains(@class, 'quiz-section') and contains(@class, 'fade svelte')]");

    public final ElementsCollection radioButton = $$x("//*[contains(@class, 'radio-button') and contains(@class, 'radio-button--basic') and contains(@class, 'svelte')]");
    public final ElementsCollection list = $$x("//*[contains(@class, 'progress-bar__step') and contains(@class, 'svelte')]");
}
