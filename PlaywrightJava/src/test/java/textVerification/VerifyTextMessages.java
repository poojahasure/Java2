package textVerification;

import java.util.regex.Pattern;

import org.testng.Assert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class VerifyTextMessages {
	public static void main(String [] args) {
		
	Browser browser= Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	Page page=browser.newPage();
	page.navigate("https://freelance-learn-automation.vercel.app/login");
	page.locator(".submit-btn").click();
	String expected="Email and Password is required";
//	String actualText=page.locator(".errorMessage").innerText();
	String actualText=page.locator(".errorMessage").textContent();
	System.out.println(actualText);
	
//	TestNG Assertion
	Assert.assertEquals(actualText, expected);
	
//	JavascriptExecutor
	String msgViaJs=(String)page.evaluate("document.getElementsByClassName('errorMessage')[0].textContent");
	System.out.println("Message by JS"+msgViaJs);
	
//	Playwright Assertion
	PlaywrightAssertions.assertThat(page.locator(".errorMessage")).containsText("Email and Password is required1");
	
//	for partial text
//	PlaywrightAssertions.assertThat(page.locator(".errorMessage")).containsText(Pattern.compile("required"));
	
	page.close();
	browser.close();
	}

}
