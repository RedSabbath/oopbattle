package battlearena;

// IZombie is an interface.
// It lists methods that only Zombie-type enemies must have.
public interface IZombie {

    // This method does not have a body here.
    // Any class that implements IZombie must create this method.
    // The Zombie class decides what battleStance() actually does.
    void battleStance();

}