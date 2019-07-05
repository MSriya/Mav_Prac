import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTest {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MS056752\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/MS056752/OneDrive%20-%20Cerner%20Corporation/Desktop/TableTest.html");
       /* WebElement TableElement = driver.findElement(By.tagName("Table"));
        WebElement InnerElement = TableElement.findElements(By.tagName("td")).get(1);
        System.out.println(InnerElement.getText());*/

        WebElement row=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td"));
        System.out.println(row.getText());
    }
}