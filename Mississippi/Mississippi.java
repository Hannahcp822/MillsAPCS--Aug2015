
/**
 * P 1.1 - Mississippi
 * 
 * @author Hannah Pang
 * @version August 25, 2015 (Revised: August 29, 2015)
 */
public class Mississippi
{
    public static void main(String[] args)
    {
        printM();
        printI();
        printS();
        printS();
        printI();
        printS();
        printS();
        printI();
        printP();
        printP();
        printI();
    }
    
    public static void printM()
    {
        twoM();
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("M  M  M");
        twoM();
        twoM();
        twoM();
        System.out.println();
    }
    
    public static void twoM()
    {
        System.out.println("M     M");
    }
    
    public static void printI() 
    {
        fiveI();
        oneI();
        oneI();
        oneI();
        oneI();
        oneI();
        fiveI();
        System.out.println();
    }
    
    public static void fiveI()
    {
        System.out.println("IIIII");
    }
    
    public static void oneI()
    {
        System.out.println("  I  ");
    }
    
    public static void printS()
    {
        fiveS();
        twoS();
        System.out.println("S      ");
        fiveS();
        System.out.println("      S");
        twoS();
        fiveS();
        System.out.println();
    }
    
    public static void fiveS()
    {
        System.out.println(" SSSSS ");
    }
    
    public static void twoS()
    {
        System.out.println("S     S");
    }
    
    public static void printP()
    {
        sixP();
        twoP();
        twoP();
        sixP();
        oneP();
        oneP();
        oneP();
        System.out.println();
    }
    
    public static void sixP()
    {
        System.out.println("PPPPPP");
    }
    
    public static void twoP()
    {
        System.out.println("P     P");
    }
    
    public static void oneP()
    {
        System.out.println("P      ");
    }
}