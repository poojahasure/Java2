package shadowDOM;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleShadowDom {

	public static void main(String[] args) {
		 Browser browser=     Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
	      
	      Page page=browser.newPage();
	      page.navigate("https://selectorshub.com/xpath-practice-page/");
	      
//	      xpath is not allowed
	      Locator shadowRoot=page.locator("div#userName");
	      Locator element =shadowRoot.locator("#kils");
	      element.fill("Pooja");

	}

}
