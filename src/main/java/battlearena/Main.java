package battlearena;

public class Main {

    public static void main(String[] args)  {

        Enemy enemy = new Enemy();

        enemy.typeOfEnemy = "Zombie";

        System.out.println(enemy.typeOfEnemy + " has " + enemy.healthPoints + " health points and can do an attack of " + enemy.attackDamage);

    }
}
