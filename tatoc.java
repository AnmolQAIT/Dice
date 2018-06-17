import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Tatoc {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Basic Course")).click();
		driver.findElement(By.className("greenbox")).click();
		String str=driver.switchTo().frame("main").findElement(By.id("answer")).getAttribute("class");
		String str1;
	  	System.out.println(str);
	  //  System.out.println(str1);
	   do
	   { str1=driver.switchTo().frame("child").findElement(By.id("answer")).getAttribute("class");
		   driver.switchTo().parentFrame();
		   if(str.equals(str1))
				   {
			   driver.findElement(By.linkText("Proceed")).click();
				   }
		   else
		   {
			  driver.findElement(By.linkText("Repaint Box 2")).click();
		   }
	   }while(str!=str1);
	   
	   Actions action=new Actions(driver);
	 // driver.switchTo().frame(0);
	  WebElement drag=driver.findElement(By.id("dragbox"));
	  WebElement drop=driver.findElement(By.id("dropbox"));
	  action.dragAndDrop(drag,drop).perform();
       driver.findElement(By.linkText("Proceed")).click();
}
}
