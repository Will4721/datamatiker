package Tamogachi;

public abstract class tamogachi {
    private String Name;
    private int Energy;
    int dogsleep = 4;
    int dogplay = 2;
    int catsleep = 2;
    int catplay = 1;

    // Constructor
    public tamogachi(String Name, int Energy) {

        this.Name = Name;
        this.Energy = (int)((Math.random() * 10)+1);

    }

    public void setEnergy(String Name, int Energy) {

        this.Name = Name ;
        this.Energy = Energy ;
    }
    public int Energyreduce(){
        return Energy = Energy - dogplay;
    }
    public int Energyadd(){
        return Energy = Energy + dogsleep;
    }

    public String getName(){
        return Name;
    }

    public int getEnergy(){
        return Energy;
    }

    @Override
    public String toString() {
        return "Pets name:  " + Name;
    }
}
