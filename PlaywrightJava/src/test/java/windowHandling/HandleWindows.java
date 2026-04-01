package windowHandling;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleWindows {

	public static void main(String[] args) {
		Browser browser= Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext context=browser.newContext();
		Page page=context.newPage();
		
		page.navigate("https://freelance-learn-automation.vercel.app/login");
		
		Page newPage=context.waitForPage(() ->
		{
			page.locator("//a[contains(@href,'facebook')]").first().click();
		}
		);
		
		newPage.locator("//input[@name='email']").last().fill("mukesh@gmail.com");
		
		page.bringToFront();
		newPage.close();
		page.close();
		
		context.close();
		browser.close();
		

	}

}
