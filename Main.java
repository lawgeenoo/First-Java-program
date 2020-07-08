import java.util.Random;
public class Main
{
    public static void main(String[] args) 
    {
        Person Evil_Twin = new Person(); // object creation.
        Person Cipri = new Person(); // object creation
        Cipri.name = "Cipri";
        Evil_Twin.name = "Cipri's evil twin."; //names
        
        while(Cipri.health > 0 || Evil_Twin.health > 0) // loop fight
        {
            int roll_result = Roll();
            switch(roll_result) {
                case 0:
                    Cipri.health = Evil_Twin.Fight(Cipri.health);
                    System.out.println("Cipri's Evil_Twin deals damage to " + Cipri.name);
                    break;
                case 1:
                    Evil_Twin.health = Cipri.Fight(Evil_Twin.health);
                    System.out.println("Cipri deals damage to " + Evil_Twin.name);
                    break;
                default:                                         
        }      
               System.out.println(" Cipri's HP: "+ Cipri.health);
               System.out.println(" Evil Twin's HP: "+ Evil_Twin.health);
        }     // end of loop
        
        if(Cipri.health < Evil_Twin.health)                          // show winner
        {
            System.out.println("Cipri was defeated!");
        }
        else
        {
            System.out.println("Cipri's Evil Twin has been defeated!");
        }
    }

     public static int Roll()                                       // functie, pentru stabilirea player-ului care va servi 
    {   
        Random r = new Random();
        int roll_number = r.nextInt(2);
        return roll_number;
    }

    
}    

