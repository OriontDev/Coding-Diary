public class Player{
    private int health;
    private int mana;

    public Player(int health, int mana){
        this.health = health;
        this.mana = mana;
    }

    public void setStats(int health, int mana){
        this.health = health;
        this.mana = mana;
        if(this.health <= 0){
            handleDeath();
        }
    }

    public int getHealth(){
        return this.health;
    }

    public int getMana(){
        return this.mana;
    }

    private void handleDeath(){
        System.out.println("Bros dead");
    }
}