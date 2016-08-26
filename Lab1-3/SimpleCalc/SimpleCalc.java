
/**
 * Write a description of class fistclass here.
 * 
 * @author (Nick Hovsmith) 
 * @version (a version number or a date)
 */
public class SimpleCalc
{
    // instance variables - replace the example below with your own
    private int num1;
    private int num2;
    /**
     * Constructor for objects of class fistclass
     */
    public SimpleCalc(int a, int b)
    {
        // initialise instance variables
         num1 = a;
         num2 = b;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int add()
    {
        // put your code here
     
        return num1 + num2;
    }
    public int sub()
    {
        return num1-num2;
    }
    public int mult()
    {
        return num1*num2;
    }
    public int div()
    {
        return num1/num2;
    }
    public boolean  isGreater()
    {
       if (num1 > num2)
       {
           return true;
       }
       return false;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

           






    
