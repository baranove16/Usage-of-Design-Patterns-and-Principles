import java.util.Random;

public class EnemyDrop implements ArmourFactory{
    Random rand = new Random();

    @Override
    public Armour droppedBy() {
        int i = rand.nextInt(2);
        if (i == 0){return new NormalEnemy();}
        
        return new Boss();
    }
    
}
