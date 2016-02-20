•••••••••••••••••••••••••••••••••••••••••••••
This software is created for educational, lea
rning, and exercise purpose only. If you love
the actual game, please try to play it withou
t cheating to preserve it and its communities
•••••••••••••••••••••••••••••••••••••••••••••

---------------------------------------------
DOCUMENTATION
---------------------------------------------
ZOO KEEPER BOT
Version: 1.0
© 2016 Gurisa Yudistira Mintarno

- video: <link>
- github: <link>

This project is released under whatever Licen
sing you want to justified.

---------------------------------------------
ABOUT
---------------------------------------------
Java application for solving ZooKeeper Battle
puzzle game runs in Bluestack Android emulato
r.

This type of application is selected for exer
cising because it contains a lot subjects for
learn programming in java.

The Distributed CODE and demo APPLICATION wou
ld not include all ACTIONS method.

Points to remembers:

- Using only default libraries is intended fo
  r learning basic programming and java, that
  is why mouse robot can only be paused if mo
  use pointer is dragged outside puzzle grids
  (no global system shortcut to stop it).

- No shapes recognizer library means it can't
  recognize shaded (grey colored) blocks.

- The blocks display refresh rate is always e
  qual to capture method delay which is the s
  elected delay."

- The mouse's movement and clicks delay is al
  ways equal to thirds of selected delay.

---------------------------------------------
SOFTWARE WORKFLOW
---------------------------------------------
- Capture button will capture board in maximi
  zed Blustack on 1366x768 windows size.

- Dividing Captured board per blocks and regi
  ster them to as helper, animal, or boss.

- Paint the blocks on viewer and put types in
  to it.

- Battle button will search for matching bloc
  ks, and calculate moves.

- Search for modals block (●), companion bloc
  ks (■), posibble matching blocks (♦), and i
  gnore imposibble blocks (□):

  □ ♦ □ □ ♦ □
  ♦ □ ● ■ □ ♦    <- ● ■ pointed to the "LEFT"
  □ ♦ □ □ ♦ □

- On the example above, modals are pointed to
  the "LEFT", other types including 90° (poin
  ted "UP"), 180° (pointed "RIGHT"), and 270°
  (pointed "DOWN") in clockwise rotations.

- Foods across and then food behind modal are
  always calculated first, and then the upper
  left, then continue in clockwise.

  □ ♦
  ♦ □              <- pointed to the "LEFT"
  □ ♦

- On the example above, there's no modals, it
  just tried to find triangle mess. It's also
  had 90°, 180°, and 270° CW rotations.

- Battle method will find same types by simpl
  y matching strings inputed on game grids.

- And make moves according to blocks position
  from data above.

- Capture operations sequence:
  1. Painting viewer grids.
  2. Calling Capture.
  3. Screenshooting game board.
  4. Slicing it as blocks.
  5. Inputing blocks data.
  6. Paint blocks.
  7. Repeat from 2.

- Battle operations sequence:
  1. Ignore empty grids.
  2. Clicking helper blocks.
  3. Matching animal or annoying blocks.
  4. Clicking eraser blocks.
  5. Repeat from 1.

---------------------------------------------
ISSUES
---------------------------------------------
- Only works in 1366x768 window resolution in
  maximized Blustack window.

- Using method that would always ignore other
  best matching possibilities. (see below)

- There are several case of block positions b
  ut it will never be implemented, they are: 

  ♦    □ ■ □ □    □ □ ♦ □ □
  □    □ ● □ □    ■ ■ □ ■ ■
  ●    ♦ □ ■ ■    □ □ ● □ □
  ■    □ ♦ □ □    □ □ ■ □ □

  □ ♦ □    □ □ ♦ □ □
  ● □ ♦    ■ ■ □ ● ■
  □ ♦ □    □ □ ♦ □ □

- These positions are obsolete, because they'
  re already occur in position method used.

---------------------------------------------
TO DO LIST (CANCELED)
---------------------------------------------
- Create a button for changing displayed bloc
  ks alpha values. (? button)
  • unimportant.

- Use card layout for this dialogs window, so
  it can interchangeably switched between the
  main window frame.
  • too lazy to do it.

- Programatically finds grid so it can flexi.
  bly used in any screen sizes.
  • that's too much for first exercise.

- Checking HSB/HSV (faster?) value rather tha
  n using predefined RGB values.
  • to be practiced on next application.

---------------------------------------------
THANKS TO
---------------------------------------------
- Stack Overflow
  and for people who ask anything here.
    <http://stackoverflow.com/>

- Tuttorials Point
  for great tuttorials.
    <http://www.tutorialspoint.com/>

- Oracle Documentation
  really well documented. (or not?)
    <http://docs.oracle.com/>

- Derek Banas
  fast and powerfull tuttorials, not reco
  mmended for begginers. (like me)
    <https://www.youtube.com/channel/UCwRXb5d
    UK4cvsHbx-rGzSgw>

- Casper Chang
  for his bot example.
    <https://github.com/casperchang>

- David Doran
  for his bot codes example.
    <https://github.com/daviddoran>

- Lee Jason
  for his bot codes example.
    <https://github.com/lee-jason>

- Bryan Chauvin
  Java tuttorials using Eclipse.
    <https://www.youtube.com/channel/UCEUdgJS
    qHi-mwFLprlIWoXA>

- Stanford Course: Programming Methodology.
  Instructor: Professor Mehran Sahami.
  (recomended for zero experience learner)
    <https://youtu.be/KkMDCCdjyW8?list=PL6C11
    012B1B464EC5>

- And other sites, there's a lot but i forgot
  to bookmark.

---------------------------------------------
CHANGE LOG
---------------------------------------------
1.0
  DEMO: Saturday, 20 February 2016, 10:15:13
  - adding triangle methods to solver
  - removing some action methods
  - demoware / shareware / crippleware

  FINAL: Saturday, 20 February 2016, 10:10:10
  - adding triangle method to solver
  - final / obsolete / legacy

BETA: Saturday, 20 February 2016, 05:19:54
- adding mouse idle if grid is empty
- recreating blocks checkers

BETA: Saturday, 20 February 2016, 01:23:40
- beta testing

ALPHA: Friday, 19 February 2016, 13:04:34
- adding battle solver methods

ALPHA: Monday, 15 February 2016, 19:34:23
- recreating all loops to 2D loops
- adding random quotes and robot quotes"

ALPHA: Thursday, ‎11 ‎February ‎2016, ‏‎07:44:12
- adding blocks title
- adding info button

ALPHA: Friday, ‎5 ‎February ‎2016, 09:23:43
- adding buttons auto enable/disable
- adding background grids

ALPHA: Sunday, ‎31 ‎January ‎2016, 13:22:13
- adding link for viewer and capture methods

ALPHA: Friday, ‎29 ‎January ‎2016, 17:11:01
- recreating software workflows
- adding capture methods

ALPHA: Saturay, ‎23 ‎January ‎2016, 20:08:48
- adding viewer

PRE-ALPHA: Monday, ‎11 January ‎2016, ‏‎23:48:03
- starting project

•••••••••••••••••••••••••••••••••••••••••••••
really need to reads about software licensing
•••••••••••••••••••••••••••••••••••••••••••••
