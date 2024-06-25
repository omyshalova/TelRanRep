import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LoginTests {

    @BeforeClass
    public void preCondition(){
//        open browser
//        open site
    }

    public void loginSuccess(){
//        open form - find elem + click
//        fill email - find elem + click + clear + type
//        fill email - find elem + click + clear + type
//        submit form - find elem + click
    }

    public void loginWrongEmail(){
//        open form
//        fill from with wrong email
//        submit form
    }

    public void loginUnregisteredUser(){
//        open form
//        fill from for unregistered user
//        submit form
    }

    @AfterClass
    public void postCondition(){
//        close browser
    }
}

