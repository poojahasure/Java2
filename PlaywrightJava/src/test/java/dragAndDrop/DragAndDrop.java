package dragAndDrop;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
//1.page.locator("#item-to-be-dragged").dragTo(page.locator("#item-to-drop-at"));
//2.page.locator("#item-to-be-dragged").hover();
//page.mouse().down();
//page.locator("#item-to-drop-at").hover();
//page.mouse().up();

public class DragAndDrop {

	public static void main(String[] args) {
		Browser browser=Playwright.create().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		 Page page =browser.newPage();
		 page.navigate("https://jqueryui.com/droppable/	");
		 
		 FrameLocator frame=page.frameLocator(".demo-frame");
		 frame.locator("#draggable").dragTo(frame.locator("#droppable"));
	}

}
