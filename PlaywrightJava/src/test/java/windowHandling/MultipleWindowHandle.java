package windowHandling;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MultipleWindowHandle {

	public static void main(String[] args) {
	Browser browser=	Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
	BrowserContext context=browser.newContext();
	Page page=context.newPage();
	page.navigate("https://freelance-learn-automation.vercel.app/login");
	
	//locate list of the links 
	Locator allLinks=page.locator("//div[@class='social']//a");
	
	//To click on each link use forloop
	for(int i=0;i<allLinks.count();i++) {
		allLinks.nth(i).click();
	}
	
    //context.pages() -method to return all the pages present in the context	
	List<Page> allPages=context.pages();
	
	for(Page p:allPages) {
		String title=p.title();
		if(title.contains("facebook")) {
			p.bringToFront();
			p.locator("//input[@name='email']").last().fill("selenium@gmail.com");
			break;
		}
	}
	
	page.bringToFront();
	page.getByPlaceholder("Enter Email").fill("selenium@gmail.com");
	
//	context.close();
//	browser.close();
	
	

	}

}
