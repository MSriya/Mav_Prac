    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.remote.DesiredCapabilities;
    import org.openqa.selenium.remote.RemoteWebDriver;

    import java.net.URL;

    public class test {

        public static void main(String[] args) throws Exception {
         //System.setProperty("webdriver.gecko.driver","C:\\Users\\MS056752\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\MS056752\\Downloads\\chromedriver_win32\\chromedriver.exe");
// ChromeOptions options = new ChromeOptions();
            // options.addArguments("test-type");
            //options.addArguments("--disable-extensions");
            //WebDriver driver = new ChromeDriver();
DesiredCapabilities Capabilties=new DesiredCapabilities();
Capabilties.setBrowserName("chrome");
Capabilties.setVersion("73.0.3683.103");
            URL server = new URL("http://127.0.0.1:4444/wd/hub");

           System.out.println("connecting to server"+server);
            WebDriver driver=new RemoteWebDriver(server, Capabilties);
            driver.get("https://www.google.com");
           /* WebElement searchField=driver.findElement(By.name("q"));
            searchField.sendKeys("plurasight");
            searchField.submit();
            //driver.manage().timeouts().implicitlyWait(12000, TimeUnit.SECONDS);
            WebDriverWait wait=new WebDriverWait(driver,120);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));

            WebElement ImageClick = driver.findElement(By.linkText("Images"));
            ImageClick.click();
            //WebElement Image = driver.findElement(By.id("tM7CbBiXpaDKlM:"));
            //Image.click();
            WebElement ImageElement = driver.findElements(By.cssSelector("a[class= rg_l]")).get(2);
            //WebElement ImageElement = (WebElement) driver.findElements(By.className("rg_l")).get(2);
            WebElement ImageLink = ImageElement.findElements(By.tagName("img")).get(0);
            ImageLink.click();

           // driver.navigate().back();
            Boolean b=driver.getPageSource().contains("Pluralsight testing");
            if(b)
                System.out.println("value present");
            else
                System.out.println("Value not present");
        /*driver.navigate().forward();
            driver.navigate().to("http://www.DemoQA.com");
            driver.navigate().refresh();
            driver.close();
    */
        }

    }
