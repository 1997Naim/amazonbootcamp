package projectd.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonhomepage {
public WebDriver driver;
@FindBy(xpath = "//*[@id='twotabsearchtextbox']")WebElement searchfield;
@FindBy(xpath = "//*[@id='nav-search-submit-text'and@aria-label='Go']")WebElement searchbutton;
public amazonhomepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void sendsearchfield() {
	searchfield.sendKeys("laptop");
}
public void clicksearchbutton() {
	searchbutton.click();
}
}
