
/**
 * Write a description of class FirstClassRunner here.
 * 
 * @author (Nick Hovsmith   ) 
 * @version (8/24/2016)
 */
public class FirstClassRunner
{ 
public static void main(String[] args){
     int x = 64;
     int y = 3;
   FirstClass sc = new FirstClass(x, y);
   System.out.println("The sum is: " + sc.addEmUp());
   System.out.println("The difference is: " +sc.subtract());
}
    }

