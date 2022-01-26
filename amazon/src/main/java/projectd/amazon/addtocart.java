package projectd.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocart {
	public WebDriver driver;
	@FindBy(xpath = "(//*[@id='addToCart_feature_div'and@class='celwidget'][1])")WebElement addtocartlaptop;
	@FindBy(xpath = "//*[@id='attachSiNoCoverage']")WebElement nothanks;
	public addtocart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void clickaddcart() {
addtocartlaptop.click();
}
public void clicknothanks() {
	nothanks.click();
}
}
