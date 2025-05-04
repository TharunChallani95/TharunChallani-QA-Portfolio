// File: Automation/login_test.java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://todomvc.com/");
        driver.findElement(By.id("todo-input")).sendKeys("Test Task");
        driver.findElement(By.id("todo-input")).submit();
        driver.quit();
    }
}