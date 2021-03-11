package womanTestMagaz;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import pages.BuyProduct;
import pages.MainPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class womanFirst  {

    private final MainPage mainPage = new MainPage();
    private final BuyProduct buyProduct = new BuyProduct();


    @BeforeEach
    public void setup(){
        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        open("http://automationpractice.com/");

    }
    @Test
    public void checkWomanPage(){
        final String women  = "WOMEN";
        mainPage.clickButton();
        mainPage.search(women);

    }
    @Test
    public void searchProduct() {
        String clothes = "Blouse";
        Condition a = visible;
        Condition b = exist;
        buyProduct.findClothes(clothes);
        buyProduct.findBlouse(a);
        buyProduct.searchResult(b);
    }
}

