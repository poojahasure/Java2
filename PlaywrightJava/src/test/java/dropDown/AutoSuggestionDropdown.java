package dropDown;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class AutoSuggestionDropdown {

	public static void main(String[] args) {
		Browser browser= Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://www.google.com/");
		page.locator(".truncate").fill("mukesh otwani ");
		

	}

}
