package org.Cucumberfile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPojo extends BaseClass {

	public GmailLoginPojo() {
		 PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@type = 'email']")
	private WebElement EmailorPhoneNo;
	
	@FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button/span")
	private WebElement NextButton;
	
	@FindBy(xpath = "//input[@type = 'password']")
	private WebElement Password;

	
	
	public WebElement getEmailorPhoneNo() {
		return EmailorPhoneNo;
	}

	public void setEmailorPhoneNo(WebElement emailorPhoneNo) {
		EmailorPhoneNo = emailorPhoneNo;
	}

	public WebElement getNextButton() {
		return NextButton;
	}

	public void setNextButton(WebElement nextButton) {
		NextButton = nextButton;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}
	
}
