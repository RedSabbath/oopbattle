package battlearena;

// Zombie is a child class of Enemy
// It also implements the IZombie interface
// This means Zombie gets shared enemy code from Enemy
// and must include the methods required by IZombie
public class Zombie extends Enemy implements IZombie {

    // Constructor
    // Runs when a new Zombie object is created
    public Zombie(int healthPoints, int attackDamage) {

        // Calls the Enemy constructor
        // This sets health points, attack damage, and the enemy ID
        super(healthPoints, attackDamage);
    }

    // Overrides the talk method from Enemy
    // This gives Zombie its own custom message
    @Override
    public void talk() {
        System.out.println("*Grumbling...*");
    }

    // Overrides the specialAttack method from Enemy
    // Gives the Zombie a 50% chance to regenerate health
    @Override
    public void specialAttack() {

        // Math.random() gives a random number between 0.0 and less than 1.0
        // If the number is less than .50, the special attack works
        // This means there is a 50% chance
        boolean didSpecialAttackWork = Math.random() < .50;

        // If the special attack worked, restore health
        if (didSpecialAttackWork) {

            // Sets the Zombie's remaining health
            // This currently sets it to max health + 2
            setHealthPointsRemaining(getHealthPoints() + 2);

            // Prints a message showing the Zombie regenerated health
            System.out.println("Zombie regenerated 2 HP!");
        }
    }

    // This method comes from the IZombie interface
    // Makes the Zombie enter its battle stance
    @Override
    public void battleStance() {
        System.out.println("Zombie cracks neck and sticks arms out.");
    }
}