package gettingStarted;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

import java.util.regex.Pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
public class LoginLogout {

	public static void main(String[] args) {
		Browser browser = null;
		Page page=null;
		try {
//		 browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//		 browser=Playwright.create().webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
			 browser=Playwright.create().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		 page =browser.newPage();
		page.navigate("https://freelance-learn-automation.vercel.app/login");
//		String title=page.title();
		PlaywrightAssertions.assertThat(page).hasTitle("Learn Automation Courses");
//		id locator-  id=email1
//		page.locator("#email1").fill("admin@email.com");
//		xpath locator -name=email1
//		page.locator("xpath=//input[@name='email1']").fill("admin@email.com");
//		css locator - name=email1
//		page.locator("css=input[name='email1']").fill("admin@email.com");
//		for debugging timeout is used
		
		page.getByPlaceholder("Enter Email").fill("poojahasure291@gmail.com");
		page.getByPlaceholder("Enter Password").fill("pooja123");
//		page.getByText("Sign in").click();
		page.getByText("Sign in").nth(1).click();
//		page.getByText("Sign in").last().click();
//		page.locator("xpath=//button[@class='submit-btn']").click();
		
//		Handling disappearing elements
		PlaywrightAssertions.assertThat(page.locator(".welcomeMessage")).containsText("Welcome");
		
//		click on logout
		page.getByAltText("menu").click();
		
		page.getByText("Sign out").click();
		PlaywrightAssertions.assertThat(page).hasURL(Pattern.compile("login"));
		page.waitForTimeout(3000);
		}
		finally {
        page.close();
        browser.close();
		}
	}

}
