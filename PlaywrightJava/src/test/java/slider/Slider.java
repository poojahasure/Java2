package slider;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Slider {

	public static void main(String[] args) {
		Browser browser=Playwright.create().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		 Page page =browser.newPage();
		 page.navigate("https://jqueryui.com/slider/");
		 FrameLocator frame=page.frameLocator(".demo-frame");
         Locator sliderlocator=frame.locator("//span[contains(@class,'ui-slider-handle')]");
         sliderlocator.focus();
         for(int i=0;i<=10;i++) {
        	 page.keyboard().press("ArrowRight");
         }
	}

}
