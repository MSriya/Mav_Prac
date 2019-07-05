import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class AdvanceWebDriver_techniques {
    public static void main(String[] args){
        WebDriver driver = null;
        try{
           
      System.out.println("error1");

        System.setProperty("webdriver.gecko.driver","C:\\Users\\MS056752\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
            System.out.println("error2");
            driver = new FirefoxDriver();
        } catch(Exception e){
            e.printStackTrace();}
            driver.get("file:///C:/Users/MS056752/OneDrive%20-%20Cerner%20Corporation/Desktop/SeleniumTest.html");
        WebElement RadioButton=driver.findElements(By.name("Radio_Button")).get(1);
        WebElement RadioButton1=driver.findElements(By.name("Radio_Button")).get(2);
        //WebElement RadioButton2=driver.findElements(By.name("Radio_Button")).get(0);
      if(RadioButton.isSelected()) {
           System.out.println("Selected");
           System.out.println(RadioButton.getAttribute("value"));
       }
       else
       {System.out.println("not selected");}

        RadioButton1.click();
       WebElement CheckBox=driver.findElement(By.id("Silk"));
       CheckBox.click();
       if(CheckBox.isSelected())
           System.out.println("Selected the chocolate" + CheckBox.getAttribute("Value"));
       WebElement SelectMenu = driver.findElement(By.id("Select"));
        Select Selection=new Select(SelectMenu);
        Selection.selectByIndex(1);



      /* RadioButton1.clear();
        RadioButton.clear();RadioButton2.clear();*/

}}
