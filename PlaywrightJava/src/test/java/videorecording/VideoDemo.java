package videorecording;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class VideoDemo {

	public static void main(String[] args) {
		 Browser browser=     Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		 BrowserContext context=browser.newContext(new Browser.NewContextOptions().setRecordVideoSize(500, 500).setRecordVideoDir(Paths.get("VideoRecording/")));
		 Page page=context.newPage();
			page.navigate("https://freelance-learn-automation.vercel.app/login");
			page.locator("#email1").fill("admin@email.com");
			String path=page.video().path().toString();
			System.out.println(path);
			page.close();
			context.close();
			browser.close();

	}

}
