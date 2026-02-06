public class Pokemon
{
    private int healthPoints;
    private String name;
    private String type;
    public int getHealth() {
        return healthPoints;
    }
    public void setHealth(int inputHealth) {
        healthPoints = inputHealth;
    }
    public String getName() {
        return name;
    }
    public void setName(String inputName) {
        name = inputName;
    }
    public String getType() {
        return type;
    }
    public void setType(String pokemonType) {
        type = pokemonType;
    }
}
