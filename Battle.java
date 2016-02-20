/**
 * package name
 * this package name, and Zoo Keeper Bot name is just an identifier
 * this project not intended to continously beats ZooKeeper Battle PvP modes
 * this application is only purposed for learning programming and java
 * any Robot and RobotBrain source codes would be disabled in released .jar
 */
package ZOO_KEEPER_BOT;

// imported library
import java.awt.Point;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * class for battle solver (bot)
 * and for refreshing bot string, change it to movie quotes
 * @author Gurisa Yudistira M.
 */
public class Battle {

    // stating variabels
    int x, y;
    static final int blockW = 49, blockH = 52;
    static final int centerX = 487 + (blockW / 2), centerY = 242 + (blockH / 2);
    static final Point [][] center = new Point[8][8];

    // new thread for battling
    Thread battle = new Thread() {
        @Override
        public void run() {

            // creating squares for center
            for (y = 0; y < Properties.the_8; y ++) {
                for (x = 0; x < Properties.the_8; x ++) {
                    center[x][y] = new Point((blockW * x) + centerX, (blockH * y) + centerY);
                    Rectangle blockRectangle = new Rectangle(x * blockW, y * blockH, blockW, blockH);
                    blockRectangle.add(center[x][y]);

                    // TEST: check center position / point
                    //System.out.println("block [" + x + "." + y + "] center point: x" + center[x][y].x + ", y" + center[x][y].y);
                }
            }

            // calling battle methods
            while (Window.battleButton.isSelected()) {
                Window.battleButton.setForeground(Properties.randomColor());
                // new Actions().actions.run ();
                new Actions_Demo().actions.run ();
                try {
                    Thread.sleep(Properties.initial + Properties.delay / 3);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    };

    // new thread for easter
    Thread easter = new Thread() {
        @Override
        public void run() {
            // calling battle methods
            while (Window.battleButton.isSelected()) {
                Properties.movieQuotes();
                try {
                    Thread.sleep(Properties.initial * 15);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    };
}