package wildberriesSearch;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Configuration.baseUrl;

public class Base {

    @BeforeAll
    public static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        baseUrl = "https://www.wildberries.ru/";


    }
    @BeforeEach
    public void beforeEach(){
        Configuration.browserSize = "1920x1080";
        baseUrl = "https://www.wildberries.ru/";
        SelenideLogger.addListener("allure", new AllureSelenide());

    }
}
