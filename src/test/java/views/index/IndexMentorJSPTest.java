package views.index;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IndexMentorJSPTest {
    @BeforeClass
    public void setUp() {
      // code that will be invoked when this test is instantiated
    }

    @Test(groups = { "group 1" })
    public void groupOneTest() {
      System.out.println("group 1 test");
    }
    
    /* This is the Mentor Create Test
     * Uncomment Test and right click on 'groupTwoTest'
     * Then click 'test file'
     * Remember to adjust location of the chrome.exe path
     * according to where it is on your local machine
     * Author: Marcus Bischof
    */
    //@Test(groups = { "group 2" })
    public void groupTwoTest() throws InterruptedException {
        
        System.out.println("Index Test Beginnning");
        
        WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "src/test/java/Webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
       
        driver.get("http://localhost:8080/mentormarketplace/");
        
        if( driver.findElement(By.cssSelector("#indexButton")).isDisplayed()){
            System.out.println("Mentor Register Visible");
        }else{
            System.out.println("Mentor Register Not Visible");
        }
        
        driver.close();
        driver.quit();
    }
}