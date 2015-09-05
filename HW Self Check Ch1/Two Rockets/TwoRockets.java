
/**
 * Exercise 11 - TwoRockets.
 * 
 * @author Hannah Pang
 * @version August 24, 2015 - HW Day 8
 */

public class TwoRockets
{
    public static void main(String[] args)
    {
        printTwoArrows();
        printTwoBoxes();
        printTwoText();
        printTwoBoxes();
        printTwoArrows();
    }
    public static void printTwoArrows()
    {
        System.out.println("   /\\       /\\   ");
        System.out.println("  /  \\     /  \\  ");
        System.out.println(" /    \\   /    \\ ");
    }
    public static void printTwoBoxes()
    {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
    public static void printTwoText()
    {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}
