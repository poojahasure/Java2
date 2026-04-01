package screenShot;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import utility.Utility;

public class ScreenShot {

	public static void main(String[] args) {
		 Browser browser=     Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
	      
	      Page page=browser.newPage();
	      page.navigate("https://www.naukri.com/mnjuser/recommendedjobs");
//	     byte[] arr= page.screenshot();
//	      Screenshot of the element
	      page.locator("//a[@title='Jobseeker Register']").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("Element.png")));

	      
//	      Screenshot of full page
//	     page.screenshot(new Page.ScreenshotOptions().setFullPage(true).setPath(Paths.get("Screenshot2.png")));
	      Utility.captureScreenshot(page);
//	     page.close();
//	     browser.close();

	}

}
