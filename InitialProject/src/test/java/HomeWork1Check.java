import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork1Check {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void classWork(){
        //parent

        WebElement el = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el2 = wd.findElement(By.xpath("//h1/::.."));


        //ancestor
        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));

        // ancestor or self

        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling

        WebElement el7 =wd.findElement(By.xpath("//a[last()]/preceding-sibling::a[2]"));

        List<WebElement> list2 = wd.findElements(By.xpath("//a[last()]/preceding-sibling::*"));

    }

    @Test
    public void classWork1(){
        WebElement loginButton = wd.findElement(By.cssSelector("[name='login']"));
        String text = loginButton.getText();
        System.out.println("Login Button text: " + text);

        WebElement form = wd.findElement(By.xpath("//form"));
        String text1 = form.getText();
        System.out.println("Form text: " + text1);

        WebElement html = wd.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println("All text: " + textAll);


    }

    @Test
    public void homework1(){

        WebElement el = wd.findElement(By.xpath("//a"));
        WebElement el1 = wd.findElement(By.xpath("//form"));
        WebElement el2 = wd.findElement(By.xpath("//input"));
        WebElement el3 = wd.findElement(By.xpath("//button"));

        WebElement el4 = wd.findElement(By.xpath("//*[@class='container']"));
        WebElement el15 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));
        WebElement el16 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));
        WebElement el17 = wd.findElement(By.xpath("//*[@class='active']"));

         WebElement el18 = wd.findElement(By.xpath("//*[@id='root']"));

        WebElement el19 = wd.findElement(By.xpath("//*[@href='/home']"));

        WebElement el20 = wd.findElement(By.xpath("//*[@placeholder='Password']"));

        WebElement el21 = wd.findElement(By.cssSelector("[placeholder^='Pas']"));
        WebElement el22 = wd.findElement(By.cssSelector("[placeholder$='word']"));
        WebElement el23 = wd.findElement(By.cssSelector("[placeholder*='wor']"));

        WebElement el24 = wd.findElement(By.xpath("//*[starts-with(@placeholder, 'Pas')]"));

        WebElement el25 =wd.findElement(By.xpath("//*[contains(@placeholder, 'ss')]"));

    }



    @AfterClass
    public void close() {
        wd.close();
    }
}
