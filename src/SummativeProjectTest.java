
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author pistm9061
 */
public class SummativeProjectTest extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;


    // GAME VARIABLES WOULD GO HERE
Color Blue1 = new Color(8, 0, 255);
Color Blue2 = new Color(46, 39, 252);

Color Orange1 = new Color(255, 174, 0);
Color Orange2 = new Color(204, 120, 10);

Color Yellow1 = new Color(255, 255, 0);
Color Yellow2 = new Color(214, 214, 30);

Color Purple1 = new Color(124, 8, 212);
Color Purple2 = new Color(179, 79, 255);

Color Red1 = new Color(219, 24, 24);
Color Red2 = new Color(255, 82, 82);

Color Green1 = new Color(4, 122, 27);
Color Green2 = new Color(50, 168, 74);

Color Pink1 = new Color(255, 0, 174);
Color Pink2 = new Color(255, 128, 215);

Color Teal1 = new Color(0, 255, 238);
Color Teal2 = new Color(143, 219, 214);

Color Brown1 = new Color(64, 45, 0);
Color Brown2 = new Color(102, 75, 12);


int x = (int)(Math.random() * 785) + 15;
int y = (int)(Math.random() * 585) + 15;
    // GAME VARIABLES END HERE   

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        
        // find the offset pixels click them and move onto the next level
        // make sure two colors are similar
        
        
        // primary backdrop
        g.setColor(Blue1);
        g.fillRect(15, 15, 770, 570);
        // offset coloured pixels to find
        g.setColor(Blue2);
        g.fillRect(x, y, 3, 3);
        
        
        // GAME DRAWING ENDS HERE
    }


    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void  preSetup(){
       // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE
            
            
            
            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates a windows to show my game
        JFrame frame = new JFrame("Click the Wrong Coloured Pixels");

        // creates an instance of my game
        SummativeProjectTest game = new SummativeProjectTest();
        // sets the size of my game
        game.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(game);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);
        
        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        game.addMouseListener(new Mouse());
        
        // starts the game loop
        game.run();
    }

    // Used to implement any of the Mouse Actions
    private static class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e){
            
        }
        
        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e){
            
        }
        
        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e){
            
        }
        
        @Override
        public void mouseClicked(MouseEvent e){
            e.getX();
            e.getY();
    }
    }
    // Used to implements any of the Keyboard Actions
    public static class Keyboard extends KeyAdapter{
        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e){
            
        }
        
        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e){
            
        }
    }

}
