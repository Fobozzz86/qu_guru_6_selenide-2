package com.github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import selenide.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckSolutionsWithHover extends TestBase {

    /* 1. На главной странице GitHub выберите меню Solutions -> Enterprize с помощью команды hover для Solutions.
     Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the best."
     */
    @Test
        void hoverSolutionsTest() {
            open("https://github.com/");
            $(byTagAndText("button", "Solutions")).hover();
            $(byTagAndText("a", "Enterprise")).click();
    //        $(withText("Build like the best")).shouldBe(visible); // элемент с текстом "Build like the best" видимый
            $(".application-main").shouldHave(text("Build like the best"));




}




}
