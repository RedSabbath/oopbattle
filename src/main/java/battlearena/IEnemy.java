package battlearena;

// This is an interface.
// It lists the methods that any enemy class must have.
public interface IEnemy {

    // Makes the enemy say something
    void talk();

    // Makes the enemy perform a normal attack
    void attack();

    // Returns the enemy's maximum health points
    int getHealthPoints();

    // Returns how much damage the enemy does
    int getAttackDamage();

    // Changes how much damage the enemy does
    void setAttackDamage(int attackDamage);

    // Returns how much health the enemy currently has left
    int getHealthPointsRemaining();

    // Changes the enemy's current remaining health
    void setHealthPointsRemaining(int healthPointsRemaining);

    // Makes the enemy perform a special attack
    void specialAttack();

    // Returns the enemy's unique ID number
    int getId();

}