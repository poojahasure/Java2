package dragAndDrop;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ManualDragAndDrop {

	public static void main(String[] args) {
		Browser browser=Playwright.create().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		 Page page =browser.newPage();
		 page.navigate("https://jqueryui.com/droppable/	");
		 
		 FrameLocator frame=page.frameLocator(".demo-frame");

		 frame.locator("#draggable").hover();
		 page.mouse().down();
		 frame.locator("#droppable").hover();
		 page.mouse().up();

	}

}
