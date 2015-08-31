
/**
 * P1.3 - "There Was an Old Lady Who Swallowed a Fly"
 * 
 * @author Hannah Pang
 * @version August 25, 2015
 */
public class FlySong
{
    public static void main(String[] args)
    {
        firstLine();
        System.out.println("fly");
        System.out.println("I don't know why she swallowed the fly\nPerhaps she'll die");
        System.out.println("But it's only a fly\nI think I'll cry");
        System.out.println("She gulped it out of the sky\nOh, my!");
        System.out.println();
        spider();
        bird();
        cat();
        horse();
        System.out.println("Moral: Never swallow a horse."); 
    }
    
    public static void firstLine()
    {
        System.out.print("There was an old lady who swallowed a ");
    }
    
    public static void fly()
    {
        System.out.println("I don't know why\nShe swallowed the fly\nPerhaps she'll die.");
    }
    
    public static void spider()
    {
        firstLine();
        System.out.println("spider\nThat wiggled and jiggled and tickled inside her.");
        first();
        fly();
        System.out.println("Gone to the by and by\nSigh");
        System.out.println();
    }
    
    public static void bird()
    {
        firstLine();
        System.out.println("bird.\nHow absurd! She swallowed a bird!");
        second();
        first();
        fly();
        System.out.println("She'll leave us high and dry.");
        System.out.println();
    }
    
    public static void cat()
    {
        firstLine();
        System.out.println("cat.\nImagine that! She swallowed a cat.");
        third();
        second();
        first();
        fly();
        System.out.println("I hope it's a lie.");
        System.out.println();
    }
    
    public static void horse()
    {
        firstLine();
        System.out.println("horse.\nShe died, of course.\nIt was the last course.\nI'm filled with remorse.");
        System.out.println("What's left to say...\nEven the artist is crying.\nWe'll miss her dearly.");
        System.out.println("It is such a loss.\nShe had no time to floss.\nShe missed out on the sauce.");
        System.out.println();
    }
    
    public static void first()
    {
        System.out.println("She swallowed the spider to catch the fly");
    }
    
    public static void second()
    {
        System.out.println("She swallowed the bird to catch the spider.");
    }
    
    public static void third()
    {
        System.out.println("She swallowed the cat to catch the bird.");
    }
}
