
/**
 * Write a description of class VectorNorm here.
 * 
 * @author (Yaritza Ascencio) 
 * @version (15 April 2014)
 */
import java.lang.Math;
public class VectorNorm

{
    public static double norm (double x, double y, double z) {   
        double magn = ((x*x) + (y*y) +(z*z));
        double magnSquare = Math.sqrt(magn);
        return magnSquare;
    }
    public static void main (String []args) {
        norm(2,3,4);
    }
}
