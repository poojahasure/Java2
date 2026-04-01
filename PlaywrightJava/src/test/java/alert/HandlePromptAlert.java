package alert;

import org.testng.Assert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandlePromptAlert {

	public static void main(String[] args) {
		Browser browser= Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
		page.onDialog(dialog -> {
			String msg=dialog.message();
			System.out.println("dialog message is : " + msg);
			Assert.assertTrue(msg.contains(msg));
			dialog.accept("Pooja Hasure");
		
		});

		page.locator("xpath=//button[normalize-space()='Click for JS Prompt']").click();

	}

}
