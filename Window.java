/**
 * package name
 * this package name, and Zoo Keeper Bot name is just an identifier
 * this project not intended to continously beats ZooKeeper Battle PvP modes
 * this application is only purposed for learning programming and java
 * any Robot and RobotBrain source codes would be disabled in released .jar
 */
package ZOO_KEEPER_BOT;

// imported library
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

/**
 * class for the main application window and components
 * for calling main frame and components
 * functions of buttons and swing
 * @author Gurisa Yudistira M.
 */
public class Window {

    // stating variabels
    static final JFrame mainFrame = new JFrame("ZOO KEEPER BOT");
    static final JToggleButton captureButton = new JToggleButton("CAPTURE");
    static final JToggleButton battleButton = new JToggleButton("BATTLE");
    public final JButton infoButton = new JButton("i");
    public final JButton colorButton = new JButton("?");
    public final JButton delayDwButton = new JButton("delay-");
    public final JButton delayUpButton = new JButton("delay+");
    static final JPanel viewerBoard = new JPanel(new GridLayout(8, 8, 0, 0));
    static JTextField delayDisplay;
    static JLabel headline = new JLabel();

    // initialize main frame
    public void initMainFrame() { Container container = mainFrame.getContentPane(); container.setLayout(null); }

    // other initiators
    public void initViewer() { new Display().display.start(); }     // initialize display + capture
    public void initBattle() { new Battle().battle.start(); }       // initialize battle
    public void initEaster() { new Battle().easter.start();}        // initialize easter
    public void initInfo() { Properties.info(); }                   // initialize info frame
    public void delayDw() { Properties.speedDw(); }                 // initialize delay-
    public void delayUp() { Properties.speedUp(); }                 // initialize delay+

    // Main Frame looks & state
    @SuppressWarnings("Convert2Lambda")
    public Window() {

        // main frame looks & state
        initMainFrame();
        mainFrame.setSize(237, 472);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setAlwaysOnTop(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

        // capture button looks & state
        captureButton.setToolTipText("capture the board");
        captureButton.isDoubleBuffered();
        captureButton.setFocusPainted(false);
        captureButton.setRolloverEnabled(true);
        captureButton.setForeground(Color.BLACK);
        captureButton.setBorderPainted(false);
        captureButton.setFont(new Font("CONSOLAS", Font.BOLD, 18));
        captureButton.setMargin(new Insets(0, 0, 0, 0));
        captureButton.setBounds(8, 356, 104, 54);
        captureButton.setVisible(true);
        mainFrame.add(captureButton);

        // capture button action
        captureButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent captureButtonEvent) {
                if (captureButtonEvent.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Capture Button is selected: " + captureButton.isSelected());
                    captureButton.setToolTipText("waiting for battle button...");
                    battleButton.setToolTipText("ready for battle");
                    battleButton.setEnabled(true);
                    Properties.botQuotes();
                    initViewer();
                }

                if (captureButtonEvent.getStateChange() == ItemEvent.DESELECTED) {
                    System.out.println("Capture Button is selected: " + captureButton.isSelected());
                    captureButton.setToolTipText("capture the board");
                    captureButton.setForeground(Color.BLACK);
                    battleButton.setToolTipText("please capture the board first");
                    battleButton.setForeground(Color.GRAY);
                    battleButton.setEnabled(false);
                    headline.setText("•••  © 2016 Gurisa Yudistira M.  •••");
                    headline.setForeground(Color.BLACK);

                    // cleaning display board
                    viewerBoard.revalidate();
                    viewerBoard.removeAll();
                    viewerBoard.repaint();
                }
            }
        });

        // battle button looks & state
        battleButton.setToolTipText("please capture the board first");
        battleButton.isDoubleBuffered();
        battleButton.setFocusPainted(false);
        battleButton.setRolloverEnabled(true);
        battleButton.setForeground(Color.GRAY);
        battleButton.setBorderPainted(false);
        battleButton.setFont(new Font("CONSOLAS", Font.BOLD, 18));
        battleButton.setMargin(new Insets(0, 0, 0, 0));
        battleButton.setBounds(118, 356, 104, 54);
        battleButton.setEnabled(false);
        battleButton.setVisible(true);
        mainFrame.add(battleButton);

        // battle button action
        battleButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent battleButtonEvent) {
                if (battleButtonEvent.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Battle Button is selected: " + battleButton.isSelected());
                    battleButton.setToolTipText("solving the mess...");
                    captureButton.setToolTipText("please stop the battle first");
                    captureButton.setForeground(Color.GRAY);
                    captureButton.setEnabled(false);
                    Properties.botQuotes();
                    initBattle();
                    initEaster();
                }

                if (battleButtonEvent.getStateChange() == ItemEvent.DESELECTED) {
                    System.out.println("Battle Button is selected: " + battleButton.isSelected());
                    battleButton.setToolTipText("ready for battle");
                    battleButton.setForeground(Color.BLACK);
                    captureButton.setToolTipText("waiting for battle button...");
                    captureButton.setForeground(Color.BLACK);
                    captureButton.setEnabled(true);
                    headline.setText("•••  © 2016 Gurisa Yudistira M. •••");
                    headline.setForeground(Color.BLACK);
                }
            }
        });

        // info button looks & state
        infoButton.setToolTipText("application information");
        infoButton.setFocusPainted(false);
        infoButton.setRolloverEnabled(true);
        infoButton.setBorderPainted(false);
        infoButton.setFont(new Font("CONSOLAS", Font.BOLD, 10));
        infoButton.setMargin(new Insets(0, 0, 0, 0));
        infoButton.setBounds(8, 316, 24, 24);
        infoButton.setVisible(true);
        mainFrame.add(infoButton);

        // battle button action
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent infoActionEvent) {
                System.out.println("Info Button is clicked: " + infoButton.isEnabled());
                Properties.botQuotes();
                initInfo();
            }
        });

        // color button looks & state
        colorButton.setToolTipText("unimplemented");
        colorButton.setFocusPainted(false);
        colorButton.setRolloverEnabled(true);
        colorButton.setBorderPainted(false);
        colorButton.setFont(new Font("CONSOLAS", Font.BOLD, 10));
        colorButton.setMargin(new Insets(0, 0, 0, 0));
        colorButton.setBounds(38, 316, 24, 24);
        colorButton.setVisible(true);
        colorButton.setEnabled(false); // IMPLEMENTATION
        mainFrame.add(colorButton);

        // info button action
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent colorActionEvent) {
                System.out.println("Color Button is clicked: " + colorButton.isEnabled());
                Properties.botQuotes();
            }
        });

        // delay- button looks & state
        delayDwButton.setToolTipText("decrese delay");
        delayDwButton.setFocusPainted(false);
        delayDwButton.setRolloverEnabled(true);
        delayDwButton.setBorderPainted(false);
        delayDwButton.setFont(new Font("CONSOLAS", Font.BOLD, 10));
        delayDwButton.setMargin(new Insets(0, 0, 0, 0));
        delayDwButton.setBounds(79, 316, 48, 24);
        delayDwButton.setVisible(true);
        mainFrame.add(delayDwButton);

        // delay- button action
        delayDwButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent speedDwActionEvent) {
                System.out.println("Delay- Button is clicked: " + delayDwButton.isEnabled());
                Properties.botQuotes();
                delayDw();

                if (Properties.initial + Properties.delay == 25) {
                    delayDwButton.setEnabled(false);
                }

                if (Properties.initial + Properties.delay == 475) {
                    delayUpButton.setEnabled(true);
                }
            }
        });

        // delay+ button looks & state
        delayUpButton.setToolTipText("increase delay");
        delayUpButton.setFocusPainted(false);
        delayUpButton.setRolloverEnabled(true);
        delayUpButton.setBorderPainted(false);
        delayUpButton.setFont(new Font("CONSOLAS", Font.BOLD, 10));
        delayUpButton.setMargin(new Insets(0, 0, 0, 0));
        delayUpButton.setBounds(174, 316, 48, 24);
        delayUpButton.setVisible(true);
        mainFrame.add(delayUpButton);

        // delay+ button action
        delayUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent speedUpActionEvent) {
                System.out.println("Delay+ Button is clicked: " + delayUpButton.isEnabled());
                Properties.botQuotes();
                delayUp();

                if (Properties.initial + Properties.delay == 500) {
                    delayUpButton.setEnabled(false);
                }

                if (Properties.initial + Properties.delay == 50) {
                    delayDwButton.setEnabled(true);
                }
            }
        });

        // display board container
        viewerBoard.setBounds(15, 15, 200, 200);
        viewerBoard.setVisible(true);
        mainFrame.add(viewerBoard);

        // display board edge
        JPanel viewerPanel = new JPanel();
        viewerPanel.setBackground(new Color(100, 100, 100));
        viewerPanel.setBounds(10, 10, 210, 210);
        viewerPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        viewerPanel.setVisible(true);
        mainFrame.add(viewerPanel);

        // delay display
        delayDisplay = new JTextField();
        delayDisplay.setEditable(false);
        delayDisplay.setFont(new Font("CONSOLAS", Font.BOLD, 11));
        delayDisplay.setToolTipText("capture method delay in milisecond (" + ((Properties.initial + Properties.delay) / 3) + " ms for mouse pointer action)");
        delayDisplay.setHorizontalAlignment(SwingConstants.CENTER);
        delayDisplay.setText("±" + (Properties.initial + Properties.delay));
        delayDisplay.setBounds(133, 318, 35, 20);
        delayDisplay.setVisible(true);
        mainFrame.add(delayDisplay);

        // application separators
        JSeparator line1 = new JSeparator();
        JSeparator line2 = new JSeparator();
        JSeparator line3 = new JSeparator(SwingConstants.VERTICAL);
        JSeparator line4 = new JSeparator();
        JSeparator line5 = new JSeparator();
        JSeparator line6 = new JSeparator();
        JSeparator line7 = new JSeparator();
        line1.setBounds(5, 228, 220, 50);
        line2.setBounds(5, 308, 220, 50);
        line3.setBounds(70, 313, 50, 30);
        line4.setBounds(100, 324, 100, 50);
        line5.setBounds(100, 330, 100, 50);
        line6.setBounds(5, 347, 220, 50);
        line7.setBounds(5, 418, 220, 50);
        mainFrame.add(line1);
        mainFrame.add(line2);
        mainFrame.add(line3);
        mainFrame.add(line4);
        mainFrame.add(line5);
        mainFrame.add(line6);
        mainFrame.add(line7);

        // labels of application and versioning
        JLabel label1 = new JLabel("ZOO KEEPEER BOT");
        JLabel label2 = new JLabel("1.0 DEMO");
        JLabel label3 = new JLabel("• for educational purpose only •");
        JLabel label4 = new JLabel("START : PUT POINTER INSIDE GRID");
        JLabel label5 = new JLabel("PAUSE : PUT POINTER OUTSIDE GRID");
        label1.setFont(new Font("CONSOLAS", Font.BOLD, 14));
        label2.setFont(new Font("CONSOLAS", Font.ITALIC, 12));
        label3.setFont(new Font("CONSOLAS", Font.ITALIC, 11));
        label4.setFont(new Font("CONSOLAS", Font.BOLD, 10));
        label5.setFont(new Font("CONSOLAS", Font.BOLD, 10));
        label1.setBounds(10, 232, 210, 20);
        label2.setBounds(10, 247, 210, 20);
        label3.setBounds(10, 260, 210, 20);
        label4.setBounds(5, 277, 220, 20);
        label5.setBounds(5, 287, 220, 20);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label5.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setForeground(Color.BLUE);
        label5.setForeground(Color.RED);
        mainFrame.add(label1);
        mainFrame.add(label2);
        mainFrame.add(label3);
        mainFrame.add(label4);
        mainFrame.add(label5);

        // headline label & text
        headline.setFont(new Font("CONSOLAS", Font.BOLD + Font.ITALIC, 11));
        headline.setBounds(5, 422, 220, 20);
        headline.setText("•••  © 2016 Gurisa Yudistira M. •••");
        headline.setHorizontalAlignment(SwingConstants.CENTER);
        mainFrame.add(headline);
    }
}