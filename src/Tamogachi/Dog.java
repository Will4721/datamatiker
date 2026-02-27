package Tamogachi;

public class Dog  extends tamogachi{
    public Dog(String Name, int Energy) {
        super(Name, Energy);
    }
    @Override
    public String toString(){return "you picked a Dog named\n" + getName();}
}
