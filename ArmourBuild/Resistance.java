

public class Resistance implements Attribute{
    //Random rand  = new Random();

    @Override
    public String getRandomAttribute() {
        int q = rand.nextInt(5);
        if (q == 1){return "Resistance + 1";}
        else if(q == 2){return "Reistance + 2";}
        else if(q == 3){return "Resistance + 3";}
        else if(q == 4){return "Resistance + 4";}
        return "Resistance + 5";
    }
    
}
