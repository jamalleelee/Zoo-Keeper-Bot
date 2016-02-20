/**
 * package name
 * this package name, and Zoo Keeper Bot name is just an identifier
 * this project not intended to continously beats ZooKeeper Battle PvP modes
 * this application is only purposed for learning programming and java
 * any Robot and RobotBrain source codes would be disabled in released .jar
 */
package ZOO_KEEPER_BOT;

// imported library
import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * class for mouse robot movements
 * methods for solving puzzle
 * @author Gurisa Yudistira M.
 */
public class Actions_Demo {

    // stating variabels
    private java.awt.Robot mouseRobot;
    int x, y;

    // new runnable for battling
    Runnable actions = new Runnable() {
        @Override
        public void run() {

            // actions robot
            try {
                mouseRobot = new Robot();
            } catch (AWTException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }

            // solver method and mouse robot moves
            for (y = 0; y < Properties.the_8; y ++) {
                for (x = 0; x < Properties.the_8; x ++) {

                    // get blocks type data
                    Capture.types[x][y].getText();

                    // check if mouse inside blocks grids (upper left: x 487, y 242 | lower right: x 879, y 658)
                    if (!(MouseInfo.getPointerInfo().getLocation().x < 487 || MouseInfo.getPointerInfo().getLocation().x > 879) &&
                        !(MouseInfo.getPointerInfo().getLocation().y < 242 || MouseInfo.getPointerInfo().getLocation().y > 658)) {

                        // ignoring empty grids and idling mouse when there's no match blocks
                        if (Capture.types[x][y].getText().equals(Properties.typesText[0])) {
                            continue;
                        }

                        // clicking helper blocks
                        if (Capture.types[x][y].getText().equals(Properties.typesText[10])) {
                            mouseRobot.mouseMove(Battle.center[x][y].x, Battle.center[x][y].y);
                            mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                            mouseRobot.mousePress(InputEvent.BUTTON1_MASK);
                            mouseRobot.mouseRelease(InputEvent.BUTTON1_MASK);
                            mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                            continue;
                        }

                        // mess type 1, pointed "LEFT", same as example provided in information
                        if (x + 1 < 8 && Capture.types[x][y].getText().equals(Capture.types[x + 1][y].getText())) {

                            // food across (leftmost)
                            if (x - 2 > -1 && Capture.types[x][y].getText().equals(Capture.types[x - 2][y].getText())) {
                                mouseRobot.mouseMove(Battle.center[x][y].x - (Battle.blockW * 2),
                                                     Battle.center[x][y].y);
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                mouseRobot.mousePress(InputEvent.BUTTON1_MASK);
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                mouseRobot.mouseMove(MouseInfo.getPointerInfo().getLocation().x + (Battle.blockW * 1),
                                                     MouseInfo.getPointerInfo().getLocation().y);
                                mouseRobot.mouseRelease(InputEvent.BUTTON1_MASK);
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                continue;
                            }

                            // food at behind (rightmost)
                            if (x + 3 < 8 && Capture.types[x][y].getText().equals(Capture.types[x + 3][y].getText())) {
                                mouseRobot.mouseMove(Battle.center[x][y].x + (Battle.blockW * 3),
                                                     Battle.center[x][y].y);
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                mouseRobot.mousePress(InputEvent.BUTTON1_MASK);
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                mouseRobot.mouseMove(MouseInfo.getPointerInfo().getLocation().x - (Battle.blockW * 1),
                                                     MouseInfo.getPointerInfo().getLocation().y);
                                mouseRobot.mouseRelease(InputEvent.BUTTON1_MASK);
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                continue;
                            }
                        }

                        // mess type 1, pointed "LEFT", same as example provided in information
                        if (x + 1 < 8 && Capture.types[x][y].getText().equals(Capture.types[x + 1][y].getText())) {

                            // food at upper left
                            if (x - 1 > -1 && y - 1 > -1 && Capture.types[x][y].getText().equals(Capture.types[x - 1][y - 1].getText())) {
                                mouseRobot.mouseMove(Battle.center[x][y].x - (Battle.blockW * 1),
                                                     Battle.center[x][y].y - (Battle.blockH * 1));
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                mouseRobot.mousePress(InputEvent.BUTTON1_MASK);
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                mouseRobot.mouseMove(MouseInfo.getPointerInfo().getLocation().x,
                                                     MouseInfo.getPointerInfo().getLocation().y + (Battle.blockH * 1));
                                mouseRobot.mouseRelease(InputEvent.BUTTON1_MASK);
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                continue;
                            }

                            // food at upper right
                            if (x + 2 < 8 && y - 1 > -1 && Capture.types[x][y].getText().equals(Capture.types[x + 2][y - 1].getText())) {
                                mouseRobot.mouseMove(Battle.center[x][y].x + (Battle.blockW * 2),
                                                     Battle.center[x][y].y - (Battle.blockH * 1));
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                mouseRobot.mousePress(InputEvent.BUTTON1_MASK);
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                mouseRobot.mouseMove(MouseInfo.getPointerInfo().getLocation().x,
                                                     MouseInfo.getPointerInfo().getLocation().y + (Battle.blockH * 1));
                                mouseRobot.mouseRelease(InputEvent.BUTTON1_MASK);
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                continue;
                            }

                            // food at lower right
                            if (x + 2 < 8 && y + 1 < 8 && Capture.types[x][y].getText().equals(Capture.types[x + 2][y + 1].getText())) {
                                mouseRobot.mouseMove(Battle.center[x][y].x + (Battle.blockW * 2),
                                                     Battle.center[x][y].y + (Battle.blockH * 1));
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                mouseRobot.mousePress(InputEvent.BUTTON1_MASK);
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                mouseRobot.mouseMove(MouseInfo.getPointerInfo().getLocation().x,
                                                     MouseInfo.getPointerInfo().getLocation().y - (Battle.blockH * 1));
                                mouseRobot.mouseRelease(InputEvent.BUTTON1_MASK);
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                continue;
                            }

                            // food at lower left
                            if (x - 1 > -1 && y + 1 < 8 && Capture.types[x][y].getText().equals(Capture.types[x - 1][y + 1].getText())) {
                                mouseRobot.mouseMove(Battle.center[x][y].x - (Battle.blockW * 1),
                                                     Battle.center[x][y].y + (Battle.blockH * 1));
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                mouseRobot.mousePress(InputEvent.BUTTON1_MASK);
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                mouseRobot.mouseMove(MouseInfo.getPointerInfo().getLocation().x,
                                                     MouseInfo.getPointerInfo().getLocation().y - (Battle.blockH * 1));
                                mouseRobot.mouseRelease(InputEvent.BUTTON1_MASK);
                                mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                                continue;
                            }
                        }

                        // mess type triangle 0° pointed "LEFT"
                        if (x + 1 < 8 && y - 1 > -1 && Capture.types[x][y].getText().equals(Capture.types[x + 1][y - 1].getText()) &&
                            x + 1 < 8 && y + 1 < 8 && Capture.types[x][y].getText().equals(Capture.types[x + 1][y + 1].getText())) {
                            mouseRobot.mouseMove(Battle.center[x][y].x, Battle.center[x][y].y);
                            mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                            mouseRobot.mousePress(InputEvent.BUTTON1_MASK);
                            mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                            mouseRobot.mouseMove(MouseInfo.getPointerInfo().getLocation().x + (Battle.blockW * 1),
                                                 MouseInfo.getPointerInfo().getLocation().y);
                            mouseRobot.mouseRelease(InputEvent.BUTTON1_MASK);
                            mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                            continue;
                        }

                        // clicking eraser blocks
                        if (Capture.types[x][y].getText().equals(Properties.typesText[11])) {
                            mouseRobot.mouseMove(Battle.center[x][y].x, Battle.center[x][y].y);
                            mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                            mouseRobot.mousePress(InputEvent.BUTTON1_MASK);
                            mouseRobot.mouseRelease(InputEvent.BUTTON1_MASK);
                            mouseRobot.delay((Properties.initial + Properties.delay) / 3);
                        }
                    }
                }
            }
        }
    };
}