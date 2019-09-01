package samples;
import org.junit.Test;
public class AppTest {

    @Test
    public void sleepIt() throws Exception {
        Thread.sleep(60 * 60 * 1000);
    }
}