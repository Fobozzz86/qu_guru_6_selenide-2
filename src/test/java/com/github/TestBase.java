package com.github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
      //  Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
      // Configuration.browser = "Edge";
      //  Configuration.browserSize = "700x800";

      //  Configuration.timeout = 30000;
      //  Configuration.pageLoadTimeout = 45000; // таймаут на загрузку страници
    }
}
