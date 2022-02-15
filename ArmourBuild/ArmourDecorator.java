import java.util.Random;

public abstract class ArmourDecorator extends Armour{
    protected Armour armour;
    Random random = new Random();

    public ArmourDecorator(Armour armour){
        super();
        this.armour = armour;
    }
    
}
