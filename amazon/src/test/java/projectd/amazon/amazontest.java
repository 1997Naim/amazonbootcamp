package projectd.amazon;

import org.testng.annotations.Test;

import common.Utility;

public class amazontest extends Utility{
	
  @Test
  public void f() throws InterruptedException {
	  amazonhomepage ahp=new amazonhomepage(driver);
	  ahp.sendsearchfield();Thread.sleep(2000);
	  ahp.clicksearchbutton();Thread.sleep(2000);
	  searchpage sp=new searchpage(driver);
	  sp.clicklaptop();Thread.sleep(2000);
	  addtocart ac=new addtocart(driver);
	  ac.clickaddcart();Thread.sleep(2000);
	  ac.clicknothanks();
  }











  /*@BeforeMethod
  public void beforeMethod() throws InterruptedException {
 	  String local=System.getProperty("user.dir");
 	  System.setProperty("webdriver.chrome.driver", local+"\\src\\driver\\chromedriver.exe");
 		 driver=new ChromeDriver();
 		 driver.navigate().to("https://www.amazon.com/");
 		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 		 driver.manage().window().maximize();
 		driver.manage().deleteAllCookies();
 		Thread.sleep(5000);
  }

  @AfterMethod
  public void afterMethod() {


  }*/














}
