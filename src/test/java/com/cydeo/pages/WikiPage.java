package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage {

    public WikiPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".sprite.svg-search-icon")
    public WebElement searchBtn;

    @FindBy(id = "searchInput")
    public WebElement searchBox;

    @FindBy(id = "firstHeading")
    public WebElement firstHeader;

    @FindBy (css = ".fn")
    public WebElement imageHeader;

}
