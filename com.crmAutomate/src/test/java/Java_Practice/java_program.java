package Java_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class java_program {

	@Test
	public void run() {
		System.out.println("darshil");
		WebDriver cd = new ChromeDriver();
		cd.get("https://www.amazon.in/");
		System.out.println(cd.getTitle());
		cd.close();
	}
}
