package com.test;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class SelenideFilesTest {
    @Test
    void DownloadTest() {
        try {
            File downoloadFile = Selenide.$("#raw-url").download();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
