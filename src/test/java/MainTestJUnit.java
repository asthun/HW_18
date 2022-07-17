import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTestJUnit {
    @Test
    public void checkTicketNumberNotZeros (){
        int expected = 1;
        int actual = Main.countTicketNumbers(0,0,0,0,0,1);
        Assertions.assertTrue(actual >= expected, "Not all zeros.");
    }
}
