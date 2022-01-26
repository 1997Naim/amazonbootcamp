package projectd.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchpage {
	public WebDriver driver;
	@FindBy(xpath = "(//*[@class='a-size-medium a-color-base a-text-normal'][1])")WebElement selectlaptop;
public searchpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void clicklaptop() {
	selectlaptop.click();
}
}
