package fileUpload;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FileUploadWithoutInputTag {

	public static void main(String[] args) {
		Browser browser= Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://the-internet.herokuapp.com/upload");
		FileChooser fileChooser = page.waitForFileChooser(() -> page.locator("#drag-drop-upload").click());
//		fileChooser.setFiles(Paths.get(System.getProperty("user.dir")+"/files/Capture.JPG"));
		
		Path[] filestoupload= {Paths.get(System.getProperty("user.dir")+"/files/Capture.JPG"),
				Paths.get(System.getProperty("user.dir")+"/files/Capture.JPG"),Paths.get(System.getProperty("user.dir")+"/files/Capture.JPG")};
		
		fileChooser.setFiles(filestoupload);
	}

}
