/**
 * A class to solve various loop problems
 * 
 * @author Alex Xu
 * @version 9/21/15
 * 
 *          Period - 4 Assignment - A12.1 - FunLoops
 * 
 *          Sources - Alex Xu
 */
public class FunLoops
{
    /**
     * calculates magic squares
     * 
     * @param n
     *            number of magic squares needed
     */
    public void magicsquare( int n )
    {
        int numberOf = 1;
        System.out.println( "Magic Squares" );
        long addedSum = 0;
        long numSquared = 1;
        long numAdded = 0;
        while ( numberOf <= n )
        {
            while ( addedSum < ( numSquared * numSquared )
                && addedSum != ( numSquared * numSquared ) )
            {
                addedSum += numAdded;
                numAdded++;
            }
            if ( addedSum == ( numSquared * numSquared ) )
            {
                System.out
                    .println( numberOf + ": " + ( numSquared * numSquared ) );
                numberOf++;
            }
            numSquared++;
        }
    }


    /**
     * calculates least common multiple given two integers
     * 
     * @param a
     *            first integer
     * @param b
     *            second integer
     * @return multiple
     *            LCM
     */
    public int lcm( int a, int b )
    {
        int multiple;
        multiple = a * b;
        while ( a != b )
        {
            if ( a > b )
            {
                a -= b;
            }
            else
            {
                b -= a;
            }
        }
        multiple /= a;
        return multiple;
    }


    /**
     * main method for implementing Loops
     * 
     * @param args
     *            command line argument
     */
    public static void main( String[] args )
    {
        FunLoops fun = new FunLoops();

        fun.magicsquare( 4 );
        System.out.println();

        System.out.println( "LCM (15, 18) = " + fun.lcm( 15, 18 ) );
        System.out.println( "LCM (40, 12) = " + fun.lcm( 40, 12 ) );
        System.out.println( "LCM (2, 7) = " + fun.lcm( 2, 7 ) );
        System.out.println( "LCM (100, 5) = " + fun.lcm( 100, 5 ) );
        System.out.println();

        fun.magicsquare( 10 );
    }
}
