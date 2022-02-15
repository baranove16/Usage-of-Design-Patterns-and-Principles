public class Dexterity implements Attribute{

    @Override
    public String getRandomAttribute() {
        int q = rand.nextInt(5);
        if (q == 1){return "Dexterity + 1";}
        else if(q == 2){return "Dexterity + 2";}
        else if(q == 3){return "Dexterity + 3";}
        else if(q == 4){return "Dexterity + 4";}
        return "Dexterity + 5";
    }
    
}
