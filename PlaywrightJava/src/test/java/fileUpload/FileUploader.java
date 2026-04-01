package fileUpload;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
/*
 * upload file or multiple files into <input type=file>.
 * // Select one file
page.getByLabel("Upload file").setInputFiles(Paths.get("myfile.pdf"));

// Select multiple files
page.getByLabel("Upload files").setInputFiles(new Path[] {Paths.get("file1.txt"), Paths.get("file2.txt")});

// Select a directory
page.getByLabel("Upload directory").setInputFiles(Paths.get("mydir"));

// Remove all the selected files
page.getByLabel("Upload file").setInputFiles(new Path[0]);

// Upload buffer from memory
page.getByLabel("Upload file").setInputFiles(new FilePayload(
  "file.txt", "text/plain", "this is test".getBytes(StandardCharsets.UTF_8)));*/
public class FileUploader {

	public static void main(String[] args) throws InterruptedException {
		Browser browser= Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://the-internet.herokuapp.com/upload");
//		page.locator("#file-upload").setInputFiles(Paths.get("C:\\Users\\premh\\eclipse-workspace\\PlaywrightJava\\files\\Capture.JPG"));
		
		page.locator("#file-upload").setInputFiles(new Path[] {
				Path.of(System.getProperty("user.dir")+"/files/Capture.JPG")
		});
		
		Thread.sleep(3000);
//		Remove uploaded file
		page.locator("#file-upload").setInputFiles(new Path[0]);
		

	}

}
