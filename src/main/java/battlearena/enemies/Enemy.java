package battlearena.enemies;

// Enemy class implements the IEnemy interface
// This means Enemy must include the methods required by IEnemy
// Child classes can extend Enemy and reuse its fields and methods
public abstract class Enemy implements IEnemy {

    // Stores the enemy's unique ID number
    private int id;

    // Stores the enemy's maximum health
    private int healthPoints;

    // Stores how much health the enemy currently has left
    private int healthPointsRemaining;

    // Stores how much damage the enemy does when attacking
    private int attackDamage;

    // Static variable shared by all Enemy objects
    // Keeps track of how many enemies have been created
    private static int numberOfEnemies;

    // Constructor
    // Runs when a new Enemy object is created
    public Enemy(int healthPoints, int attackDamage) {

        // Set the enemy's maximum health
        this.healthPoints = healthPoints;

        // Set the enemy's remaining health equal to its max health at the start
        this.healthPointsRemaining = healthPoints;

        // Set the enemy's attack damage
        this.attackDamage = attackDamage;

        // Increase the total number of enemies created by 1
        numberOfEnemies++;

        // Give this enemy a unique ID based on how many enemies exist
        this.id = numberOfEnemies;
    }

    // This method comes from the IEnemy interface
    // Default enemy does not have a special attack
    @Override
    public void specialAttack() {
        System.out.println("Enemy does not have a special attack.");
    }

    // Getter for healthPoints
    // Returns the enemy's maximum health
    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    // Getter for healthPointsRemaining
    // Returns how much health the enemy currently has left
    @Override
    public int getHealthPointsRemaining() {
        return healthPointsRemaining;
    }

    // Setter for healthPointsRemaining
    // Updates the enemy's current remaining health
    @Override
    public void setHealthPointsRemaining(int healthPointsRemaining) {
        this.healthPointsRemaining = healthPointsRemaining;
    }

    // Getter for attackDamage
    // Returns how much damage the enemy does
    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    // Setter for attackDamage
    // Updates how much damage the enemy does
    @Override
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    // Getter for id
    // Returns this enemy's unique ID number
    @Override
    public int getId() {
        return id;
    }

    // Static getter for numberOfEnemies
    // Returns the total number of Enemy objects created
    public static int getNumberOfEnemies() {
        return numberOfEnemies;
    }

    // Makes the enemy say a message before fighting
    @Override
    public void talk() {
        System.out.println("I am an enemy be prepared to fight!");
    }

    // Makes the enemy attack
    // Prints how much damage the enemy attacks for
    @Override
    public void attack() {
        System.out.println("Enemy attack for " + attackDamage + " damage.");
    }

}