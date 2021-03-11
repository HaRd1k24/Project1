package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private SelenideElement clickNextPage = $x("//a[@title=\"Women\"]");
    private SelenideElement confirmation = $x("//h2[@class=\"title_block\"]");

    public void clickButton(){
        clickNextPage.click();
    }

    public void search(String name){
        confirmation.shouldHave(Condition.text(name));

    }
}
