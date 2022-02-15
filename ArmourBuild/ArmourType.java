public class ArmourType extends ArmourDecorator{

    public ArmourType(Armour armour) {
        super(armour);
    }
    public void setArmour(){
        int gearSlot = random.nextInt(4);
		if(gearSlot == 0) {
			slot = "Helm"; 
		}
		else if(gearSlot == 1) {
			slot = "Chest Piece";
		}
		else if(gearSlot == 2) {
			slot = "Gloves";
		}
		else if(gearSlot == 3) {
			slot = "Boots";
		}

    }

    //@Override
    public String getDescription() {
        setArmour();
        return slot;
    }
    
}
