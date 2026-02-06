public class Bulbasaur extends Pokemon {
    public Bulbasaur(String userName) {
        setHealth(70);
        setName(userName);
    }
    public void abilityLeechSeed(Bulbasaur userBulbasaur, Pokemon opponent) {
        System.out.println(userBulbasaur.getName() + " used Leech Seed!");
        int opponentHealth = opponent.getHealth();
        opponent.setHealth(opponentHealth - 20);
        int userHealth = userBulbasaur.getHealth();
        if (userHealth < 70 && userHealth > 0) {
            if(userHealth <= 50) {
                userBulbasaur.setHealth(userHealth + 20);
                System.out.println(userBulbasaur.getName() + " healed 20 HP!");
            }
            else if(userHealth >= 60) {
                userBulbasaur.setHealth(userHealth + 10);
                System.out.println(userBulbasaur.getName() + " healed 10 HP!");
            }
        }
    }
    /*
    public int getHealth() {
        return userBulbasaur.getHealth();
    }
    public void setHealth(int inputHealth) {
        userBulbasaur.getHealth() = inputHealth;
    }
    public String getName() {
        return name;
    }
    */
}