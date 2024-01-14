package AdMaulana.helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Utility {

    public static File getJSONSchemaFile(String JSONFile) {
        return new File("src/test/java/AdMaulana/helper/JSONSchemas/" + JSONFile);
    }
    public static String generateRandomEmail(){
        String allowedChart = "abcdefghijklmnopqrstuvwxyz" + "123456789" + "_-.";
        String email = "";
        String temp = RandomStringUtils.randomAlphanumeric(10);
        email = temp + "@adtest.com";
        return email;
    }

    public static WebDriver driver = new ChromeDriver();

    public static void startDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public static void quitDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
