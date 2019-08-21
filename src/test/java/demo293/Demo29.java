package demo293;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Demo29 {
	WebDriver driver;
	@Given("TestMe is up and running")
	public void testme_is_up_and_running() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\OneDrive_2019-08-12\\SeleniumBroDrivers\\chromedriver.exe\\");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");

	}

	@Then("refistered user enter the valid cred")
	public void refistered_user_enter_the_valid_cred() {
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By .name("userName")).sendKeys("christ");
		driver.findElement(By .name("password")).sendKeys("Christ123");
		driver.findElement(By .name("Login")).click();

	}

	@Then("verifies for the login status for his cred")
	public void verifies_for_the_login_status_for_his_cred() {
		String actual= driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
	    String expected="SignOut";
	    Assert.assertEquals(actual, expected);
}

}
