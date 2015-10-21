/**
 * Simulates a six-sided die.
 *
 * @author Alex Xu
 * @version 9/9/15
 * @author Period: 4
 * @author Assignment: JMCh07_RollingDice
 *
 * @author Sources: Alex Xu
 */
public class Die
{
    private int numDots;


    /**
     * Sets numDots to a random integer from 1 to 6
     */
    public void roll()
    {
        numDots = 1 + (int)( Math.random() * 6 );
    }


    /**
     * Returns the value of the most recent roll.
     * 
     * @return numDots value of roll
     */
    public int getNumDots()
    {
        return numDots;
    }
}