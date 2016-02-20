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
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 * class for screen capturing
 * screen to capture:
 * upper left: x 487, y 242
 * lower right: x 879, y 658
 * board size: width 392, height 416
 * @author Gurisa Yudistira M.
 */
public class Capture {

    // stating variabels
    private Robot imageRobot;
    private BufferedImage boardCaptured = new BufferedImage(392, 416, BufferedImage.TYPE_INT_RGB);
    final Rectangle boardRectangle = new Rectangle(487, 242, 392, 416);
    int blockX, blockY;
    final int W = 49, H = 52;
    final BufferedImage[][] blocks = new BufferedImage[8][8];
    int pixels = W * H;
    int i, j;
    int x, y, z;
    int start, finish;
    private List <String> boardData = new ArrayList<>();
    static final JLabel [][] types = new JLabel[8][8];

    // Test: variable for saving 64 blocks seperately
    //javax.swing.JPanel [][] mask = new javax.swing.JPanel[8][8];
    //java.awt.Container body = new java.awt.Container();

    // new runnable for capturing
    Runnable capture = new Runnable() {
        @Override
        public void run() {

            // capture robot
            try {
                imageRobot = new Robot();
            } catch (AWTException ex) {
                Logger.getLogger(Capture.class.getName()).log(Level.SEVERE, null, ex);
            }

            // capturing game board
            boardCaptured = imageRobot.createScreenCapture(boardRectangle);

            // TEST: save captured image
            //java.io.File boardSaved = new java.io.File ("boardCaptured.png");
            //try { javax.imageio.ImageIO.write(boardCaptured, "png", boardSaved); }
            //catch (java.io.IOException ex) { Logger.getLogger(Capture.class.getName()).log(Level.SEVERE, null, ex); }
            //body.revalidate(); body.removeAll();

            // creating sub images (per animal blocks)
            for (blockY = 0; blockY < Properties.the_8; blockY ++) {
                for (blockX = 0; blockX < Properties.the_8; blockX ++) {
                    int X = blockX * W;
                    int Y = blockY * H;
                    blocks[blockX][blockY] = boardCaptured.getSubimage(X, Y, W, H);

                    // Test: save 64 blocks seperately
                    //mask[blockX][blockY] = new javax.swing.JPanel();
                    //body.add(mask[blockX][blockY]);
                    //java.io.File blocksSaved = new java.io.File ("block " + body.getComponentCount() + ".png");
                    //try { javax.imageio.ImageIO.write(blocks[blockX][blockY], "png", blocksSaved); }
                    //catch (java.io.IOException ex) { Logger.getLogger(Capture.class.getName()).log(Level.SEVERE, null, ex); }

                    // getting animal blocks RGB
                    for (j = 0; j < H; j ++) {
                        for (i = 0; i < W; i ++) {
                            Arrays.toString(getRGB(blocks[blockX][blockY], i, j));
                            boardData.add(Arrays.toString(getRGB(blocks[blockX][blockY], i, j)));

                            // TEST: print all 163,072 buffered image pixel data
                            //System.out.println(boardData);
                        }
                    }
                }
            }

            // processing animal blocks strings for display and blocks typesText
            for (y = 0; y < Properties.the_8; y ++) {
                for (x = 0; x < Properties.the_8; x ++) {
                    types[x][y] = new JLabel();

                    // refreshing display board
                    Display.grids[x][y].revalidate();
                    Display.animal[x][y].revalidate();
                    Display.name[x][y].revalidate();

                    // control equations for 1D to 2D translator
                    z = x + (blocks.length * y);
                    x = z - (blocks.length * y);
                    y = (z - x) / blocks.length;

                    // find pixels
                    start = z * pixels;
                    finish = (z * pixels) + pixels;

                    // TEST: print all 64 blocks data, each contain 2,458 pixel list
                    //System.out.println("block [" + z + "] contains: " + Arrays.
                    //toString(boardData.subList(start, finish).toArray(
                    //new String[z])));

                    // defining empty blocks
                    if (!(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findPurH[0])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findPurH[1])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findBluE[0])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findBluE[1])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findWhiP[0])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findWhiP[1])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findRedM[0])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findRedM[1])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findOraL[0])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findOraL[1])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findGreC[0])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findGreC[1])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findYelG[0])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findYelG[1])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findPinR[0])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findPinR[1])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findAnnB[0])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findAnnB[1])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findHelB[0])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findHelB[1])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findEraB[0])) ||
                        !(Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findEraB[1]))) {

                        // that's annoying, is there any shortcut for the codes above?
                        Display.animal[x][y].setBackground(Display.grids[x][y].getBackground());
                        Display.animal[x][y].setBorder(BorderFactory.createEmptyBorder());
                        Display.animal[x][y].repaint();
                        Display.name[x][y].setText(Properties.viewerText[0]);
                        Display.name[x][y].setFont(new Font("Tahoma", Font.BOLD, 9));
                        Display.name[x][y].repaint();
                        types[x][y].setText(Properties.typesText[0]);
                    }

                    // defining hippopotamus blocks
                    if (Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findPurH[0])
                        && Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findPurH[1])) {
                        Display.animal[x][y].setBackground(Properties.purH);
                        Display.animal[x][y].setBorder(BorderFactory.createRaisedBevelBorder());
                        Display.animal[x][y].repaint();
                        Display.name[x][y].setText(Properties.viewerText[1]);
                        Display.name[x][y].setFont(new Font("Tahoma", Font.BOLD, 9));
                        Display.name[x][y].repaint();
                        types[x][y].setText(Properties.typesText[1]);
                    }

                    // defining elephant blocks
                    if (Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findBluE[0])
                        && Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findBluE[1])) {
                        Display.animal[x][y].setBackground(Properties.bluE);
                        Display.animal[x][y].setBorder(BorderFactory.createRaisedBevelBorder());
                        Display.animal[x][y].repaint();
                        Display.name[x][y].setText(Properties.viewerText[1]);
                        Display.name[x][y].setFont(new Font("Tahoma", Font.BOLD, 9));
                        Display.name[x][y].repaint();
                        types[x][y].setText(Properties.typesText[2]);
                    }

                    // defining panda blocks
                    if (Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findWhiP[0])
                        && Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findWhiP[1])) {
                        Display.animal[x][y].setBackground(Properties.whiP);
                        Display.animal[x][y].setBorder(BorderFactory.createRaisedBevelBorder());
                        Display.animal[x][y].repaint();
                        Display.name[x][y].setText(Properties.viewerText[1]);
                        Display.name[x][y].setFont(new Font("Tahoma", Font.BOLD, 9));
                        Display.name[x][y].repaint();
                        types[x][y].setText(Properties.typesText[3]);
                    }

                    // defining monkey blocks
                    if (Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findRedM[0])
                        && Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findRedM[1])) {
                        Display.animal[x][y].setBackground(Properties.redM);
                        Display.animal[x][y].setBorder(BorderFactory.createRaisedBevelBorder());
                        Display.animal[x][y].repaint();
                        Display.name[x][y].setText(Properties.viewerText[1]);
                        Display.name[x][y].setFont(new Font("Tahoma", Font.BOLD, 9));
                        Display.name[x][y].repaint();
                        types[x][y].setText(Properties.typesText[4]);
                    }

                    // defining lion blocks
                    if (Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findOraL[0])
                        && Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findOraL[1])) {
                        Display.animal[x][y].setBackground(Properties.oraL);
                        Display.animal[x][y].setBorder(BorderFactory.createRaisedBevelBorder());
                        Display.animal[x][y].repaint();
                        Display.name[x][y].setText(Properties.viewerText[1]);
                        Display.name[x][y].setFont(new Font("Tahoma", Font.BOLD, 9));
                        Display.name[x][y].repaint();
                        types[x][y].setText(Properties.typesText[5]);
                    }

                    // defining crocodile blocks
                    if (Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findGreC[0])
                        && Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findGreC[1])) {
                        Display.animal[x][y].setBackground(Properties.greC);
                        Display.animal[x][y].setBorder(BorderFactory.createRaisedBevelBorder());
                        Display.animal[x][y].repaint();
                        Display.name[x][y].setText(Properties.viewerText[1]);
                        Display.name[x][y].setFont(new Font("Tahoma", Font.BOLD, 9));
                        Display.name[x][y].repaint();
                        types[x][y].setText(Properties.typesText[6]);
                    }

                    // defining giraffe blocks
                    if (Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findYelG[0])
                        && Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findYelG[1])) {
                        Display.animal[x][y].setBackground(Properties.yelG);
                        Display.animal[x][y].setBorder(BorderFactory.createRaisedBevelBorder());
                        Display.animal[x][y].repaint();
                        Display.name[x][y].setText(Properties.viewerText[1]);
                        Display.name[x][y].setFont(new Font("Tahoma", Font.BOLD, 9));
                        Display.name[x][y].repaint();
                        types[x][y].setText(Properties.typesText[7]);
                    }

                    // defining rabbit blocks
                    if (Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findPinR[0])
                        && Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findPinR[1])) {
                        Display.animal[x][y].setBackground(Properties.pinR);
                        Display.animal[x][y].setBorder(BorderFactory.createRaisedBevelBorder());
                        Display.animal[x][y].repaint();
                        Display.name[x][y].setText(Properties.viewerText[1]);
                        Display.name[x][y].setFont(new Font("Tahoma", Font.BOLD, 9));
                        Display.name[x][y].repaint();
                        types[x][y].setText(Properties.typesText[8]);
                    }

                    // defining annoying blocks
                    if (Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findAnnB[0])
                        && Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findAnnB[1])) {
                        Display.animal[x][y].setBackground(Properties.annB);
                        Display.animal[x][y].setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Display.grids[x][y].getBackground(), 1),
                                                                                         BorderFactory.createLoweredBevelBorder()));
                        Display.animal[x][y].repaint();
                        Display.name[x][y].setText(Properties.viewerText[2]);
                        Display.name[x][y].setFont(new Font("Tahoma", Font.BOLD, 9));
                        Display.name[x][y].repaint();
                        types[x][y].setText(Properties.typesText[9]);
                    }

                    // defining helper blocks
                    if (Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findHelB[0])
                        && Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findHelB[1])) {
                        Display.animal[x][y].setBackground(Properties.helB);
                        Display.animal[x][y].setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Display.grids[x][y].getBackground(), 1),
                                                                                         BorderFactory.createLoweredBevelBorder()));
                        Display.animal[x][y].repaint();
                        Display.name[x][y].setText(Properties.viewerText[3]);
                        Display.name[x][y].setFont(new Font("Tahoma", Font.BOLD, 9));
                        Display.name[x][y].repaint();
                        types[x][y].setText(Properties.typesText[10]);
                    }

                    // defining eraser blocks
                    if (Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findEraB[0])
                        && Arrays.toString(boardData.subList(start, finish).toArray(new String[z])).contains(Properties.findEraB[1])) {
                        Display.animal[x][y].setBackground(Properties.eraB);
                        Display.animal[x][y].setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Display.grids[x][y].getBackground(), 1),
                                                                                         BorderFactory.createLoweredBevelBorder()));
                        Display.animal[x][y].repaint();
                        Display.name[x][y].setText(Properties.viewerText[4]);
                        Display.name[x][y].setFont(new Font("Tahoma", Font.BOLD, 9));
                        Display.name[x][y].repaint();
                        types[x][y].setText(Properties.typesText[11]);
                    }
                }
            }

            // refreshing captured game board
            boardCaptured.flush();
            boardData.clear();
        }

        // RGB processing methods
        public int [] getRGB(BufferedImage image, int x, int y) {
            int rgb = image.getRGB(x, y);
            int rgbArray[] = new int[3];
            rgbArray[0] = (rgb >> 16) & 0xff;   // red
            rgbArray[1] = (rgb >> 8) & 0xff;    // green
            rgbArray[2] = rgb & 0xff;           // blue
            return rgbArray;
        }
    };
}