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

    @BeforeSuite
    public  void printBeforeSuit() {
        System.out.println("Before suit");
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
        int actual = Main.countTicketNumbers(0,0,0,0,0,0);
        Assert.assertTrue (actual > 0, "All zeros.");
        System.out.println("Not all zeros.");
    }

    @Test
    public void checkTicketIsLucky (){
        String actual = Main.checkIfTicketLucky(0,1,0,1,0,0);
        Assert.assertEquals(actual, "lucky", "Ticket is not lucky.");
        System.out.println("Ticket is lucky.");
    }

    @Test
    public void checkTicketLength (){
        int actual = Main.countTicketLength(0,1,0,1,0,0);
        Assert.assertEquals(actual, 6, "Ticket length is invalid");
        System.out.println("Ticket length is 6 numbers.");
    }

}
