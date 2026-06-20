package battlearena;

public class Enemy {

    private int healthPoints;
    private int attackDamage;

    // constructor
    public Enemy (int healthPoints, int attackDamage) {

        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
    }


    // getter for healthPoints
    public int getHealthPoints()    {
        return healthPoints;
    }

    // setter for healthPoints
    public void setHealthPoints(int healthPoints)   {
        this.healthPoints = healthPoints;
    }

    //getter for attackDamage
    public int getAttackDamage()    {
        return attackDamage;
    }

    // setter for attackDamage
    public void setAttackDamage(int attackDamage)   {
        this.attackDamage = attackDamage;
    }

    public void talk() {
        System.out.println("I am a enemy be prepared to fight!");
    }

    public void walkForward ()  {
        System.out.println("Enemy moves closer to you.");
    }

    public void attack ()   {
        System.out.println("Enemy attack for " + attackDamage + " damage.");
    }

}
