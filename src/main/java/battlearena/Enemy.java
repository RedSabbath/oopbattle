package battlearena;

public class Enemy {

    private String typeOfEnemy;

    private int healthPoints;

    private int attackDamage;

    public Enemy (String typeOfEnemy, int healthPoints, int attackDamage) {
        this.typeOfEnemy = typeOfEnemy;
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
    }

    // getter for typeOfEnemy
    public String getTypeOfEnemy()  {
        return typeOfEnemy;
    }

    // setter for typeOfEnemy
    public void setTypeOfEnemy(String typeOfEnemy)    {
        this.typeOfEnemy = typeOfEnemy;
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
        System.out.println("I am a " + typeOfEnemy + " be prepared to fight!");
    }

    public void walkForward ()  {
        System.out.println(typeOfEnemy + " moves closer to you.");
    }

    public void attack ()   {
        System.out.println(typeOfEnemy + " attack for " + attackDamage + " damage.");
    }

}
