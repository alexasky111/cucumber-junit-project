package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class CrmPage {

    public CrmPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    public void loginNextBase(String username, String password){

        usernameInput.sendKeys(ConfigurationReader.getProperty(username));
        passwordInput.sendKeys(ConfigurationReader.getProperty(password));
        loginButton.click();
    }
}
