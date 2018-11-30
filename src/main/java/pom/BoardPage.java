package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BoardPage {
    @FindBy(how = How.XPATH, using = "");
    private WebElement boardName;

    @FindBy(how = how.XPATH, using = "");
    private WebElement toDoList;

    @FindBy(how = how.XPATH, using = "");
    private WebElement inProgressList;

    @FindBy(how = how.XPATH, using = "");
    private WebElement doneList;

    @FindBy(how = how.XPATH, using = "");
    private WebElement inputCardName;

    @FindBy(how = how.XPATH, using = "");
    private WebElement addCardButton;

    @FindBy(how = how.XPATH, using = "");
    private WebElement saveCommentButton;

    @FindBy(how = how.XPATH, using = "");
    private WebElement elementToDo;

    //compartilhar e mais

}
