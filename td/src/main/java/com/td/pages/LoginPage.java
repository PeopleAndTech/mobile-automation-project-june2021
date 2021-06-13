package com.td.pages;

import com.core.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Go Back\"]")
    private WebElement backBtn;

    public void cliuckOnBackButton() {
        backBtn.click();
        ExtentTestManager.log("Back button clicked", LOGGER);
    }
}
