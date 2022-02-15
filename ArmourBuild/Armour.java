import java.util.Random;

public abstract class Armour {
    protected static String rarity;
    protected static String mod1;
    protected static String mod2;
    protected static String mod3;
    protected static String slot;
    Random rand = new Random();

    public Armour(){
    }

    public abstract String getDescription();
    public abstract void setArmour();
        //String descript = getRarityDescription() + " " + slot + ":\n";
		/**if(rarity == 3) {
			descript = descript + mod1 + "\n";
			descript = descript + mod2 + "\n";
			descript = descript + mod3 + "\n";
		}
		if(rarity == 2) {
			descript = descript + mod1 + "\n";
			descript = descript + mod2 + "\n";
		}
		if(rarity == 1) {
			descript = descript + mod1 + "\n";
		}*/
		//return descript;
    //}
    
}