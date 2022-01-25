package net.dobl;


public abstract class WR implements IUmrechnen{

    public WR nextWR;
    public abstract double umrechnen(String variante, double betrag);
    public void setNextWR(WR nextWR){
        this.nextWR = nextWR;
    }

}
