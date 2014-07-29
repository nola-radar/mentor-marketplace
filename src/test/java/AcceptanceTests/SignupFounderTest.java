//package AcceptanceTests;
//
//
//
//import java.io.IOException;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
////import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.By;
//import static org.testng.AssertJUnit.assertTrue;
//import org.testng.annotations.AfterClass;
//
///**
// *
// * @author 212391758
// */
//
//public class SignupFounderTest {
//
//    WebDriver driver;
//
//    /**
//     * Starts a new instance of Chromedriver and directs it to Mentor Market
//     * Place
//     */
//    @BeforeClass
//    public void setUp() {
//        System.out.println("Setting up webdriver");
//       
//        //Path to the Chromedriver executable
//        System.setProperty("webdriver.chrome.driver", "src/test/java/Webdrivers/chromedriver.exe");
//        String baseUrl = "http://localhost:8080/mentormarketplace/";
//        driver = new ChromeDriver();
//        driver.get(baseUrl);
//    }
//    
//    /**
//     * Closes the opened browser after testing is completed
//     * @throws IOException 
//     */
//    @AfterClass
//    public void closeBrowser() throws IOException {
//        driver.quit();
//
//    }
//
//    /**
//     * 
//     * @throws InterruptedException 
//     */
//    @Test(groups = {"Founder Signup"})
//    public void testSignupFounder() throws InterruptedException {
//          String title;
//       //Check to see if we are on the index page        
//        title = "Mentor Marketplace";
//        
//        assertTrue(title.equals(driver.getTitle()));
//        
//        driver.findElement(By.id("indexButton")).click();
//                
//        //Check to see if we are on the LinkedIn authorization page
//        title = "Authorize | LinkedIn";
//        assertTrue(title.equals(driver.getTitle()));
//
//        //Put your LinkedIn information here for login
//        String userName = "tyler.bailey1@ge.com";
//        String password = "tyler123";
//        
//        driver.findElement(By.id("session_key-oauth2SAuthorizeForm")).sendKeys(userName);
//        driver.findElement(By.id("session_password-oauth2SAuthorizeForm")).sendKeys(password);        
//        driver.findElement(By.name("authorize")).click();
//                
//    }
//
//}
//
//    
//
