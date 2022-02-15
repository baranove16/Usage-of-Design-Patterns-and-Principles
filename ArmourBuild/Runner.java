public class Runner {
    public static void main(String[] args) {
        Armour armour;
        ArmourFactory enemydrop = new EnemyDrop();
        armour = enemydrop.droppedBy();
        System.out.println(armour.getDescription());
    



    }
}
