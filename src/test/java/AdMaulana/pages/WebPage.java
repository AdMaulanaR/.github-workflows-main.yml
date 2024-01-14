package AdMaulana.pages;

import org.openqa.selenium.By;

import static AdMaulana.helper.Utility.driver;

public class WebPage {


    By button_login = By.id("login2");
    By input_username = By.id("loginusername");
    By input_password = By.xpath("//*[@id=\"loginpassword\"]");
    By button_login_new = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");

    public void isOnLoginPage(){
        driver.get("https://www.demoblaze.com/");
    }
    public void clickButtonLogin(){
        driver.findElement(button_login).click();
    }
    public void inputUserName(String username){
        driver.findElement(input_username).sendKeys(username);
    }
    public void inputPassword(String password){
        driver.findElement(input_password).sendKeys(password);
    }
    public void clickButtonLoginNew(){
        driver.findElement(button_login_new).click();
    }

}
