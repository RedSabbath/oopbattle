package battlearena;

public class Main {

    public static void main(String[] args)  {

        Zombie zombie = new Zombie(10, 1);
        Ogre ogre = new Ogre(20,3);


        System.out.println(zombie.getId());
        System.out.println(ogre.getId());
    }
}