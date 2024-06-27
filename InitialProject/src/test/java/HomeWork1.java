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
        WebElement el = wd.findElement(By.xpath("//*[@id='root']/div[1]/h1"));
        Assert.assertEquals(el.getText(), "PHONEBOOK");
        System.out.println("Tag name: " + el.getTagName());
        System.out.println("Tag text: " + el.getText());

        WebElement el1 = wd.findElement(By.xpath("//body"));
        Assert.assertEquals(el1.getTagName(), "body");
        WebElement el2 = wd.findElement(By.xpath("//div"));
        WebElement el3 = wd.findElement(By.xpath("//h1"));
        WebElement el4 = wd.findElement(By.xpath("//a"));
        WebElement el5 = wd.findElement(By.xpath("//form"));
        WebElement el6 = wd.findElement(By.xpath("//input"));
        WebElement el7 = wd.findElement(By.xpath("//button"));

        WebElement el8 = wd.findElement(By.xpath("//*[@class='container']"));
        Assert.assertEquals(el8.getAttribute("class"), "container");
        System.out.println("Class: " + el8.getAttribute("class"));





    }

    @AfterClass
    public void close() {
        wd.close();
    }
}
