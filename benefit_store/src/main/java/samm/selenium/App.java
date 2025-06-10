package samm.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      WebDriver driver = new ChromeDriver();
      driver.get("https://chatgpt.com/c/684012d5-a76c-8007-b4e5-6b239bbe52a2");
      System.out.println("DOne");
    }
}
