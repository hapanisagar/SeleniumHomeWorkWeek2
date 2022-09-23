package AutomateRegisterPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterFuncatnality extends Utils  {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Meet");
        driver.findElement(By.name("LastName")).sendKeys("Patel");
        Thread.sleep(3000);

        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month =  driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));

        Select select = new Select(Day);
        select.selectByIndex(3);
        Select select1= new Select(Month);
        select1.selectByIndex(5);
        Select select2 = new Select(Year);
        select2.selectByIndex(6);


      /*  selectValueFromDropdown(Day,"3");
        selectValueFromDropdown(Month,"May");
        selectValueFromDropdown(Year,"1917");*/

        Thread.sleep(3000);


        driver.findElement(By.id("Email")).sendKeys("meetpatel2000@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("UnifyTesting");
        Thread.sleep(3000);
        driver.findElement(By.id("Newsletter")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='password' and @id='Password']")).sendKeys("Meet2000");
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Meet2000");
        Thread.sleep(3000);
        driver.findElement(By.name("register-button")).click();
        Thread.sleep(3000);

    }
}
