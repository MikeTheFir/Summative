
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pistm9061
 */
public class SummativeProjectFinished extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "Find The Dot";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE
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
    Color Amber1 = new Color(255, 194, 0);
    Color Amber2 = new Color(186, 145, 9);
    Color Peach1 = new Color(227, 169, 168);
    Color Peach2 = new Color(255, 210, 209);
    Color RedSand1 = new Color(84, 67, 66);
    Color RedSand2 = new Color(105, 57, 56);
    Color PasteGreen1 = new Color(0, 255, 136);
    Color PasteGreen2 = new Color(171, 255, 216);
    
    ArrayList<Color> colours = new ArrayList();
    
    
    int x = 100;
    int y = 100;
    int level = 1;
    boolean found = true;
    int last;
    int score;
    int time;
    Color backr = Color.BLACK;
    Color pixr = Color.BLUE;

    
    // GAME VARIABLES END HERE   
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)

    public SummativeProjectFinished() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();

        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
            if(found){
                // always clear the screen first!
   
            g.clearRect(0, 0, WIDTH, HEIGHT);
        
        // GAME DRAWING GOES HERE

        colours.add(new Color(8, 0, 255));
        colours.add(new Color(46, 39, 252));
        colours.add(new Color(255, 174, 0));
        colours.add(new Color(204, 120, 10));
        colours.add(new Color(255, 255, 0));
        colours.add(new Color(214, 214, 30));
        colours.add(new Color(124, 8, 212));
        colours.add(new Color(179, 79, 255));
        colours.add(new Color(219, 24, 24));
        colours.add(new Color(255, 82, 82));
        colours.add(new Color(4, 122, 27));
        colours.add(new Color(50, 168, 74));
        colours.add(new Color(255, 0, 174));
        colours.add(new Color(255, 128, 215));
        colours.add(new Color(0, 255, 238));
        colours.add(new Color(143, 219, 214));
        colours.add(new Color(64, 45, 0));
        colours.add(new Color(102, 75, 12));
        colours.add(new Color(255, 194, 0));
        colours.add(new Color(186, 145, 9));
        colours.add(new Color(227, 169, 168));
        colours.add(new Color(255, 210, 209));
        colours.add(new Color(84, 67, 66));
        colours.add(new Color(105, 57, 56));
        colours.add(new Color(0, 255, 136));
        colours.add(new Color(171, 255, 216));
        
        
        
        
        // alternate between the background colour
        switch (Colour(false)) {
            case 1:
                g.setColor(Blue1);
                backr = Blue1;
                break;
            case 2:
                g.setColor(Orange1);
                backr = Orange1;
                break;
            case 3:
                g.setColor(Red1);
                backr = Red1;
                break;
            case 4:
                g.setColor(Green1);
                backr = Green1;
                break;
            case 5:
                g.setColor(Teal1);
                backr = Teal1;
                break;
            case 6:
                g.setColor(Brown1);
                backr = Brown1;
                break;
            case 7:
                g.setColor(Pink1);
                backr = Pink1;
                break;
            case 8:
                g.setColor(Amber1);
                backr = Amber1;
                break;
            case 9:
                g.setColor(Yellow1);
                backr = Yellow1;
                break;
            case 10:
                g.setColor(Purple1);
                backr = Purple1;
                break;
            case 11:
                g.setColor(Peach1);
                backr = Peach1;
                break;
            case 12:
                g.setColor(RedSand1);
                backr = RedSand1;
                break;
            case 13:
                g.setColor(PasteGreen1);
                backr = PasteGreen1;
                break;
            default:
                g.setColor(Color.BLACK);
                backr = Color.BLACK;
        }
        // background
            g.fillRect(0, 0, WIDTH, HEIGHT);
        

        // alterante between the square colour
        switch (Colour(true)) {
            case 1:
                g.setColor(Blue2);
                pixr = Blue2;
                break;
            case 2:
                g.setColor(Orange2);
                pixr = Orange2;
                break;
            case 3:
                g.setColor(Red2);
                pixr = Red2;
                break;
            case 4:
                g.setColor(Green2);
                pixr = Green2;
                break;
            case 5:
                g.setColor(Teal2);
                pixr = Teal2;
                break;
            case 6:
                g.setColor(Brown2);
                pixr = Brown2;
                break;
            case 7:
                g.setColor(Pink2);
                pixr = Pink2;
                break;
            case 8:
                g.setColor(Amber2);
                pixr = Amber2;
                break;
            case 9:
                g.setColor(Yellow2);
                pixr = Yellow2;
                break;
            case 10:
                g.setColor(Purple2);
                pixr = Purple2;
                break;
            case 11:
                g.setColor(Peach2);
                pixr = Peach2;
                break;
            case 12:
                g.setColor(RedSand2);
                pixr = RedSand2;
                break;
            case 13:
                g.setColor(PasteGreen2);
                pixr = PasteGreen2;
                break;
            default:
                g.setColor(Color.BLACK);
                pixr = Color.BLACK;
        }
        
        g.setColor(getColor());
        // offset coloured pixels to find are randomly generated.
            g.fillRect(x, y, 3, 3);
       
        found = false;

        g.setColor(Color.white);
       
        g.drawString("TIME: " + Math.round(time / 100.0) / 10000.0, 10, 565);
   
        g.drawString("SCORE: " + score, 10, 580);
        
        // GAME DRAWING ENDS HERE
            }
            if(!found){
                test(backr, pixr, x, y, g);
            }
    }
    
    public void test(Color back, Color pix, int xPix, int yPix, Graphics g){
        
        g.clearRect(0, 0, WIDTH, HEIGHT);
        g.setColor(back);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setColor(pix);
        g.fillRect(x, y, 3, 3);
        
        g.drawString("TIME: " + Math.round(time / 100.0) / 10000.0, 10, 565);
   
        g.drawString("SCORE: " + score, 10, 580);
        
    }
    
    public void time(Graphics g){
        
        
    }
    // make sure the colours are never the same

    public int Colour(boolean back) {
        Random rand = new Random();
        int background = rand.nextInt(13) + 1;
        if (!back) {
            if (background == last) {
                background--;
            }
        }
       
        last = background;
        return background;
       
    }
    
    
  
    
    
    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!

    public void preSetup() {
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
            while (!found) {
                 
                 time++;
                 repaint();
           
            }
            found = true;
            // generate new random x and y chords
            Random X = new Random();
            Random Y = new Random();

            x = X.nextInt(WIDTH);
            y = Y.nextInt(HEIGHT);
           

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

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
            // gets position of the x and y cords of the mouse
            int mouseX = e.getX();
            int mouseY = e.getY();
            // sees if the cordinates of the off colour box have been selected
            if (mouseX >= x && mouseX <= x + 3 && mouseY >= y && mouseY <= y + 3) {
                // move onto the next level
                level++;
                found = true;
                // increase score by one
                score++;
            }




        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {
           // if the key F is pressed, fast forward to the next level
                
                int keyCode = e.getKeyCode();
        switch (keyCode) {

            case KeyEvent.VK_F:
                found = true;
                level++;
                break;
            
        }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        SummativeProjectFinished game = new SummativeProjectFinished();

        // starts the game loop
        game.run();
    }
    
    public Color getColor(){
        Random rand = new Random();
        int background = rand.nextInt(13) + 1;
        return colours.get(background);
        
    }
    
   
}
