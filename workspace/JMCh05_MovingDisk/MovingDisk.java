
/**
 * 
 * Draws a disk that moves around
 * 
 * 
 * @author Alex Xu
 * @version Sep 1, 2015
 * @author Period: 4
 * @author Assignment: JMCh05_MovingDisk
 *
 * @author Sources: Alex Xu
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class MovingDisk extends JPanel implements ActionListener
{
    private int time;


    /**
     * constructor for MovingDisk
     * @param
     */
    public MovingDisk()
    {
        time = 0;
        Timer clock = new Timer( 30, this );
        clock.start();
    }


    /**
     * method that paints the ball
     * 
     * @param g
     *            graphics object
     */
    public void paintComponent( Graphics g )
    {
        int x = 150 - (int)( 100 * Math.cos( 0.005 * Math.PI * time ) );
        int y = 130 - (int)( 75 * Math.sin( 0.005 * Math.PI * time ) );
        int r = 20;

        Color sky;
        if ( y > 130 )
        {
            sky = Color.BLACK;
        }
        else
        {
            sky = Color.CYAN;
            setBackground( sky );
            super.paintComponent( g );
        }
        g.setColor( Color.ORANGE );
        g.fillOval( x - r, y - r, 2 * r, 2 * r );
    }


    /**
     * runs when an action is performed
     * 
     * @param e
     *            ActionEvent that triggers method
     */
    public void actionPerformed( ActionEvent e )
    {
        time++;
        repaint();
    }


    /**
     * main method for MovingDisk
     * 
     * @param args
     *            command line argument
     */
    public static void main( String args )
    {
        JFrame w = new JFrame( "Moving Disk" );
        w.setSize( 300, 150 );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Container c = w.getContentPane();
        c.add( new MovingDisk() );
        w.setResizable( false );
        w.setVisible( true );
    }
}