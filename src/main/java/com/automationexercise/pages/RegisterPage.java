package com.automationexercise.pages;

import com.automationexercise.base.BasePage;
import com.automationexercise.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    ElementUtil elementUtil;
    public RegisterPage(WebDriver driver){
        super(driver);
        elementUtil = new ElementUtil(driver);
    }

    private By enterInfoTxt = By.xpath("//b[normalize-space()='Enter Account Information']");
    private By mrTitleRadio = By.cssSelector("input[id='id_gender1']");
    private By mrsTitleRadio = By.cssSelector("input[id='id_gender2']");
    private By pwdTxtBox = By.cssSelector("input[id='password']");
    private By newsLtrChkbox = By.cssSelector("input[id='newsletter']");
    private By offersChkbox = By.cssSelector("input[id='optin']");
    private By firstNameTxtBx = By.cssSelector("input[id='first_name']");
    private By lastNameTxtBx = By.cssSelector("input[id='last_name']");
    private By address1 = By.cssSelector("input[data-qa='address']");
    private By countryDrpDwn = By.cssSelector("select[id='country']");
    private By stateTxtBx = By.cssSelector("input[id='state']");
    private By cityTxtBx = By.cssSelector("input[id='city']");
    private By zipcdeTxtBx = By.cssSelector("input[id='zipcode']");
    private By mobileNumber = By.cssSelector("input[id='mobile_number']");
    private By crtAccBtn = By.cssSelector("button[data-qa='create-account']");
    private By accntSuccessTxt = By.cssSelector("h2[data-qa='account-created']");
    private By continueBtnOnRegisterPage = By.cssSelector("a[data-qa='continue-button']");



    public String getRegisterPageTitle(){
        return elementUtil.getPageTitle();
    }
    //Sign up account information page
    public boolean isEnterInfoTxtPresent(){
        return elementUtil.isElementDisplayed(enterInfoTxt);
    }
    public void selectMrTitleOption(){
        elementUtil.doClick(mrTitleRadio);
    }
    public void selectMrsTitleOption(){
        elementUtil.doClick(mrsTitleRadio);
    }
    public void enterPasswordText(String value){
        elementUtil.enterText(pwdTxtBox,value);
    }
    public void selectNewsLetterCheckBox(){
        elementUtil.toggleCheckbox(newsLtrChkbox);
    }
    public void selectOffersCheckBox(){
        elementUtil.toggleCheckbox(offersChkbox);
    }
    public void enterFirstLastName(String firstName, String lastName){
        elementUtil.enterText(firstNameTxtBx,firstName);
        elementUtil.enterText(lastNameTxtBx,lastName);
    }
    public void enterAddress1(String address){
        elementUtil.enterText(address1,address);
    }
    public void selectCountry(String countryName){
        elementUtil.selectItemFromDropDownMenu(countryDrpDwn,countryName);
    }
    public void enterState(String stateName){
        elementUtil.enterText(stateTxtBx,stateName);
    }
    public void enterCityName(String cityName){
        elementUtil.enterText(cityTxtBx,cityName);
    }
    public void enterZipCode(String zipcode){
        elementUtil.enterText(zipcdeTxtBx,zipcode);
    }
    public void enterMobileNumber(String mobile_number){
        elementUtil.enterText(mobileNumber,mobile_number);
    }
    public void clickCreateAccountBtn(){
        elementUtil.doClick(crtAccBtn);
    }
    public String accountSuccessTxt(){
        return elementUtil.getElementText(accntSuccessTxt);
    }
    public void clickOnContinueBtn(){
        elementUtil.doClick(continueBtnOnRegisterPage);
    }


}
