public class Uncommon extends ArmourDecorator{
    AttributeFactory att = new Mod();
    private String mod;

    public Uncommon(Armour armour) {
        super(armour);
    }
    public void setArmour() {
           Attribute a = att.getMod();
           mod = a.getRandomAttribute();
    }
    @Override
    public String getDescription() {
        setArmour();
        
        return mod;
    }

    
}
