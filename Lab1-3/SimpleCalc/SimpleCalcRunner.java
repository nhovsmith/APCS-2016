
/**
 * Write a description of class firstclassrunner here.
 * Seconed lab.
 * @author (Nick Hovsmith) 
 * @version (Version 3.1.7)
 */
public class SimpleCalcRunner
{
 public static void main(String[] args){
    int n1 = 64 ;
    int  n2 = 4 ;
   SimpleCalc sc = new SimpleCalc(n1, n2);
   System.out.println("Numbers: " + n1 + ", " + n2) ;
   System.out.println("The Sum is: " +sc.add());
   System.out.println("The diff is: " + sc.sub());
   System.out.println("The Product is " + sc.mult());
   System.out.println("The Quotient is: " +sc.div());
   System.out.println("n1 ia greater than n2: " +sc.isGreater());
}
}
