Проект JavaRush Test - это автоматизированный набор тестов для проверки функциональности JavaRush-онлайн курса по обучению JavaRush.
Он включает в себя API-тесты для взаимодействия с JavaRush API, Mobile-тесты и UI-тесты для проверки пользовательского интерфейса.

## JavaRush
<img alt="GIPHY" src=".github/sc/javarush.png">


Инструменты и технологии используемые для данного проекта
<p align="center">  
<a href="https://www.jetbrains.com/idea/"><code><img width="5%" title="IntelliJ IDEA" src=".github/logo/Intelij_IDEA.svg"></code></a>
<a href="https://www.java.com/"><code><img width="5%" title="Java" src=".github/logo/Java.svg"></code></a>
<a href="https://selenide.org/"></a><code><img width="5%" title="Selenide" src=".github/logo/Selenide.svg"></code></a>
<a href="https://aerokube.com/selenoid/"><code><img width="5%" title="Selenoid" src=".github/logo/Selenoid.svg"></code></a>
<a href="https://gradle.org/"><code><img width="5%" title="Gradle" src=".github/logo/Gradle.svg"></code></a>
<a href="https://junit.org/junit5/"><code><img width="5%" title="JUnit5" src=".github/logo/JUnit5.svg"></code></a>
<a href="https://docs.qameta.io/allure/"><code><img width="5%" title="Allure Report" src=".github/logo/Allure_Report.svg"></code></a>
<a href="https://qameta.io/"><code><img width="5%" title="Allure TestOps" src=".github/logo/AllureTestOps.svg"></code></a>
<a href="https://github.com/"><code><img width="5%" title="Github" src=".github/logo/GitHub.svg"></code></a>
<a href="https://git-scm.com/"><code><img width="5%" title="Github" src=".github/logo/Git.svg"></code></a>
<a href="https://www.jenkins.io/"><code><img width="5%" title="Jenkins" src=".github/logo/Jenkins.svg"></code></a>
<a href="https://www.atlassian.com/ru/software/jira"><code><img width="5%" title="Jira" src=".github/logo/Jira.svg"></code></a>
<a href="https://telegram.org/"><code><img width="5%" title="Telegram" src=".github/logo/Telegram.svg"></code></a>
<a href="https://rest-assured.io/"><code><img width="5%" title="REST-Assured" src=".github/logo/rest-assured-logo.svg"></code></a>
<a href="https://www.browserstack.com/"><code><img width="5%" title="Browserstack" src=".github/logo/Browserstack.svg"></code></a>
<a href="https://appium.io/"><code><img width="5%" title="Appium" src=".github/logo/Appium.svg"></code></a>
<a href="https://developer.android.com/studio"><code><img width="5%" title="Android_Studio" src="https://upload.wikimedia.org/wikipedia/commons/9/95/Android_Studio_Icon_3.6.svg"></code></a>
</p>
 

Проект представляет собой набор автоматизированных тестов, включающих API-, Mobile- и UI-тесты. Он разделен на следующие модули:

<details>
  <summary>API-тесты:</summary>

1. **AccessToPostWithoutRegistrationApiTest** - Раздел 'Статьи'.
    - `checkAccessToPostWithoutRegistrationTest`: параметризованный тест на проверку доступа к информации о статье без регистрации.
2. **DiscussionsInfoTest** -Раздел 'Отзывы'.
    - `checkDiscussionsInfo`: получение информации об отзыве.
    - `checkDiscussionsLikes`: получение количества лайков под отзывом.
    - `checkDiscussionsComments`: получение комментария под отзывом.
    - `checkTheJsonSchemeByTheNumberOfLikesUnderAReview`: проверка json схемы по количеству лайков под отзывом. 
3. **GamesInfoTest** - Раздел 'Игры'.
    - `checkInfoGameMinesweeper`: информация по игре 'Сапер'.
    - `checkInfoGameSnake`: информация по игре 'Змейка'.
    - `checkInfoGameMoonLander`: информация по игре 'Moon Lander'.
    - `checkGettingInfoAboutGamesOnJavaRush`: получение информации по играм на JavaRush.
    - `checkTheUserActivitiesJsonSchema`: проверка json схемы игр на javaRush.
4. **GeneralInfoTest** - Раздел 'О нас'.
    - `checkGeneralInfo`: получение информации о разделе 'О нас' .
    - `checkGeneralInfoJsonSchema`: проверка json схемы в разделе 'О нас'.
5. **InfoInternshipTest** - Раздел 'Стажировка'.
    - `checkUsersInfoInternship`: получение информации по пользователю о стажировке.
    - `checkInfoForClientOrInterview`: получение информации по пользователю о собеседовании.
    - `checkTheUserActivitiesJsonSchema`: проверка json схемы информации по пользователям о собеседованиях.
6. **NewsActivitiesTest** - Раздел 'Активности'.
   - `checkReceiptOfUserActivities`: проверка получения активностей пользователя.
   - `checkRetrievingUserActivitiesThroughALoopThatIteratesThroughObjectsInAnArray`: проверка получения активностей пользователей через цикл, который перебирает объекты в массиве.
   - `checkReceivingUserActivitiesViaStream`: проверка получения активностей пользователей через stream.
   - `checkTheUserActivitiesJsonSchema`: проверка json схемы 'Активностей пользователей'.
7. **UsersInfoTest** - Раздел 'Пользователи'.
   - `checkUsersOne`: получение информации по пользователю.
   - `checkUsersTwo`: получение информации по пользователю.
   - `checkUsersTwo`: получение информации по пользователю.
   - `checkUsersFour`: получение информации из списка всех пользователей.
   - `checkAllUsersJsonSchema`: проверка json схемы всех пользователей.
</details>

<details>
  <summary>Mobile-тесты:</summary>

1. **AuthorizationInTheApplicationTest** - Авторизация в приложении.
   - `authorizationInTheApplication`: авторизация по логину и паролю.
2. **CommentsSectionTest** - Блок Комментариев.
   - `addCommentUnderAnArticle`: добавление комментария под статьёй.
   - `checkCommentBlocks`: проверка блоков комментариев.
3. **CreatingACourseMobileTest** - Создание персонального курса.
   - `creatProgrammingCourseWithoutTakingQuestions`: создание курса БЕЗ прохождения опроса.
   - `creatProgrammingCourseByPassingTheQuestions`: создание курса ПРИ прохождении опроса.
4. **LikesUnderTheArticleTest** - Функциональность Лайков.
   - `addLikeUnderTheArticle`: Добавление лайка.
5. **SectionsInTheApplicationMobileTest** - Разделы в приложении.
   - `openSectionsInTheApplication`: проверка разделов приложения.
</details>

<details>
  <summary>UI-тесты:</summary>

1. **AvatarUploadPageTest** - Загрузка аватара.
   - `uploadingAnAvatarToYourProfilePhoto`: Загрузка аватара в фото профиля.
2. **CreatingACourseTest** - Создание персонального курса.
    - `createdProgrammingCourseWithoutTakingQuestions`: получение курса программирования БЕЗ прохождения вопросов.
    - `createdProgrammingCourseByPassingTheQuestions`: получение курса программирования ПРИ прохождения вопросов.
3. **FunctionalityOfTheStartTrainingTest** - Кнопка 'Начать обучение' в 2-х варинтах.
    - `functionalityOfTheStartTrainingButtonsInTheMenuAtTheEndOfThePage`: кнопка 'Начать обучение' в меню/в конце страницы.
4.  **IntegrationSocialNetworkTest**  - Интеграция c соцсетями.
    - `integrationTelegram`: интеграция с Телеграмм.
    - `integrationYouTube`: интеграция с YouTube.
5.  **SearchOnSectionsTest** - Поиск в разделах в приложения.
    - `searchOnAllSections`: поиск 'Тестирования' на всех разделах.
    - `searchInTheGeneralSection`: поиск 'Тестирования' в общей вкладке.
6.  **SectionsInTheApplicationTest** - Разделы в приложении.
   - `openingSectionsInTheApplication`: проверка открытия разделов.
</details>

### Локальный запуск

Для локального запуска тестов используйте команду:

```bash
./gradlew clean test
```

### Удаленный запуск

Удаленный запуск тестов с параметрами:

```bash
clean
${TASK}
-DisRemote=true
-DbaseUrl=${BASE_URL}
-DbrowserSize=${BROWSER_SIZE}
-Dbrowser=${BROWSER}
-Dselenoid=https://user1:1234@selenoid.autotests.cloud/wd/hub
-DbrowserVersion=${BROWSER_VERSION}
```

### Запуск с Jenkins
Если вы используете Jenkins для запуска тестов, вы можете использовать параметризованную сборку с следующими
параметрами:

TASK (с какими тегами запускать тесты)
- `BROWSER` - браузер, по умолчанию chrome.
- `BROWSER_VERSION` - версия браузера, по умолчанию 100.0.
- `BROWSER_SIZE` - разрешение экрана (например, "1920x1080").
- `BASE_URL` - какой адрес открывать для запуска тестов.
- `REMOTE_URL` - где запускать тесты

### Файл test.properties

Для запуска тестов локально на вашем компьютере, вам необходимо добавить файл test.properties в папку ресурсов (test/src/resources/config/). В этом файле необходимо указать следующие свойства:

```bash 
login.JavaRush=логин в приложении
password.JavaRush=пароль в приложении
browserVersion=версию браузера
browserSize=размер браузера
baseUrl=адрес продукта
videoUrl=адрес удалённого запуска
deviceName=модель андройда
platformName=тип устройства
osVersion=версия андройда
url=адрес локального сервера
appPackage=appPackage мобильного приложения
appActivity=appActivity мобильного приложения
username.Browserstack=username
passwordKey.Browserstack=passwordKey
remoteMobileUrl.Browserstack=адрес удалённого запуска
app.Browserstack=app
```

### Ссылки и визуализация

Ниже представлены скриншоты основных инструментов и процессов, используемых в ходе разработки и тестирования проекта. Вы
можете развернуть каждый раздел, чтобы увидеть подробности.

<details>
  <summary>IntelliJ IDEA</summary>

![Image1](.github/sc/idea.png)
</details>

<details>
  <summary>Jenkins</summary>

[Перейти к сборке в Jenkins](https://jenkins.autotests.cloud/job/JavaRushUiApiMobile/)

![Image2](.github/sc/jenkins1.png)
![Image3](.github/sc/jenkins2.png)
</details>

<details>
  <summary>AllureReport</summary>

[Перейти к отчету в AllureReport](https://jenkins.autotests.cloud/job/JavaRushUiApiMobile/121/allure/#)

![Image4](.github/sc/allureReport1.png)
![Image5](.github/sc/allureReport2.png)
</details>

<details>
  <summary>AllureTestOps</summary>

[Перейти к отчету AllureTestOps](https://allure.autotests.cloud/launch/30359/tree/484618?treeId=7152)

![Image6](.github/sc/allureTestOps1.png)
![Image7](.github/sc/allureTestOps2.png)
![Image7](.github/sc/allureTestOps3.png)
![Image7](.github/sc/allureTestOps4.png)
</details>

<details>
  <summary>Уведомление Telegram</summary>

![Image9](.github/sc/telegram.png)
</details>

<details>
  <summary>Демонстрационное видео запуска UI тестов</summary>

[Скачать демонстрационное видео](.github/video/UItest.mp4)

[//]: # (https://github.com/KatasonovaMasa/JavaRush_Ui_Mobile_Api/assets/44576709/e1444df1-626a-484b-ad9f-640178605703)
<p align="center">
<img title="Selenoid Video" src=".github/video/UItest.gif" width="550" height="350"  alt="video">   
</p>
</details>

<details>
  <summary>Демонстрационное видео запуска мобильных тестов</summary>

[Скачать демонстрационное видео](.github/video/MobileTest.mp4)

[//]: # (https://github.com/KatasonovaMasa/JavaRush_Ui_Mobile_Api/assets/44576709/2c50350f-dd8a-43bf-b7b5-8ab9992afac6)
<p align="center">
<img title="Browserstack Video" src=".github/video/MobileTest.gif" width="450" height="500"  alt="video">   
</p>

</details>




### Контакты

   Кликни на изображение

[<img alt="GIPHY" align="center" src=".github/logo/telegram1.png">](https://t.me/QA_marykat)
