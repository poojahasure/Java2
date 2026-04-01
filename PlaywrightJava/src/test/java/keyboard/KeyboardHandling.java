package keyboard;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class KeyboardHandling {
	public static void main(String[] args) {
	 Browser browser=Playwright.create().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
	 Page page =browser.newPage();
	 page.navigate("https://freelance-learn-automation.vercel.app/login");
	 page.locator("#email1").fill("admin@email.com");
	 
	 page.keyboard().down("Control");
	 page.keyboard().press("a");
	 page.keyboard().up("Control");
	 
	 page.keyboard().down("Control");
	 page.keyboard().press("c");
	 page.keyboard().up("Control");
	 
	 page.keyboard().press("Enter");
	 page.keyboard().press("Tab");
	 
	 page.keyboard().down("Control");
	 page.keyboard().press("v");
	 page.keyboard().up("Control");
}
}