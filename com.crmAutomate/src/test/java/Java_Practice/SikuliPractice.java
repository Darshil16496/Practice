package Java_Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliPractice {

	public static void main(String[] args) throws FindFailed, AWTException, InterruptedException {
		// TODO Auto-generated method stub
		Screen sc = new Screen();
		Pattern p = new Pattern("C:\\Users\\SAFFRO TECHNOLOGIES\\Desktop\\minimize.jpg");
		sc.click(p);
		Pattern p1 = new Pattern("C:\\Users\\SAFFRO TECHNOLOGIES\\Desktop\\firefox.jpg");
		sc.click(p1);
		Pattern p2 = new Pattern("C:\\Users\\SAFFRO TECHNOLOGIES\\Desktop\\newtab.jpg");
		sc.click(p2);
		sc.type(p2, "Paint");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		Pattern p3 = new Pattern("C:\\Users\\SAFFRO TECHNOLOGIES\\Desktop\\close.jpg");
		sc.click(p3);	

}
}