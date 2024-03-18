package stepPages;


import wildberriesSearch.Base;

import java.io.File;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class UploadPhotoSteps extends Base {

    public void openMainPage() {
        step("Открыть главную страницу.", () ->
        {
            open(baseUrl);

        });
    }
    public void photoSearch() {
        step("Кликнуть на иконку 'Поиск по фото'.", () ->
        {
            $(".search-catalog__btn--photo").click();

        });
    }

    public void uploadPhotoInSearch() {
        step("Загрузить фото.", () ->
        {
            $(".search-catalog__btn--photo input").uploadFile(new File("/home/user/IdeaProjects/ru.ozon/src/test/resources/beagle-dog-standing-on-grass-9xzx8rwvo3gl57xd.jpg"));

        });
    }

    public void shouldHaveSearchResult() {
        step("Проверить, что на странице поиска правильно отображаются результаты.", () ->
        {
            $("#c183876708 .product-card__name").shouldHave(text("/ Мягкая игрушка реалистичная собака Бигль подарок детям"));
        });
    }
    //17700488


}
