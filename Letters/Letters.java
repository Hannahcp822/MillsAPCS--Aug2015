
/**
 * Letters - P1.2
 * This program prints three letters to three different people.
 * 
 * @author Bonny Lee and Hannah Pang 
 * @version August 27, 2015 (Revised: August 29, 2015)
 */
public class Letters
{
    public static void main(String[] args)
    {
        brother();
        sister();
        mom();
    }
    
    public static void brother()
    {
        greetingBrother();
        classes();
        sports();
        movies();
        ending();
    }
    
    public static void sister()
    {
        greetingSister();
        classes();
        friends();
        clothes();
        ending();
    }
    
    public static void mom()
    {
        greetingMom();
        classes();
        friends();
        movies();
        ending();
    }
    
    public static void greetingBrother()
    {
        System.out.println("\tHey bro! Haven't seen you in awhile. How have you been?\nNot much is new with me, but I have a few questions to ask you.");
    }
    
    public static void greetingSister()
    {
        System.out.println("\tHey sis! How's college? Hope everything is going well for you\nthere. I was wondering if I could get your advice on some things.");
    }
    
    public static void greetingMom()
    {
        System.out.println("\tHey mom! How's everything going? I'm doing fine, but I\nwanted to ask you about some things.");
    }
    
    public static void classes()
    {
        System.out.println("\tSo school started and I need to finalize my schedule soon...\nAs you know I'm really into writing narratives, but I'm not sure if\nI should take AP English beecause I heard it's a lot of work. What\ndo you think? Will I be too overwhelmed?");
    }
    
    public static void sports()
    {
        System.out.println("\tI also have to prepare for volleyball tryouts, which start\nnextMonday. I haven't played that much over the summer and am a\nlittle worried about making the team. Got any advice?");
    }
    
    public static void movies()
    {
        System.out.println("\tOh and hasn't the weather been really hot lately?! I was\nthinking about going to see a movie with some friends one of these\ndays to stay out of the heat. Seen any good ones recently?");
    }
    
    public static void friends()
    {
        System.out.println("\tIt's been exciting seeing everyone back at school, but a\nfew of my friends and I got into a fight over the summer and\nit's awkward bumping into them. I don't think it was my fault but\nwhat should I say to them?");
    }
    
    public static void clothes()
    {
        System.out.println("\tOh and thanks so much for letting me borrow your shirt for\nthe party! Don't worry, nothing happened to it! I promise to return\nit the next time I see you!");
    }
    
    public static void ending()
    {
        System.out.println("\tWrite me back when you can!!");
        System.out.println("\t\t\t\t\t\tSee you soon!!");
        System.out.println("\t\t\t\t\t\tDaisy");
        System.out.println();
        System.out.println();
    }
}

        