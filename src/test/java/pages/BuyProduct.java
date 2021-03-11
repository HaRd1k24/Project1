package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BuyProduct {
    private SelenideElement searchClothes = $x("//input[@id=\"search_query_top\"]");
    private SelenideElement Blouse = $x("//img[@title=\"Blouse\"]");
    private SelenideElement result = $(byText("1 result has been found."));

    public void findClothes(String text){
        searchClothes.setValue(text).pressEnter();
    }

    public void findBlouse(Condition a ){
        Blouse.shouldBe(a);
    }

    public void searchResult(Condition b){
        result.should(b);
    }
}
