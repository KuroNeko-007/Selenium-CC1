package cc1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments ("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup ();
		WebDriver driver=new ChromeDriver(co);
		driver.get ("https://www.saucedemo.com/");
		driver.manage().window().maximize() ;
		WebElement username=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		username.sendKeys("standard_user");
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		System.out.println("A-Z:");
		System.out.println("----------------------------------------------");
		String t1=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		System.out.println("1  :  "+t1);
		System.out.println();
		System.out.println("Z-A:");
		System.out.println("----------------------------------------------");
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
		String t2=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
		System.out.println("2  :  "+t2);
		System.out.println();
		System.out.println("Low to high:");
		System.out.println("----------------------------------------------");
		System.out.println();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
		String t3=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div")).getText();
		System.out.println("3  :  "+t3);
		System.out.println();
		System.out.println("1st Product price and product :");
		System.out.println("----------------------------------------------");

		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
		String t4=driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
		System.out.println("4  :  "+t4);
		String t41=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
		System.out.println("5  :  "+t41);
		

		
	}

}