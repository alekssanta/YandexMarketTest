package ru;

import cucumber.api.java.ru.И;
import org.junit.Test;
import ru.page.MainPage;

public class YandexTest extends BaseTest{

    private final static String BASE_URL = "https://market.yandex.ru/";
    private final static String SEARCH_TEXT = "Macbook Pro M1";


    @Test
    @И("^ открываем браузер и заходим$")
            public void checkHref() {
        MainPage mainPage = new MainPage(BASE_URL);
//mainPage.openWebSite(BASE_URL);
    }
}
