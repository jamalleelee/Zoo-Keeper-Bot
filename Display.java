/**
 * package name
 * this package name, and Zoo Keeper Bot name is just an identifier
 * this project not intended to continously beats ZooKeeper Battle PvP modes
 * this application is only purposed for learning programming and java
 * any Robot and RobotBrain source codes would be disabled in released .jar
 */
package ZOO_KEEPER_BOT;

// imported library
import java.awt.CardLayout;
import java.awt.Container;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * class for display panels
 * for adding display animal and grids
 * @author Gurisa Yudistira M.
 */
public class Display {

    // stating variabels
    int i, j;
    static final JPanel [][] grids = new JPanel[8][8];
    static final JLabel [][] name = new JLabel[8][8];
    static final JPanel [][] animal = new JPanel[8][8];
    Container toViewer = Window.viewerBoard;

    // new thread for viewing
    Thread display = new Thread() {
        @Override
        public void run() {

            // creating display grids
            for (j = 0; j < Properties.the_8; j ++) {
                for (i = 0; i < Properties.the_8; i ++) {
                    grids[i][j] = new JPanel(new CardLayout(3, 3));

                    // coloring grids
                    if ((i + j) % 2 == 0) {
                        grids[i][j].setBackground(Properties.nulX);
                    } else {
                        grids[i][j].setBackground(Properties.nulY);
                    }

                    // creating animal panels
                    name[i][j] = new JLabel();
                    animal[i][j] = new JPanel(new CardLayout(3, 2));
                    animal[i][j].setBackground(grids[i][j].getBackground());
                    animal[i][j].add(name[i][j]);
                    grids[i][j].add(animal[i][j]);

                    // placing animal panels to display board
                    toViewer.revalidate();
                    toViewer.add(grids[i][j]);
                    toViewer.repaint();
                }
            }

            // calling capture methods
            while (Window.captureButton.isSelected()) {
                Window.captureButton.setForeground(Properties.randomColor());
                new Capture().capture.run();
                try {
                    Thread.sleep(Properties.initial + Properties.delay);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    };
}