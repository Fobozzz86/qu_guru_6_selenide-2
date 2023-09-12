package com.github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import selenide.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProgrammDragAndDrop extends TestBase {

    private final String URL = "https://the-internet.herokuapp.com/drag_and_drop";
    private SelenideElement columnA = $(Selectors.byId("column-a"));
    private SelenideElement columnB = $(Selectors.byId("column-b"));
    private SelenideElement headerA = $(Selectors.byTagAndText("header", "A"));
    private SelenideElement headerB = $(Selectors.byTagAndText("header", "B"));


    @Test
    void CheckDragAndDrop() {  // самый простой тест
        open("https://the-internet.herokuapp.com/drag_and_drop");
 //       $("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }

    @Test
    public void dragDropTest() { // более замороченный тест, но интересный
        open(URL);
        columnB.shouldHave(Condition.text(headerB.getText()));
        columnA.dragAndDropTo(columnB);
        columnB.shouldHave(Condition.text(headerA.getText()));

    }
}
