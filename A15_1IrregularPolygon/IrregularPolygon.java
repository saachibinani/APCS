import java.awt.Color;
import java.awt.geom.*;
import java.util.*;
import gpdraw.*;

/**
 * TODO Write a one-sentence summary of your class here.
 * TODO Follow it with additional details about its purpose, what abstraction
 * it represents, and how to use it.
 *
 * @author  Alex Xu
 * @version 11/1/15
 *
 * @author  Period - 4
 * @author  Assignment - A15 - -IrregularPolygon
 * 
 * @author  Sources - Alex Xu
 */
public class IrregularPolygon
{
    private DrawingTool pen = new DrawingTool( new SketchPad( 300, 300, 0 ) );
    private ArrayList<Point2D.Double> myPolygon;
    private double perimeter;

    //constuctors
    
    public IrregularPolygon()
    {
        myPolygon = new ArrayList<Point2D.Double>();
    }

    // public methods

    public void add( Point2D.Double aPoint )
    {
        myPolygon.add( aPoint );
    }

    public double perimeter()
    {
        double perimter = 0;
        if (myPolygon.size() <= 2)
        {
            return 0;
        }
        for (int i = 0; i < myPolygon.size(); i++)
        {
            perimeter += myPolygon.get( i ).distance( myPolygon.get( i+1 ) );
        }
        perimeter += myPolygon.get( myPolygon.size()-1 ).distance( myPolygon.get( 0 ) );
        return perimeter;
    }

    public double area()
    {
        if ( myPolygon.size() < 3)
        {
            return 0;
        }
        double area = 0;
        for ( int i = 0; i < myPolygon.size() - 1; i++ )
        {
            area += myPolygon.get( i ).x * myPolygon.get( i + 1 ).y;
        }
        area += myPolygon.get( myPolygon.size() - 1 ).x * myPolygon.get( 0 ).y;
        for ( int i = 0; i < myPolygon.size() - 1; i++ )
        {
            area -= myPolygon.get( i ).y * myPolygon.get( i + 1 ).x;
        }
        area -= myPolygon.get( myPolygon.size() - 1 ).y * myPolygon.get( 0 ).x;
        area = Math.abs( area / 2);
        return area;
    }

    public void draw()
    {

    }
}
