import java.util.Random;
public class PokemonBattleArena
{
    public void battle(Squirtle player1, Charmander player2) {
        //Squirtle player1 = new Squirtle("Gary");
        //Charmander player2 = new Charmander("Ash");
        Random start = new Random();
        int first = start.nextInt(2);
        if(first != 1) {
            System.out.println("Player 1, " + player1.getName() + " the Squirtle will go first!");
        } else {
            System.out.println("Player 2, " + player2.getName() + " the Charmander will go first!");
        }
        if (first != 1) {
            for(int i = 1; i > 0; i++) {
                System.out.println(player1.getName() + " has " + player1.getHealth() + " HP!");
                System.out.println(player2.getName() + " has " + player2.getHealth() + " HP!");
                player1.abilityWaterGun(player2);
                player2.abilityScratch(player1);
                int p1Health = player1.getHealth();
                int p2Health = player2.getHealth();
                System.out.println(player1.getName() + " has " +  p1Health + " HP left!  " + player2.getName() + " has " + p2Health + " HP left!");
                if (p1Health <=0) {
                    System.out.println(player1.getName() + " has fainted!  The winner is " + player2.getName() + "!");
                    i = 0;
                } else if (p2Health <=0) {
                    System.out.println(player2.getName() + " has fainted!  The winner is " + player1.getName() + "!");
                    i = 0;
                }
            }
        } else {
            for(int i = 1; i > 0; i++) {
                System.out.println(player1.getName() + " has " + player1.getHealth() + " HP!");
                System.out.println(player2.getName() + " has " + player2.getHealth() + " HP!");
                player2.abilityScratch(player1);
                player1.abilityWaterGun(player2);
                int p1Health = player1.getHealth();
                int p2Health = player2.getHealth();
                System.out.println(player1.getName() + " has " +  p1Health + " HP left!  " + player2.getName() + " has " + p2Health + " HP left!");
                if (p1Health <=0) {
                    System.out.println(player1.getName() + " has fainted!  The winner is " + player2.getName() + "!");
                    i = 0;
                } else if (p2Health <=0) {
                    System.out.println(player2.getName() + " has fainted!  The winner is " + player1.getName() + "!");
                    i = 0;
                }
            }  
        }
    }
}