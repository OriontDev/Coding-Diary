public class Player{
    private int health;
    private int mana;
    private int coins;

    public Player(int health, int mana, int coins){
        this.health = health;
        this.mana = mana;
        this.coins = coins;

    }

    public void setStats(Integer health, Integer mana, Integer coins){
        if (health != null) {
            this.health = health;
            if (this.health <= 0) {
                handleDeath();
            }
        }
        if (mana != null) {
            this.mana = mana;
        }
        if (coins != null) {
            this.coins = coins;
        }
    }

    public void addStats(Integer health, Integer mana, Integer coins){
        if (health != null) {
            this.health += health;
            if (this.health <= 0) {
                handleDeath();
            }
        }
        if (mana != null) {
            this.mana += mana;
        }
        if (coins != null) {
            this.coins += coins;
        }
    }

    public void minusStats(Integer health, Integer mana, Integer coins){
        if (health != null) {
            this.health -= health;
            if (this.health <= 0) {
                handleDeath();
            }
        }
        if (mana != null) {
            this.mana -= mana;
        }
        if (coins != null) {
            this.coins -= coins;
        }
    }

    public int getHealth(){
        return this.health;
    }

    public int getMana(){
        return this.mana;
    }

    public int getCoins(){
        return this.coins;
    }

    private void handleDeath(){
        System.out.println("Bros dead");
    }

    public void displayStat(){
        System.out.println("=============STATS=============");
        System.out.println("Health : "+this.getHealth());
        System.out.println("Mana : "+this.getMana());
        System.out.println("Coins : "+this.getCoins());
    }
}