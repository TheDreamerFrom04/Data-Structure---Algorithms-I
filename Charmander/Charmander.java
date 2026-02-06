public class Charmander extends Pokemon {
    public Charmander(String userName) {
        setHealth(50);
        setName(userName);
        //setType("
    }
    public void abilityScratch(Pokemon opponent) {
        System.out.println(getName() + " used Scratch!");
        int opponentHealth = opponent.getHealth();
        opponent.setHealth(opponentHealth - 10);
    }
}