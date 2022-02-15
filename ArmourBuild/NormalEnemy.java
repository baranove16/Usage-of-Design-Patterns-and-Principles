public class NormalEnemy extends Armour{
    Armour armour;
    private String rarity;

   @Override
    public void setArmour() {
        this.armour = new ArmourType(armour);
       
    }

    @Override
    public String getDescription() {
        setArmour();
        slot = armour.getDescription();
        int i = rand.nextInt(2);
        if (i == 0){rarity = "Common"; mod1 = "";}
        else
        {armour = new Uncommon(armour);
        rarity = "Uncommon";
        mod1 = armour.getDescription();}
        
        
        return rarity+" "+slot+":"+"\n"+mod1;
    }
    
}
