import java.util.Random;

public class Mod implements AttributeFactory{
    Random rand = new Random();

    @Override
    public Attribute getMod() {
        int c = rand.nextInt(4);
        if (c == 1){return new Resistance();}
        if (c == 2){return new Strength(); }
        if (c == 3){return new Dexterity(); }
        return new Dexterity();
        
    }
    
}
