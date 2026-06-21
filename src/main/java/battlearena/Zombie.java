package battlearena;

public class Zombie extends Enemy {
    public Zombie (int healthPoints, int attackDamage)  {
        super(healthPoints, attackDamage);
    }

    @Override
    public void talk()  {
        System.out.println("*Grumbling...*");
    }
    @Override
    public void specialAttack() {
        boolean didSpecialAttackWork = Math.random() <.50;
        if (didSpecialAttackWork)   {
            setHealthPointsRemaining(getHealthPoints() + 2);
            System.out.println("Zombie regenerated 2 HP!");
        }
    }

    public void spreadDisease() {
        System.out.println("The zombie is trying to spread infection");
    }
}
