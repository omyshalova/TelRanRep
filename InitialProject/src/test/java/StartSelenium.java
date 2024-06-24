import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartSelenium {
    WebDriver wd;
    @Test
    public void test(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");
        wd.get("https://google.com");
        wd.navigate().to("https://telranedu.web.app/home");
//        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
    }

}
