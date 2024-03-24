package com.techlistic.tests;

import com.techlistic.pages.FormPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormTest {
    @Test
    public void homeTechlisticPage(){
        WebDriver driver = new ChromeDriver();

        FormPage formPage = new FormPage(driver);
        formPage.accessPage();
        String navBarTitle = formPage.getNavTitle();
        Assertions.assertEquals(navBarTitle, "Techlistic");
        formPage.fillName();
        formPage.fillLastName();
        formPage.fillDate();
        formPage.clickProfession();
        formPage.clickTools();
        formPage.clickContinents();
        formPage.clickSeleniumCommands();
        String buttonText = formPage.clickButton();
        System.out.println(buttonText);
        driver.quit();
    }
}
