package com.td.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    private WebElement accounts;

    @FindBy(xpath = "//android.widget.Button[@text='TRANSFER']")
    private WebElement transfer;

    @FindBy(xpath = "//android.widget.Button[@text='DEPOSIT']")
    private WebElement deposit;

    @FindBy(xpath = "//android.widget.Button[@text='SEND MONEY']")
    private WebElement sendMoney;

    @FindBy(xpath = "//android.widget.Button[@text='PAY A BILL']")
    private WebElement payABill;

    public void validateAndClickOnAccountButton() {
        Assert.assertTrue(accounts.isDisplayed());
        accounts.click();
    }

    public void validateAndClickOnTransferButton() {
        Assert.assertTrue(transfer.isDisplayed());
        transfer.click();
    }

    public void validateAndClickOnDepositButton() {
        Assert.assertTrue(deposit.isDisplayed());
        deposit.click();
    }

    public void validateAndClickOnSendMoneyButton() {
        Assert.assertTrue(sendMoney.isDisplayed());
        sendMoney.click();
    }


    public void validateAndClickOnPayABillButton() {
        Assert.assertTrue(payABill.isDisplayed());
        payABill.click();
    }


}
