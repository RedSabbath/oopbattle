package battlearena.enemies.individualenemy;

import battlearena.enemies.Enemy;

// Ogre is a child class of Enemy
// It also implements the IOgre interface
// This means Ogre gets shared enemy code from Enemy
// and must include the methods required by IOgre
public class Ogre extends Enemy implements IOgre {

    // Constructor
    // Runs when a new Ogre object is created
    public Ogre(int healthPoints, int attackDamage) {

        // Calls the Enemy constructor
        // This sets health points, attack damage, and the enemy ID
        super(healthPoints, attackDamage);
    }

    // Overrides the talk method from Enemy
    // This gives Ogre its own custom message
    @Override
    public void talk() {
        System.out.println("Ogre is slamming hands all around");
    }

    // Overrides the specialAttack method from Enemy
    // Gives the Ogre a 20% chance to increase its attack damage
    @Override
    public void specialAttack() {

        // Math.random() gives a random number between 0.0 and less than 1.0
        // If the number is less than .20, the special attack works
        // This means there is a 20% chance
        boolean didSpecialAttackWork = Math.random() < .20;

        // If the special attack worked, increase attack damage by 4
        if (didSpecialAttackWork) {

            // Gets the current attack damage, adds 4, then saves it
            setAttackDamage(getAttackDamage() + 4);

            // Prints a message showing the attack increased
            System.out.println("Ogre's attack increased by 4!");
        }
    }

    // This method comes from the IOgre interface
    // Makes the Ogre stare down the opponent
    @Override
    public void stareDown() {
        System.out.println("Ogre's eyes stare down opponent and it drops down to all four limbs.");
    }
}