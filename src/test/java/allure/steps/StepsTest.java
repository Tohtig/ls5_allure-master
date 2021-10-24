package allure.steps;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class StepsTest {
    private final static String REPOSITORY = "Tohtig/qa_5_2_home";
    private WebSteps step = new WebSteps();

    @Test
    @Owner("aippolitov")
    @Feature("Main menu")
    @Story("Menu Issue")
    @DisplayName("Selenide test. Check menu 'Issue' in repository")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "BaseURL", url = "https://github.com")
    void searchIssue() {
        step.openMainPage();
        step.searchForRepository(REPOSITORY);
        step.goToRepository(REPOSITORY);
        step.clickOnIssueTab();
        step.shouldSeeWelcomeText();
    }

}
