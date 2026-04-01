package frames;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Frame;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FrameHandling {

	public static void main(String[] args) {
		
      Browser browser=     Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
      
      Page page=browser.newPage();
      page.navigate("https://www.redbus.in/myprofile#trips");
      page.locator("//span[text()='Account']").click();
      page.locator("//span[text()='Login/ Sign Up']").click();
      
      List<Frame> allFrames=page.frames();
      System.out.println("Total number of frames : "+allFrames);
      FrameLocator frame= page.frameLocator("//iframe[@class='modalIframe']");
      
      frame.locator("//input[@id='mobileNoInp']").fill("8844552233");
	}

}
