package gettingStarted;
import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

//mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen https://freelance-learn-automation.vercel.app/login"
//mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen --viewport-size='800,600' playwright.dev"
//mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args='codegen --device="iPhone 13" playwright.dev'
//mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen --color-scheme=dark playwright.dev"
//mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen https://freelance-learn-automation.vercel.app/login  --save-storage=auth.json"
//mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen --load-storage=auth.json https://freelance-learn-automation.vercel.app/login"
public class RecordAndPlayback {

	public static void main(String[] args) {
		
			

			
			    try (Playwright playwright = Playwright.create()) {
			      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
			        .setHeadless(false));
			      BrowserContext context = browser.newContext();
			      Page page = context.newPage();
			      page.navigate("https://freelance-learn-automation.vercel.app/login");
			      PlaywrightAssertions.assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Sign In"))).isVisible();
			      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter Email")).click();
			      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter Email")).fill("poojahasure291@gmail.com");
			      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter Password")).click();
			
			      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter Password")).fill("pooja123");
			      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign in")).click();
			      page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("menu")).click();
			      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign out")).click();
			      PlaywrightAssertions.assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign in"))).isVisible();
			    }
			
		}

	}


