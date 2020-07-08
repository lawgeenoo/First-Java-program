import java.util.Random;
public class Person     // clasa/template player
{
    String name;
    int health = 100;
    Random rand = new Random();
    
    
    public int Fight(int HP)           // functie scadere hitpoints   
        {   
            int n = rand.nextInt(15);
            HP = health - n;
            //System.out.println(n); pentru debug
            return HP;
        }
}
