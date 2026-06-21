package battlearena;

public class Enemy {

    private int id;
    private int healthPoints;
    private int healthPointsRemaining;
    private int attackDamage;
    private static int numberOfEnemies;

    // constructor
    public Enemy (int healthPoints, int attackDamage) {

        this.healthPoints = healthPoints;
        this.healthPointsRemaining = healthPoints;
        this.attackDamage = attackDamage;
        numberOfEnemies++;
        this.id = numberOfEnemies;
    }

    public void specialAttack ()    {
        System.out.println("Enemy does not have a special attack.");
    }


    // getter for healthPoints
    public int getHealthPoints()    {
        return healthPoints;
    }

    // setter for healthPoints
    public void setHealthPoints(int healthPoints)   {
        this.healthPoints = healthPoints;
    }

    public int getHealthPointsRemaining()    {
        return healthPointsRemaining;
    }

    public void setHealthPointsRemaining(int healthPointsRemaining) {
        this.healthPointsRemaining = healthPointsRemaining;
    }

    //getter for attackDamage
    public int getAttackDamage()    {
        return attackDamage;
    }

    // setter for attackDamage
    public void setAttackDamage(int attackDamage)   {
        this.attackDamage = attackDamage;
    }


    public int getId() {
        return id;
    }

    public  static int getNumberOfEnemies() {
        return numberOfEnemies;
    }

    public void talk() {
        System.out.println("I am an enemy be prepared to fight!");
    }

    public void walkForward ()  {
        System.out.println("Enemy moves closer to you.");
    }

    public void attack ()   {
        System.out.println("Enemy attack for " + attackDamage + " damage.");
    }

}
