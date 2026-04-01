package fileDownload;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

/*
 * // Wait for the download to start
Download download = page.waitForDownload(() -> {
    // Perform the action that initiates download
    page.getByText("Download file").click();
});

// Wait for the download process to complete and save the downloaded file somewhere
download.saveAs(Paths.get("/path/to/save/at/", download.suggestedFilename()));
 * */
public class FileDownload {

	public static void main(String[] args) throws IOException {
		Browser browser= Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://the-internet.herokuapp.com/download");
		Download download = page.waitForDownload(() -> {
		    // Perform the action that initiates download
		    page.locator("//a[text()='test-upload.txt']").click();
		});
		String downloadPath=System.getProperty("user.dir")+"/downloadfiles/"+download.suggestedFilename();
		System.out.println(downloadPath);
		download.saveAs(Paths.get(downloadPath));
//		System.out.println(download.suggestedFilename());
//		System.out.println(download.url());
//		System.out.println(download.path());
		if(downloadPath.endsWith(".txt")) {
			System.out.println("Download extension verified");
		}else {
			System.out.println("Download extension verification failed");
			browser.close();
			return;
		}
		if(Files.size(Path.of(downloadPath))>0) {
			System.out.println("File size verified");
		}else {
			System.out.println("File size is not  verified");
			browser.close();
			return;
		}
		String dataFromFile=Files.readString(Path.of(downloadPath));
		if(dataFromFile.contains("This is a test file for upload testing.")) {
			System.out.println("data is verified");
		}else {
			System.out.println("data verification failed");
			browser.close();
			return;
		}
		System.out.println(dataFromFile);
		page.close();
		browser.close();
		
	}

}
