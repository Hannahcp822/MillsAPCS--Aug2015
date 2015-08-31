
/**
 * P1.4 - TwelveDaysOfChristmas
 * 
 * @author Hannah Pang
 * @version August 27, 2015
 */
public class TwelveDaysOfChristmas
{
    public static void main(String[] args)
    {
        System.out.println("On the first day of Christmas,");
        secondLine();
        first();
        System.out.println("On the second day of Christmas,");
        secondLine();
        second();
        System.out.println("On the third day of Christmas,");
        secondLine();
        third();
        System.out.println("On the fourth day of Christmas,");
        secondLine();
        fourth();
        System.out.println("On the fifth day of Christmas,");
        secondLine();
        fifth();
        System.out.println("On the sixth day of Christmas,");
        secondLine();
        sixth();
        System.out.println("On the seventh day of Christmas,");
        secondLine();
        seventh();
        System.out.println("On the eighth day of Christmas,");
        secondLine();
        eighth();
        System.out.println("On the ninth day of Christmas,");
        secondLine();
        ninth();
        System.out.println("On the tenth day of Christmas,");
        secondLine();
        tenth();
        System.out.println("On the eleventh day of Christmas,");
        secondLine();
        eleventh();
        System.out.println("On the twelfth day of Christmas,");
        secondLine();
        twelfth();
    }
    
    public static void secondLine()
    {
        System.out.println("my true love sent to me");
    }
    
    public static void first()
    {
        partridge();
        System.out.println();
    }
    
    public static void second()
    {
        turtleDoves();
        first();
    }
    
    public static void third()
    {
        frenchHens();
        second();
    }
    
    public static void fourth()
    {
        callingBirds();
        third();
    }
    
    public static void fifth()
    {
        goldenRings();
        fourth();
    }
        
    public static void sixth()
    {
        geese();
        fifth();
    }
    
    public static void seventh()
    {
        swans();
        sixth();
    }
    
    public static void eighth()
    {
        maids();
        seventh();
    }
        
    public static void ninth()
    {
        ladies();
        eighth();
    }
    
    public static void tenth()
    {
        lords();
        ninth();
    }
    
    public static void eleventh()
    {
        pipers();
        tenth();
    }
    
    public static void twelfth()
    {
        drummers();
        eleventh();
    }
   
    public static void partridge()
    {
        System.out.println("a partridge in a pear tree.");
    }
    
    public static void turtleDoves()
    {
        System.out.println("two turtle doves, and");
    }
    
    public static void frenchHens()
    {
        System.out.println("three French hens,");
    }
    
    public static void callingBirds()
    {
        System.out.println("four calling birds,");
    }
    
    public static void goldenRings()
    {
        System.out.println("five golden rings,");
    }
    
    public static void geese()
    {
        System.out.println("six geese a-laying,");
    }
    
    public static void swans()
    {
        System.out.println("seven swans a-swimming,");
    }
    
    public static void maids()
    { 
        System.out.println("eight maids a-milking,");
    }
    
    public static void ladies()
    {
        System.out.println("nine ladies dancing,");
    }
    
    public static void lords()
    {
        System.out.println("ten lords a-leaping,");
    }
    
    public static void pipers()
    {
        System.out.println("eleven pipers piping,");
    }
    
    public static void drummers()
    {
        System.out.println("Twelve drummers drumming,");
    }
}