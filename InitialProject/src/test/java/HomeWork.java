import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
        System.out.println(wd.toString());





        //by tag name


        //by class

        //by id


        //by attribute
    }
}