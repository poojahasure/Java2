package gettingStarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class RegisterNewUser {

	public static void main(String[] args) {
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://freelance-learn-automation.vercel.app/login");
		page.getByText("New user? Signup").click();
		
		PlaywrightAssertions.assertThat(page.locator("xpath=//button[@class='submit-btn']")).isDisabled();
		page.locator("#name").fill("Ekveera");
//		page.locator("#name").fill(new Faker().name().fullName());
		page.getByPlaceholder("Email").fill("veera_"+System.currentTimeMillis()+"@gmail.com");
//  		page.locator("#name").fill(new Faker().name().fullName()+"_"+new Faker().name().fullName()+"@gmail.com");
	
		page.getByPlaceholder("Password").fill("veera@123");
		page.locator("xpath=//label[text()='Selenium']//preceding::input[1]").click();
//		page.getByText("Selenium").click();
		PlaywrightAssertions.assertThat(page.locator("xpath=//label[text()='Selenium']//preceding::input[1]")).isChecked();
		page.locator("xpath=//input[@value='Female']").click();
		
		PlaywrightAssertions.assertThat(page.locator("xpath=//input[@value='Female']")).isChecked();
//		dropdown- select tag -single select
		page.locator("#state").selectOption("Goa");
		
//		dropdown - select tag -multi select		
		String hobbies[]= {"Playing","Swimming"};
		page.locator("#hobbies").selectOption(hobbies);

		PlaywrightAssertions.assertThat(page.locator(".submit-btn")).isEnabled(); 
		page.pause();
		page.locator(".submit-btn").click();
		page.waitForTimeout(5000);
		
		page.close();
		browser.close();
	}

}
