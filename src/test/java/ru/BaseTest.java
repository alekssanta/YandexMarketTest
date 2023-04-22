package ru;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.ru.И;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    @И("запускаю браузер")
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "2560x1600";
        Configuration.headless = false;
    }

@Before
    public void init(){
        setUp();
}

@After
    public void tearDown(){
    Selenide.closeWebDriver();
}
}
