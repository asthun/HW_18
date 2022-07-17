import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTestNG {

    @Test
    public void checkTicketNumberNotZeros (){
        int expected = 1;
        int actual = Main.countTicketNumbers(0,0,0,0,0,1);
        Assert.assertTrue(actual >= expected, "Not all zeros.");
    }
}
