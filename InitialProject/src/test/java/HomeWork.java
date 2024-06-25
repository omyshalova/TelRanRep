import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }


    @Test
    public void homework1(){

        String pageTitle = wd.getTitle();
        System.out.println("Page Title: " + pageTitle);


        //by tag name
        WebElement button = wd.findElement(By.tagName("button"));
        System.out.println("Tag name: " + button.getTagName());
        System.out.println("Tag text: " + button.getText());
        WebElement button1 = wd.findElement(By.cssSelector("button"));
        System.out.println("Tag name: " + button1.getTagName());
        System.out.println("Tag text: " + button1.getText());

        List<WebElement> a = wd.findElements(By.tagName("a"));
        List<WebElement> list = wd.findElements(By.cssSelector("a"));
        System.out.println("List size: " + list.size());
        System.out.println("First tag name: " + a.get(0).getTagName());
        System.out.println("First tag text: " + a.get(0).getText());
        System.out.println("Second tag name: " + a.get(1).getTagName());
        System.out.println("Second tag text: " + a.get(1).getText());
        System.out.println("Third tag name: " + a.get(2).getTagName());
        System.out.println("Third tag text: " + a.get(2).getText());

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));
        System.out.println("Tag name: " + input.getTagName());
        System.out.println("Tag attribute: " + input1.getAttribute("Placeholder"));

        //by class
        WebElement divContainer = wd.findElement(By.className("container"));
        WebElement divContainer1 = wd.findElement(By.cssSelector(".container"));
        System.out.println("Class  name: " + divContainer.getTagName());
        System.out.println("Class  text: " + divContainer1.getText());


        WebElement loginLogin = wd.findElement(By.className("login_login__3EHKB"));
        WebElement loginLogin1 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        System.out.println("Class  name: " + loginLogin.getTagName());
        System.out.println("Class  text: " + loginLogin1.getText());

        //by id

        WebElement root = wd.findElement(By.id("root"));
        WebElement root1 = wd.findElement(By.cssSelector("#root"));
        System.out.println("Id name: " + root.getTagName());
        System.out.println("Id text: " + root1.getText());

        //by attribute
        WebElement inputPassword = wd.findElement(By.cssSelector("[placeholder='Password']"));
        System.out.println("Attribute name: " + inputPassword.getTagName());
        System.out.println("Attribute text: " + inputPassword.getAttribute("Placeholder"));
        WebElement a2 = wd.findElement(By.cssSelector("[href='/login']"));
        System.out.println("Attribute name: " + a2.getTagName());
        System.out.println("Attribute text: " + a2.getAttribute("href"));
    }

    @AfterClass
    public void close() {
        wd.close();
    }

}