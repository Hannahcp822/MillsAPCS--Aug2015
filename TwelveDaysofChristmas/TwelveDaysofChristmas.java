
/**
 * P1.4 - TwelveDaysofChristmas
 * 
 * @author Hannah Pang
 * @version August 27, 2015
 */
public class TwelveDaysofChristmas
{
    public static void main(String[] args)
    {
        System.out.println("On the first day of Christmas,");
        Secondline();
        First();
        System.out.println("On the second day of Christmas,");
        Secondline();
        Second();
        System.out.println("On the third day of Christmas,");
        Secondline();
        Third();
        System.out.println("On the fourth day of Christmas,");
        Secondline();
        Fourth();
        System.out.println("On the fifth day of Christmas,");
        Secondline();
        Fifth();
        System.out.println("On the sixth day of Christmas,");
        Secondline();
        Sixth();
        System.out.println("On the seventh day of Christmas,");
        Secondline();
        Seventh();
        System.out.println("On the eighth day of Christmas,");
        Secondline();
        Eighth();
        System.out.println("On the ninth day of Christmas,");
        Secondline();
        Ninth();
        System.out.println("On the tenth day of Christmas,");
        Secondline();
        Tenth();
        System.out.println("On the eleventh day of Christmas,");
        Secondline();
        Eleventh();
        System.out.println("On the twelfth day of Christmas,");
        Secondline();
        Twelfth();
    }
    
    public static void Secondline()
    {
        System.out.println("my true love sent to me");
    }
    
    public static void First()
    {
        Partridge();
        System.out.println();
    }
    
    public static void Second()
    {
        Turtledoves();
        First();
    }
    
    public static void Third()
    {
        Frenchhens();
        Second();
    }
    
    public static void Fourth()
    {
        Callingbirds();
        Third();
    }
    
    public static void Fifth()
    {
        Goldenrings();
        Fourth();
    }
        
    public static void Sixth()
    {
        Geese();
        Fifth();
    }
    
    public static void Seventh()
    {
        Swans();
        Sixth();
    }
    
    public static void Eighth()
    {
        Maids();
        Seventh();
    }
        
    public static void Ninth()
    {
        Ladies();
        Eighth();
    }
    
    public static void Tenth()
    {
        Lords();
        Ninth();
    }
    
    public static void Eleventh()
    {
        Pipers();
        Tenth();
    }
    
    public static void Twelfth()
    {
        Drummers();
        Eleventh();
    }
   
    public static void Partridge()
    {
        System.out.println("a partridge in a pear tree.");
    }
    
    public static void Turtledoves()
    {
        System.out.println("two turtle doves, and");
    }
    
    public static void Frenchhens()
    {
        System.out.println("three French hens,");
    }
    
    public static void Callingbirds()
    {
        System.out.println("four calling birds,");
    }
    
    public static void Goldenrings()
    {
        System.out.println("five golden rings,");
    }
    
    public static void Geese()
    {
        System.out.println("six geese a-laying,");
    }
    
    public static void Swans()
    {
        System.out.println("seven swans a-swimming,");
    }
    
    public static void Maids()
    { 
        System.out.println("eight maids a-milking,");
    }
    
    public static void Ladies()
    {
        System.out.println("nine ladies dancing,");
    }
    
    public static void Lords()
    {
        System.out.println("ten lords a-leaping,");
    }
    
    public static void Pipers()
    {
        System.out.println("eleven pipers piping,");
    }
    
    public static void Drummers()
    {
        System.out.println("Twelve drummers drumming,");
    }
}