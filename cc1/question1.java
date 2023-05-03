package cc1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question1 {
  @Test
  public void cc1() throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origin=*");
			WebDriver driver=new ChromeDriver(co);
			driver.get("https://www.saucedemo.com/");
			WebElement user=driver.findElement(By.id("user-name"));
			user.sendKeys("standard_user");
			WebElement pass=driver.findElement(By.id("password"));
			pass.sendKeys("secret_sauce");
			WebElement login=driver.findElement(By.id("login-button"));
			login.click();
			WebElement add=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
			add.click();
			WebElement cartno=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
			Assert.assertTrue(cartno.isDisplayed());
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
			cart.click();
			WebElement checkout=driver.findElement(By.id("checkout"));
			checkout.click();
			String url1=driver.getCurrentUrl();
			String expurl1="https://www.saucedemo.com/checkout-step-one.html";
			Assert.assertEquals(url1,expurl1);
			WebElement first=driver.findElement(By.id("first-name"));
			first.sendKeys("Gowtham");
			WebElement last=driver.findElement(By.id("last-name"));
			last.sendKeys("G");
			WebElement zip=driver.findElement(By.id("postal-code"));
			zip.sendKeys("641004");
			WebElement sub=driver.findElement(By.id("continue"));
			sub.click();
			Thread.sleep(3000);
			List<WebElement> l1=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
			for(WebElement link:l1) {
				System.out.println(link.getText());
			}
			List<WebElement> l2=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
			for(WebElement link:l2) {
				System.out.println(link.getText());
			}
			String title=driver.getTitle();
			String exptit="Swag Labs";
			String url=driver.getCurrentUrl();
			String expurl="https://www.saucedemo.com/checkout-step-two.html";
			Assert.assertEquals(title,exptit);
			Assert.assertEquals(url,expurl);
			
			
		
  }
}
