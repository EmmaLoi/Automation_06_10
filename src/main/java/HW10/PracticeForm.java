package HW10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeForm {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        By firstNameInput = By.xpath("//div/input[@id='firstName']");
        By emailInput = By.xpath("//div/input[@id='userEmail']");
        By phoneNumberInput = By.xpath("//div/input[@id='userNumber']");
        By currentAddressInput = By.xpath("//div/textarea[@id='currentAddress']");

        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(firstNameInput).sendKeys("Test");
        driver.findElement(emailInput).sendKeys("test@gmail.com");
        driver.findElement(phoneNumberInput).sendKeys("0731117890");
        driver.findElement(currentAddressInput).sendKeys("Ukraine");
        driver.quit();
    }
}