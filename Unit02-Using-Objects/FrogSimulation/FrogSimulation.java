public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops){
        this.goalDistance = dist;
        this.maxHops = numHops;
    }

    private int hopDistance() {
        int hop = 0;
        hop = (int) (Math.random()*10)+1;
        if (Math.random()<=0.9){
            hop = -hop;
        }
        return hop;
    }

    public boolean simulate(){
        // Part A
        int displacement = 0;
        for (int i = 1; i <= maxHops; i++){
            displacement += hopDistance();
            if ((displacement < 0) || (displacement >= this.goalDistance)){
                break;
            }
        }
        
        return displacement == this.goalDistance;
    }

    public double runSimulations(int num){
        int i = 0;
        int successSims = 0;

        while (i<num){
            if (simulate()){
                successSims++;
            }
            i++;
        }
        return ((double) successSims)/num;
        
    }
}
