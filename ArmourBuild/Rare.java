public class Rare extends ArmourDecorator{
    AttributeFactory att = new Mod();
    private String moda, modb;

    public Rare(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        setArmour();
        return moda+"\n"+modb;
    }

    @Override
    public void setArmour() {
        Attribute a = att.getMod();
        moda = a.getRandomAttribute();
        Attribute b = att.getMod();
        modb = b.getRandomAttribute();
        
    }
    
}
