
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
        TwoM();
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("M  M  M");
        TwoM();
        TwoM();
        TwoM();
        System.out.println();
    }
    
    public static void TwoM()
    {
        System.out.println("M     M");
    }
    
    public static void printI() 
    {
        FiveI();
        OneI();
        OneI();
        OneI();
        OneI();
        OneI();
        FiveI();
        System.out.println();
    }
    
    public static void FiveI()
    {
        System.out.println("IIIII");
    }
    
    public static void OneI()
    {
        System.out.println("  I  ");
    }
    
    public static void printS()
    {
        FiveS();
        TwoS();
        System.out.println("S      ");
        FiveS();
        System.out.println("      S");
        TwoS();
        FiveS();
        System.out.println();
    }
    
    public static void FiveS()
    {
        System.out.println(" SSSSS ");
    }
    
    public static void TwoS()
    {
        System.out.println("S     S");
    }
    
    public static void printP()
    {
        SixP();
        TwoP();
        TwoP();
        SixP();
        OneP();
        OneP();
        OneP();
        System.out.println();
    }
    
    public static void SixP()
    {
        System.out.println("PPPPPP");
    }
    
    public static void TwoP()
    {
        System.out.println("P     P");
    }
    
    public static void OneP()
    {
        System.out.println("P      ");
    }
}