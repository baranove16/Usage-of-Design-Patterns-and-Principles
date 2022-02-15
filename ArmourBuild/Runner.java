public class Runner {
    public static void main(String[] args) {
        Armour armour;
        ArmourFactory enemydrop = new EnemyDrop();
        //Enemies boss = new Boss();
        armour = enemydrop.droppedBy();
        //armour.setArmour();
        //Armour armour2 = new ArmourType(armour);
        //armour2.setArmour();
        System.out.println(armour.getDescription());
    



    }
}
