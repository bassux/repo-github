public class Participant {

    String name;
    int energy;
    boolean canPass;


    Participant(String name, int energy){
        this.name = name;
        this.energy = energy;
        canPass = false;

    }


    public int getEnergy() {
        return energy;
    }

    public void setCanPass(boolean canPass) {
        this.canPass = canPass;
    }
}
