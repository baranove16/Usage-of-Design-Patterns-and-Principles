public class Strength implements Attribute{

    @Override
    public String getRandomAttribute() {
        int q = rand.nextInt(5);
        if (q == 1){return "Strength + 1";}
        else if(q == 2){return "Strength  + 2";}
        else if(q == 3){return "Strength  + 3";}
        else if(q == 4){return "Strength  + 4";}
        return "Strength  + 5";
    }
    
}
