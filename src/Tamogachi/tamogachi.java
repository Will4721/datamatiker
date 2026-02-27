package Tamogachi;

public abstract class tamogachi {
    private String Name;
    private int Energy;


    // Constructor
    public tamogachi(String Name, int Energy) {

        this.Name = Name;
        this.Energy = (int)((Math.random() * 100)+1);

    }

    public void setEnergy(String Name, int Energy) {

        this.Name = Name ;
        this.Energy = Energy;
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
