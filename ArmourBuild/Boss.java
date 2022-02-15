public class Boss extends Armour{
    Armour armour;
    private String rarity;

    @Override
    public String getDescription() {
        setArmour();
        slot = armour.getDescription();
        int i = rand.nextInt(2);
        if (i == 0){armour = new Epic(armour); rarity = "Epic";}
        else {armour = new Rare(armour); rarity = "Rare";}

        mod1 = armour.getDescription();
        return rarity+" "+slot+":"+"\n"+mod1;
    }

    @Override
    public void setArmour() {
        this.armour = new ArmourType(armour);
        
    }
    
}
