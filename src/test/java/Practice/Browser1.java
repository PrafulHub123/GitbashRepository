package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser1 
{

	//pull back
	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

}
