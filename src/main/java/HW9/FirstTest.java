package HW9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ithillel.ua/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
