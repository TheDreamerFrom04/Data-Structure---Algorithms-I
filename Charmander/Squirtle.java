public class Squirtle extends Pokemon {
    public Squirtle(String userName) {
        setHealth(70);
        setName(userName);
    }
    public void abilityWaterGun(Pokemon opponent) {
        System.out.println(getName() + " used Water Gun!");
        int opponentHealth = opponent.getHealth();
        opponent.setHealth(opponentHealth - 20);
    }
    /*
    public int getHealth() {
        return healthPoints;
    }
    public void setHealth(int inputHealth) {
        healthPoints = inputHealth;
    }
    public String getName() {
        return name;
    }
    */
}