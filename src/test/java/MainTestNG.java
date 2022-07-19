import org.testng.Assert;
import org.testng.annotations.*;

public class MainTestNG {

    @BeforeTest
    public void printBeforeAllTest () {
        System.out.println("Before all tests ....");
    }

    @AfterTest
    public void printAfterAllTest () {
        System.out.println("After all tests ....");
    }

    @BeforeMethod
    public void printBeforeMethod () {
        System.out.println("This is text before each test");
    }

    @AfterMethod
    public void printAfterMethod () {
        System.out.println("This is text after each test");
    }

    @Test
    public void checkTicketNumberNotZeros (){
        int expected = 1;
        int actual = Main.countTicketNumbers(0,0,0,0,0,1);
        Assert.assertTrue(actual >= expected, "Not all zeros.");
    }

}
