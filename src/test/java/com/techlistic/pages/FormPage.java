package com.techlistic.pages;

import com.techlistic.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class FormPage extends BasePage {

    @FindBy(xpath = "/html/body/div[1]/div[3]/div/header/div/div[2]/div[1]/a/div")
    private WebElement titleText;
    @FindBy(name = "firstname")
    private WebElement firstName;
    @FindBy(name = "lastname")
    private WebElement lastName;
    @FindBy(id = "datepicker")
    private WebElement dateTime;
    @FindBy(id = "profession-1")
    private WebElement professionSelection;
    @FindBy(id = "tool-2")
    private WebElement toolSelection;
    @FindBy(id = "continents")
    private WebElement continentsSelection;
    @FindBy(id = "selenium_commands")
    private WebElement seleniumCommands;
    @FindBy(css = "button.btn-info#submit")
    private WebElement button;
    public FormPage(WebDriver browser) {
        super(browser);
    }
    private Actions getActions() {
        return new Actions(browser);
    }
    public void accessPage(){
        String URL = "https://www.techlistic.com/p/selenium-practice-form.html";
        browser.get(URL);
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        browser.manage().window().maximize();
    }
    public String getNavTitle(){
        return titleText.getText();
    }
    public void fillName(){
        String nameField = "name";
        firstName.sendKeys(nameField);
    }
    public void fillLastName(){
        String lastNameField = "lastname";
        lastName.sendKeys(lastNameField);
    }
    public void fillDate(){
        String date = "22/04/2000";
        dateTime.sendKeys(date);
    }
    public void clickProfession(){
        professionSelection.click();
    }
    public void clickTools(){
        toolSelection.click();
    }
    public void clickContinents(){
        continentsSelection.click();
        continentsSelection.sendKeys("Sout");
        getActions().sendKeys(Keys.ENTER).perform();
    }
    public void clickSeleniumCommands(){
        seleniumCommands.click();
        seleniumCommands.sendKeys("Swit");
        getActions().sendKeys(Keys.ENTER).perform();
    }
    public String clickButton(){
        return button.getText();
    }
}
