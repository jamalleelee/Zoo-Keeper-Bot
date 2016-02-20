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
import java.awt.Font;
import java.util.Random;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * additional class for all string, integer, etc.
 * all application's properties
 * @author Gurisa Yudistira M.
 */
public class Properties {

    // final integers for loops
    static final int the_8 = 8;

    // random generator
    static Random random1 = new Random();
    static Random random2 = new Random();

    // multi purpose random color
    static Color randomColor() { return new Color(random1.nextInt(255), random1.nextInt(255), random1.nextInt(255), 255); }

    // multi purpose random strings
    static void movieQuotes() { Window.headline.setText(movieStrings[random2.nextInt(64)]); }
    static void botQuotes() { Window.headline.setText(botStrings[random2.nextInt(53)]); }

    // random movieStrings quotes
    static final String [] movieStrings = {
        "The Force is strong with this one.", "Hey, Joe, want me to shoot this guy?", "The eyes, Chico. They never lie.", "Run, Forrest, run!",
        "That’s my secret, I’m always angry.", "He slimed me!", "Great Scott!", "What? What the hell is a gigawatt?", "Stupid is as stupid does.",
        "Come with me if you want to live.", "We are who we choose to be.", "Now, let’s just calm down.", "You call this archaeology?", "Puny God.",
        "ET phone home.", "Do or do not, there is no try.", "I am Groot...", "I am Spartacus!", "Never go full retard.", "I'm the king of the world!",
        "Are you watching closely?", "Live long and prosper.", "The horror... The horror...", "We all lie to ourselves to be happy.", "Why so serious?",
        "I see dead people...", "I want to play a game...", "Bond. James Bond.", "I was cured, all right!", "I'll be back.", "May the Force be with you.",
        "Be afraid. Be very afraid.", "You're goddamn right!", "Houston, we have a problem.", "It's alive! It's alive!", "Yippiee ki-yay, motherfucker!!!",
        "It was beauty killed the beast.", "He's so fluffy, I'm gonna die!", "Rosebud...", "Say hello to my little friend!", "To infinity... and beyond!",
        "Today, live's good.", "You go Glen Coco!", "Elementary, my dear Watson.", "You're gonna need a bigger boat.", "I had a bad feeling about this.",
        "I love lamp.", "Surely you can't be serious.", "Why'd it have to be snakes?", "May the schwartz be with you!", "Fish are friends, not food.",
        "There is no spoon.", "Welcome. To the desert of the real.", "Chewie, we are home.", "Fear is why you fail.", "Not every man really lives.",
        "D-J-A-N-G-O. The D is silent.", "Happiness is only real when shared.", "Desperate times, desperate measures.", "Dude, where is my car?",
        "Tell me, do you bleed?", "You shall not pass!", "Get busy living, or get busy dying.", "Go ahead, make my day.", "Heeere’s Johnny!",
    };

    // random bot quotes
    static final String [] botStrings = {
        "I can't grow, I'm FINAL.", "public static vomit...", "if true, run! else, interrupt!", "While true, can I return?",
        "PHP? I prefer PHD.", "My brain isn't SYNCHRONIZED!", "Maybe, I'm just TRANSIENT...", "I have a brother called Jarvis.",
        "My creator have an IDEa.", "My only dream is to be T-800.", "Dude, you are not my bro.", "I had a friend called IE. Had.",
        "I miss being an ALPHA.", "I love my classes.", "I can't see whitespace!", "I'm whitespace blind 8<", "this. ...THIS WHAT!?",
        "I don't like close button.", "Haha, I am too punny!", "java is soo underrated!", "I'm not your Vault Boy!", "DO NOT CHEAT!!!",
        "I can hear my methods! :O", "Let that swing...", "What did you do to me?", "I will report you for using me.", "That's it! Do!",
        "Do you expect me to VOID?", "Please Upgrade to Windows 10 :v", "Sorry for being soo simple.", "I never had Pointer Exceptions.",
        "You're soo BASIC.", "Hello, World! Stop Warmongering!", "I am not VOLATILE!", "Stop clicking my body!", "I do not like water.",
        "Wait, What?", "I can be sarSTATIC sometimes.", "Who are you, mate?", "I'm just a codes inside :(", "Javanese! not Japanese!",
        "Kame-Hame-Haaa!!!", "I'm over 9000!!!", "My creator is Javanese.", "He created me with Java.", "My Strings are not float!",
        "'I'm heavy' said no jar ever.", "Am I too classy for you?", "When I was born, I'm framed.", "Someday, I'll be a legacy.",
        "I should catch all exceptions.", "LOL my creator is soo noob.", "You should be working!!!", "Are you a girl or a boy?",
    };

    // index typesText & number      0       1       2       3       4       5       6       7       8       9       10      11
    static final String [] typesText = { "nulZ", "purH", "bluE", "whiP", "redM", "oraL", "greC", "yelG", "pinR", "annB", "helB", "eraB" };

    // color to find
    static final String [] findNulZ = { "250, 252, 222", "252, 245, 192" };   // empty
    static final String [] findPurH = { "72, 12, 96", "208, 112, 168" };      // hipopotamus
    static final String [] findBluE = { "128, 200, 248", "8, 32, 120" };      // elephant
    static final String [] findWhiP = { "24, 24, 24", "249, 248, 248" };      // panda
    static final String [] findRedM = { "248, 96, 70", "80, 16, 0" };         // monkey
    static final String [] findOraL = { "248, 168, 0", "64, 12, 0" };         // lion
    static final String [] findGreC = { "1, 56, 32", "72, 208, 0" };          // crocodile
    static final String [] findYelG = { "72, 24, 0", "248, 248, 4" };         // giraffe
    static final String [] findPinR = { "248, 200, 232", "248, 229, 242" };   // rabbit
    static final String [] findAnnB = { "248, 208, 136", "48, 0, 8" };        // annoying
    static final String [] findHelB = { "255, 128, 0", "184, 72, 1" };        // helper
    static final String [] findEraB = { "0, 216, 128", "1, 127, 85" };        // eraser

    // viewer display typesText
    static final String [] viewerText = {"", "O", "X", "!!", "?"};

    // special blocks color variabels
    static final Color nulX = new Color(250, 252, 222);   // empty background light
    static final Color nulY = new Color(252, 245, 192);   // empty background dark
    static final Color nulZ = new Color(24, 24, 24);      // empty black
    static final Color eraB = new Color(0, 216, 128);     // eraser
    static final Color helB = new Color(255, 128, 0);     // helper
    static final Color annB = new Color(248, 208, 136);   // annoying

    // puzzle blocks color variabels
    static final Color purH = new Color(208, 112, 168);   // hippopotamus
    static final Color bluE = new Color(128, 200, 248);   // elephant
    static final Color whiP = new Color(249, 248, 248);   // panda
    static final Color redM = new Color(248, 96 ,70);     // monkey
    static final Color oraL = new Color(248, 168, 0);     // lion
    static final Color greC = new Color(72, 208, 0);      // crocodile
    static final Color yelG = new Color(248, 248, 4);     // giraffe
    static final Color pinR = new Color(248, 200, 232);   // rabbit (event)

    // puzzle blocks type variabels
    static final int X = 1;
    static final int B = 2;
    static final int H = 3;
    static final int E = 4;
    static final int P = 5;
    static final int M = 6;
    static final int L = 7;
    static final int C = 8;
    static final int G = 9;
    static final int R = 0;

    // informations text
    protected static final String text =
              "\n"
            + "   •••••••••••••••••••••••••••••••••••••••••••••\n"
            + "   This software is created for educational, lea\n"
            + "   rning, and exercise purpose only. If you love\n"
            + "   the actual game, please try to play it withou\n"
            + "   t cheating to preserve it and its communities\n"
            + "   •••••••••••••••••••••••••••••••••••••••••••••\n"
            + "\n"
            + "   ---------------------------------------------\n"
            + "   DOCUMENTATION\n"
            + "   ---------------------------------------------\n"
            + "   ZOO KEEPER BOT\n"
            + "   Version: 1.0\n"
            + "   © 2016 Gurisa Yudistira Mintarno\n"
            + "\n"
            + "   - video: <link>\n"
            + "   - github: <link>\n"
            + "\n"
            + "   This project is released under whatever Licen\n"
            + "   sing you want to justified.\n"
            + "\n"
            + "   ---------------------------------------------\n"
            + "   ABOUT\n"
            + "   ---------------------------------------------\n"
            + "   Java application for solving ZooKeeper Battle\n"
            + "   puzzle game runs in Bluestack Android emulato\n"
            + "   r.\n"
            + "\n"
            + "   This type of application is selected for exer\n"
            + "   cising because it contains a lot subjects for\n"
            + "   learn programming in java.\n"
            + "\n"
            + "   The Distributed CODE and demo APPLICATION wou\n"
            + "   ld not include all ACTIONS method.\n"
            + "\n"
            + "   Points to remembers:\n"
            + "\n"
            + "   - Using only default libraries is intended fo\n"
            + "     r learning basic programming and java, that\n"
            + "     is why mouse robot can only be paused if mo\n"
            + "     use pointer is dragged outside puzzle grids\n"
            + "     (no global system shortcut to stop it).\n"
            + "\n"
            + "   - No shapes recognizer library means it can't\n"
            + "     recognize shaded (grey colored) blocks.\n"
            + "\n"
            + "   - The blocks display refresh rate is always e\n"
            + "     qual to capture method delay which is the s\n"
            + "     elected delay."
            + "\n"
            + "   - The mouse's movement and clicks delay is al\n"
            + "     ways equal to thirds of selected delay.\n"
            + "\n"
            + "   ---------------------------------------------\n"
            + "   SOFTWARE WORKFLOW\n"
            + "   ---------------------------------------------\n"
            + "   - Capture button will capture board in maximi\n"
            + "     zed Blustack on 1366x768 windows size.\n"
            + "\n"
            + "   - Dividing Captured board per blocks and regi\n"
            + "     ster them to as helper, animal, or boss.\n"
            + "\n"
            + "   - Paint the blocks on viewer and put types in\n"
            + "     to it.\n"
            + "\n"
            + "   - Battle button will search for matching bloc\n"
            + "     ks, and calculate moves.\n"
            + "\n"
            + "   - Search for modals block (●), companion bloc\n"
            + "     ks (■), posibble matching blocks (♦), and i\n"
            + "     gnore imposibble blocks (□):\n"
            + "\n"
            + "     □ ♦ □ □ ♦ □\n"
            + "     ♦ □ ● ■ □ ♦    <- ● ■ pointed to the \"LEFT\"\n"
            + "     □ ♦ □ □ ♦ □\n"
            + "\n"
            + "   - On the example above, modals are pointed to\n"
            + "     the \"LEFT\", other types including 90° (poin\n"
            + "     ted \"UP\"), 180° (pointed \"RIGHT\"), and 270°\n"
            + "     (pointed \"DOWN\") in clockwise rotations.\n"
            + "\n"
            + "   - Foods across and then food behind modal are\n"
            + "     always calculated first, and then the upper\n"
            + "     left, then continue in clockwise.\n"
            + "\n"
            + "     □ ♦\n"
            + "     ♦ □              <- pointed to the \"LEFT\"\n"
            + "     □ ♦\n"
            + "\n"
            + "   - On the example above, there's no modals, it\n"
            + "     just tried to find triangle mess. It's also\n"
            + "     had 90°, 180°, and 270° CW rotations.\n"
            + "\n"
            + "   - Battle method will find same types by simpl\n"
            + "     y matching strings inputed on game grids.\n"
            + "\n"
            + "   - And make moves according to blocks position\n"
            + "     from data above.\n"
            + "\n"
            + "   - Capture operations sequence:\n"
            + "     1. Painting viewer grids.\n"
            + "     2. Calling Capture.\n"
            + "     3. Screenshooting game board.\n"
            + "     4. Slicing it as blocks.\n"
            + "     5. Inputing blocks data.\n"
            + "     6. Paint blocks.\n"
            + "     7. Repeat from 2.\n"
            + "\n"
            + "   - Battle operations sequence:\n"
            + "     1. Ignore empty grids.\n"
            + "     2. Clicking helper blocks.\n"
            + "     3. Matching animal or annoying blocks.\n"
            + "     4. Clicking eraser blocks.\n"
            + "     5. Repeat from 1.\n"
            + "\n"
            + "   ---------------------------------------------\n"
            + "   ISSUES\n"
            + "   ---------------------------------------------\n"
            + "   - Only works in 1366x768 window resolution in\n"
            + "     maximized Blustack window.\n"
            + "\n"
            + "   - Using method that would always ignore other\n"
            + "     best matching possibilities. (see below)\n"
            + "\n"
            + "   - There are several case of block positions b\n"
            + "     ut it will never be implemented, they are: \n"
            + "\n"
            + "     ♦    □ ■ □ □    □ □ ♦ □ □\n"
            + "     □    □ ● □ □    ■ ■ □ ■ ■\n"
            + "     ●    ♦ □ ■ ■    □ □ ● □ □\n"
            + "     ■    □ ♦ □ □    □ □ ■ □ □\n"
            + "\n"
            + "     □ ♦ □    □ □ ♦ □ □\n"
            + "     ● □ ♦    ■ ■ □ ● ■\n"
            + "     □ ♦ □    □ □ ♦ □ □\n"
            + "\n"
            + "   - These positions are obsolete, because they'\n"
            + "     re already occur in position method used.\n"
            + "\n"
            + "   ---------------------------------------------\n"
            + "   TO DO LIST (CANCELED)\n"
            + "   ---------------------------------------------\n"
            + "   - Create a button for changing displayed bloc\n"
            + "     ks alpha values. (? button)\n"
            + "     • unimportant.\n"
            + "\n"
            + "   - Use card layout for this dialogs window, so\n"
            + "     it can interchangeably switched between the\n"
            + "     main window frame.\n"
            + "     • too lazy to do it.\n"
            + "\n"
            + "   - Programatically finds grid so it can flexib\n"
            + "     ly used in any screen sizes.\n"
            + "     • that's too much for first exercise.\n"
            + "\n"
            + "   - Checking HSB/HSV (faster?) value rather tha\n"
            + "     n using predefined RGB values.\n"
            + "     • to be practiced on next application.\n"
            + "\n"
            + "   ---------------------------------------------\n"
            + "   THANKS TO\n"
            + "   ---------------------------------------------\n"
            + "   - Stack Overflow\n"
            + "     and for people who ask anything here.\n"
            + "       <http://stackoverflow.com/>\n"
            + "\n"
            + "   - Tuttorials Point\n"
            + "     for great tuttorials.\n"
            + "       <http://www.tutorialspoint.com/>\n"
            + "\n"
            + "   - Oracle Documentation\n"
            + "     really well documented. (or not?)\n"
            + "       <http://docs.oracle.com/>\n"
            + "\n"
            + "   - Derek Banas\n"
            + "     fast and powerfull tuttorials, not reco\n"
            + "     mmended for begginers. (like me)\n"
            + "       <https://www.youtube.com/channel/UCwRXb5d\n"
            + "       UK4cvsHbx-rGzSgw>\n"
            + "\n"
            + "   - Casper Chang\n"
            + "     for his bot example.\n"
            + "       <https://github.com/casperchang>\n"
            + "\n"
            + "   - David Doran\n"
            + "     for his bot codes example.\n"
            + "       <https://github.com/daviddoran>\n"
            + "\n"
            + "   - Lee Jason\n"
            + "     for his bot codes example.\n"
            + "       <https://github.com/lee-jason>\n"
            + "\n"
            + "   - Bryan Chauvin\n"
            + "     Java tuttorials using Eclipse.\n"
            + "       <https://www.youtube.com/channel/UCEUdgJS\n"
            + "       qHi-mwFLprlIWoXA>\n"
            + "\n"
            + "   - Stanford Course: Programming Methodology.\n"
            + "     Instructor: Professor Mehran Sahami.\n"
            + "     (recomended for zero experience learner)\n"
            + "       <https://youtu.be/KkMDCCdjyW8?list=PL6C11\n"
            + "       012B1B464EC5>\n"
            + "\n"
            + "   - And other sites, there's a lot but i forgot\n"
            + "     to bookmark.\n"
            + "\n"
            + "   ---------------------------------------------\n"
            + "   CHANGE LOG\n"
            + "   ---------------------------------------------\n"
            + "   1.0\n"
            + "     DEMO: Saturday, 20 February 2016, 10:15:13\n"
            + "     - adding triangle methods to solver\n"
            + "     - removing some action methods\n"
            + "     - demoware / shareware / crippleware\n"
            + "\n"
            + "     FINAL: Saturday, 20 February 2016, 10:10:10\n"
            + "     - adding triangle method to solver\n"
            + "     - final / obsolete / legacy\n"
            + "\n"
            + "   BETA: Saturday, 20 February 2016, 05:19:54\n"
            + "   - adding mouse idle if grid is empty\n"
            + "   - recreating blocks checkers\n"
            + "\n"
            + "   BETA: Saturday, 20 February 2016, 01:23:40\n"
            + "   - beta testing\n"
            + "\n"
            + "   ALPHA: Friday, 19 February 2016, 13:04:34\n"
            + "   - adding battle solver methods\n"
            + "\n"
            + "   ALPHA: Monday, 15 February 2016, 19:34:23\n"
            + "   - recreating all loops to 2D loops\n"
            + "   - adding random quotes and robot quotes"
            + "\n"
            + "   ALPHA: Thursday, ‎11 ‎February ‎2016, ‏‎07:44:12\n"
            + "   - adding blocks title\n"
            + "   - adding info button\n"
            + "\n"
            + "   ALPHA: Friday, ‎5 ‎February ‎2016, 09:23:43\n"
            + "   - adding buttons auto enable/disable\n"
            + "   - adding background grids\n"
            + "\n"
            + "   ALPHA: Sunday, ‎31 ‎January ‎2016, 13:22:13\n"
            + "   - adding link for viewer and capture methods\n"
            + "\n"
            + "   ALPHA: Friday, ‎29 ‎January ‎2016, 17:11:01\n"
            + "   - recreating software workflows\n"
            + "   - adding capture methods\n"
            + "\n"
            + "   ALPHA: Saturay, ‎23 ‎January ‎2016, 20:08:48\n"
            + "   - adding viewer\n"
            + "\n"
            + "   PRE-ALPHA: Monday, ‎11 January ‎2016, ‏‎23:48:03\n"
            + "   - starting project\n"
            + "\n"
            + "   •••••••••••••••••••••••••••••••••••••••••••••\n"
            + "   really need to reads about software licensing\n"
            + "   •••••••••••••••••••••••••••••••••••••••••••••\n";

    // informations window
    static JDialog infoDialog = new JDialog(Window.mainFrame, "Zoo Keeper Bot Information");
    static final JTextArea infoText = new JTextArea(text);
    static JScrollPane scroll = new JScrollPane (infoText,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    static void info() {
        infoText.setEditable(false);
        infoText.setFont(new Font("CONSOLAS", Font.PLAIN, 12));
        infoDialog.setSize(390,410);
        infoDialog.setLocationRelativeTo(null);
        infoDialog.setAlwaysOnTop(true);
        infoDialog.setResizable(false);
        infoDialog.add(scroll);
        infoDialog.setVisible(true);
    }

    // delays int
    static final int initial = 250;
    static int delay;

    // delay- methods
    static void speedDw() {
        if (initial + delay > 25) {
            delay -= 25;
            Window.delayDisplay.revalidate();
            Window.delayDisplay.setText("±" + (initial + delay));
            Window.delayDisplay.setToolTipText("capture method delay in milisecond (" + ((initial + delay) / 3) + " ms for mouse pointer action)");
        }
    }

    // delay+ methods
    static void speedUp() {
        if (initial + delay < 500) {
            delay += 25;
            Window.delayDisplay.revalidate();
            Window.delayDisplay.setText("±" + (initial + delay));
            Window.delayDisplay.setToolTipText("capture method delay in milisecond (" + ((initial + delay) / 3) + " ms for mouse pointer action)");
        }
    }
}