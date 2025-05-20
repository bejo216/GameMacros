import java.awt.*;
import java.awt.event.KeyEvent;

public class UntitledDrillGameMacro {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        while (true) {
            robot.keyPress(KeyEvent.VK_E);   // Press W
            Thread.sleep(200);               // Hold key for 200 ms
            robot.keyRelease(KeyEvent.VK_E);
            Thread.sleep(2000);
        }
    }
}
//e