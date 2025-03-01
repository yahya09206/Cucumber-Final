package com.yahya.pages;

import com.yahya.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WOrderPage {

    @FindBy(xpath = "//h2[normalize-space(.)='Order']")
    public WebElement header;
    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productDropdown;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantityBox;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtUnitPrice")
    public WebElement priceBox;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtDiscount")
    public WebElement discountBox;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtTotal")
    public WebElement totalBox;
    @FindBy(css = "input[type='submit'][value='Calculate']")
    public WebElement calculateButton;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerNameBox;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetBox;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityBox;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateBox;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipBox;
    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList")
    public WebElement cardRadio;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDate;
    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;
    @FindBy(xpath = "//strong[normalize-space(.)='New order has been successfully added.']")
    public WebElement successMsg;

    public WOrderPage(){
        PageFactory.initElements(Driver.getDriver(), this
        );
    }

    public List<String> getAllProductOptionsFromList(){

        Select prodObj = new Select(productDropdown);

        // getOptions method from select class is used
        // to return all dropdown options as List of WebElements
        List<WebElement> allProductOptions = prodObj.getOptions();
        // this is the list to store actual options, so we can compare with expected
        List<String> actualOptions = new ArrayList<>();

        for (WebElement eachOption : allProductOptions) {
            System.out.println("eachOption.getText() = " + eachOption.getText());
            actualOptions.add(eachOption.getText());
        }
        return actualOptions;
    }

}
