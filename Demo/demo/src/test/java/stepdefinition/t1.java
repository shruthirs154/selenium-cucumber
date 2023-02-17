package stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class t1 {

	WebDriver driver;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("browser is open");
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		System.out.println("user is on google search page");
		driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
		Thread.sleep(3000);

	}

	@When("user should click on make appointment button")
	public void user_should_click_on_make_appointment_button() {
		System.out.println("user should click on make appointment button");
		driver.findElement(By.id("btn-make-appointment")).click();

	}

	@And("user is navigated to the login page")
	public void user_is_navigated_to_the_login_page() {
		System.out.println("user is navigated to the login page");
	}

	@And("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username,String password) throws Throwable {
		System.out.println("user enters username and password");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(3000);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks on login button");
		driver.findElement(By.id("btn-login")).click();
	}


	@Given("user has to book an appointement")
	public void user_has_to_book_an_appointement() {
		System.out.println("user has to book an appointement");
	}

	@When("user should enter all the valid credentials")
	public void user_should_enter_all_the_valid_credentials() throws Throwable {
		System.out.println("user should enter all the valid credentials");
		driver.findElement(By.name("facility")).sendKeys("Hongkong CURA Healthcare Center");
		
		driver.findElement(By.name("hospital_readmission")).click();
	
		driver.findElement(By.id("radio_program_medicaid")).click();
	
		driver.findElement(By.id("txt_visit_date")).sendKeys("222023");
		
		driver.findElement(By.id("txt_comment")).sendKeys("testing");
		Thread.sleep(3000);
	

	}


	@And("click on book appointment button")
	public void click_on_book_appointment_button() {
		System.out.println("click on book appointment button"); 
		driver.findElement(By.id("btn-book-appointment")).click();	 
	}

	@Then("user is navigated to result page")
	public void user_is_navigated_to_result_page() {
		System.out.println("user is navigated to result page");
	}

}
