import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();

        int X = 900;     // Starting X position (left)
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
                FinishedSequence(robot);
            }
            robot.mouseMove(X, y);
            Thread.sleep(100);
            robot.mouseMove(X+5, y);
            //MOVEMENT
            for(int i=0;i<4;i++){
                EatClick(100,robot);
                Thread.sleep(500);
                MoveAroundD(robot);
                EatClick(100,robot);
                Thread.sleep(500);
                MoveAroundD(robot);
                //
                EatClick(100,robot);
                Thread.sleep(500);
                MoveAroundS(robot);
                EatClick(100,robot);
                Thread.sleep(500);
                MoveAroundS(robot);
                //
                EatClick(100,robot);
                Thread.sleep(500);
                MoveAroundA(robot);
                EatClick(100,robot);
                Thread.sleep(500);
                MoveAroundA(robot);
                //
                EatClick(100,robot);
                Thread.sleep(500);
                MoveAroundW(robot);
                EatClick(100,robot);
                Thread.sleep(500);
                MoveAroundW(robot);
                System.out.println(i);
            }
            done=10;



            //
            System.out.println(done);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_W);   // Press W
            Thread.sleep(200);               // Hold key for 200 ms
            robot.keyRelease(KeyEvent.VK_W);
            Thread.sleep(1000); // Short pause before next repetition
        }

    }

    public static void FinishedSequence(Robot robot) throws AWTException, InterruptedException {

        robot.mouseMove(950, 1010);
        Thread.sleep(100);
        robot.mouseMove(950, 1015);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(50); // Hold click for 100 ms
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.keyPress(KeyEvent.VK_W);
        robot.keyPress(KeyEvent.VK_SPACE);// Press W
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_SPACE);// Hold key for 200 ms
        robot.keyRelease(KeyEvent.VK_W);
        Thread.sleep(50);
    }
    public static void MoveAroundD(Robot robot) throws AWTException, InterruptedException {

        robot.keyPress(KeyEvent.VK_D);   // Press W
        Thread.sleep(100);               // Hold key for 200 ms
        robot.keyRelease(KeyEvent.VK_D);
    }

    public static void MoveAroundS(Robot robot) throws AWTException, InterruptedException {

        robot.keyPress(KeyEvent.VK_S);   // Press W
        Thread.sleep(100);               // Hold key for 200 ms
        robot.keyRelease(KeyEvent.VK_S);
    }

    public static void MoveAroundA(Robot robot) throws AWTException, InterruptedException {

        robot.keyPress(KeyEvent.VK_A);   // Press W
        Thread.sleep(100);               // Hold key for 200 ms
        robot.keyRelease(KeyEvent.VK_A);
    }

    public static void MoveAroundW(Robot robot) throws AWTException, InterruptedException {

        robot.keyPress(KeyEvent.VK_W);   // Press W
        Thread.sleep(100);               // Hold key for 200 ms
        robot.keyRelease(KeyEvent.VK_W);
    }

    public static void EatClick(int repetitions,Robot robot) throws AWTException, InterruptedException {

        for (int i=0;i<repetitions;i++){
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(50);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }
        Thread.sleep(500);

    }
}