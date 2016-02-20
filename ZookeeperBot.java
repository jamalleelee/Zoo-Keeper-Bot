/**
 * package name
 * this package name, and Zoo Keeper Bot name is just an identifier
 * this project not intended to continously beats ZooKeeper Battle PvP modes
 * this application is only purposed for learning programming and java
 * any Robot and RobotBrain source codes would be disabled in released .jar
 */
package ZOO_KEEPER_BOT;

// imported library
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * main class for ZookeeperBot java application
 * for calling sub-classes
 * main class implementation
 * @author Gurisa Yudistira M.
 */
public class ZookeeperBot {

    // set system looks and feels then run main frame
    @SuppressWarnings("Convert2Lambda")
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, UnsupportedLookAndFeelException {
        for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                break;
            }
        }

        // calling main frame
        SwingUtilities.invokeLater (new Runnable() {
            @Override
            public void run() {
                new Window().initMainFrame();
            }
        });
    }
}