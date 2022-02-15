public class Epic extends ArmourDecorator{
    AttributeFactory att = new Mod();
    private String moda, modb, modc;

    public Epic(Armour armour) {
        super(armour);
        
    }

    @Override
    public String getDescription() {
        setArmour();
        return moda+"\n"+modb+"\n"+modc;
    }

    @Override
    public void setArmour() {
        Attribute a = att.getMod();
        moda = a.getRandomAttribute();
        Attribute b = att.getMod();
        modb = b.getRandomAttribute();
        Attribute c = att.getMod();
        modc = c.getRandomAttribute();

        
    }
    
}
