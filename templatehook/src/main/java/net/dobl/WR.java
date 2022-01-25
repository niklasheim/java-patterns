package net.dobl;


public abstract class WR implements IUmrechnen{

    public WR nextWR;
    public double umrechnen(String variante, double betrag){
        if(this.compareVariant(variante)){
            return calculate(betrag);
        } else {
            return nextWR.umrechnen(variante, betrag);
        }
    }
    
    public void setNextWR(WR nextWR){
        this.nextWR = nextWR;
    }

    public abstract boolean compareVariant(String variant);
    public abstract double calculate(double betrag); 

}
