/**
*
* @author Amar
*/
public class Util {
    public static final double COEFF_FRICTION=0.23; 
    /** 
    * static variables r not instance variables and public v private= access specifiers and public static final is with class whereas final is with method
    */
/**
 * 
 * @param distance
 * @param time
 * @return distance/time
 */
    public static double getVelocity (double distance, double time){ //static method v instance method
        //in another file u do Uti.getVelocity(...,...);
        return distance/time;
    }
    /**
     * This is a utility class
     */
}
