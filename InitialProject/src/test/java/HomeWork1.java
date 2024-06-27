import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork1 {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void homework1(){

        //by tagName

        WebElement el1 = wd.findElement(By.xpath("//body"));
        Assert.assertEquals(el1.getTagName(), "body");

        WebElement el2 = wd.findElement(By.xpath("//div"));
        Assert.assertEquals(el2.getTagName(), "div");

        WebElement el3 = wd.findElement(By.xpath("//h1"));
        Assert.assertEquals(el3.getTagName(), "h1");

        WebElement el4 = wd.findElement(By.xpath("//a"));
        Assert.assertEquals(el4.getTagName(), "a");

        WebElement el5 = wd.findElement(By.xpath("//form"));
        Assert.assertEquals(el5.getTagName(), "form");

        WebElement el6 = wd.findElement(By.xpath("//input"));
        Assert.assertEquals(el6.getTagName(), "input");

        WebElement el7 = wd.findElement(By.xpath("//button"));
        Assert.assertEquals(el7.getTagName(), "button");

        //by Class

        WebElement el8 = wd.findElement(By.xpath("//*[@class='container']"));
        Assert.assertEquals(el8.getAttribute("class"), "container");

        WebElement el9 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));
        Assert.assertEquals(el9.getAttribute("class"), "navbar-component_nav__1X_4m");

        WebElement el10 = wd.findElement(By.xpath("//*[@class='active']"));
        Assert.assertEquals(el10.getAttribute("class"), "active");

        WebElement el11 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));
        Assert.assertEquals(el11.getAttribute("class"), "login_login__3EHKB");

        //by Id

        WebElement el12 = wd.findElement(By.xpath("//*[@id='root']"));
        Assert.assertEquals(el12.getAttribute("id"), "root");

        //by Attribute

        WebElement el13 = wd.findElement(By.xpath("//*[@href='/home']"));
        Assert.assertEquals(el13.getText(), "HOME");

        WebElement el14 = wd.findElement(By.xpath("//*[@placeholder='Password']"));
        Assert.assertEquals(el14.getAttribute("placeholder"), "Password");

        WebElement el15 = wd.findElement(By.xpath("//*[starts-with(@placeholder, 'Pas')]"));
        Assert.assertEquals(el15.getAttribute("placeholder"), "Password");

        WebElement el16 = wd.findElement(By.xpath("//*[contains(@placeholder, 'word')]"));
        Assert.assertEquals(el16.getAttribute("placeholder"), "Password");

        WebElement el17 =wd.findElement(By.xpath("//*[text()='Registration']"));
        Assert.assertEquals(el17.getText(), "Registration");

        WebElement el18 =wd.findElement(By.xpath("//*[@type='submit' and @name='login']"));
        Assert.assertEquals(el18.getText(), "Login");

        WebElement el19 =wd.findElement(By.xpath("//a[3]"));
        Assert.assertEquals(el19.getText(), "LOGIN");
    }

    @AfterClass
    public void close() {
        wd.close();
    }
}
