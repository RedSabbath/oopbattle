package battlearena;

public class Main {

    public static void main(String[] args)  {

        Zombie zombie = new Zombie(10, 1);


        System.out.println("Enemy has " + zombie.getHealthPoints() +
                " health points and can do an attack of " + zombie.getAttackDamage());

    }
}