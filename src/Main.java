import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();

        int X = 0;     // Starting X position (left)
              // Ending X position (right)
        int y = 500;          // Fixed Y position
              // Number of steps between left and right
        int delay = 10;       // Delay between steps in milliseconds
          // Number of times to go from left to right
        int done=70;
        while(true) {
            Thread.sleep(500);
            robot.mouseMove(X, y);
            Thread.sleep(200);
            robot.mouseMove(X+5, y);
            done++;
            if (done>=8){
                robot.mouseMove(950, 1010);
                Thread.sleep(100);
                robot.mouseMove(950, 1015);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(50); // Hold click for 100 ms
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robot.keyPress(KeyEvent.VK_W);   // Press W
                Thread.sleep(3000);                   // Hold key for 200 ms
                robot.keyRelease(KeyEvent.VK_W);

                done=0;
                Thread.sleep(100);
            }
            for(int i=0;i<100;i++){
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(100); // Hold click for 100 ms


                robot.mouseMove(900, 300);

                Thread.sleep(100);
                robot.mouseMove(900, 300);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            }
            System.out.println(done);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_W);   // Press W
            Thread.sleep(200);               // Hold key for 200 ms
            robot.keyRelease(KeyEvent.VK_W);
            Thread.sleep(1000); // Short pause before next repetition
        }

    }
}