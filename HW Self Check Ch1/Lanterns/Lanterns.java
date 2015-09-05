
/**
 * Exercise 14 - Lanterns
 * 
 * @author Hannah Pang
 * @version August 24, 2015 - HW Day 8
 */
public class Lanterns 
{
    public static void main(String[] args)
    {
        printAsterisks();
        printPipeline(); 
        System.out.println("*************");
        printAsterisks();
        printAsterisks5();
        printPipeline();
        printPipeline();
        printAsterisks5();
        printAsterisks5();

    }
    public static void printAsterisks()
    {
        printAsterisks1();
        System.out.println();
        printAsterisks1();
    }
    public static void printAsterisks1()
    {
        System.out.println("    *****    ");
        System.out.println("  *********  ");
        System.out.println("*************");
    }
    public static void printAsterisks5()
    {
        System.out.println("    *****    ");
    }    
        public static void printPipeline()
    {
        System.out.println("* | | | | | *");
    }
}
