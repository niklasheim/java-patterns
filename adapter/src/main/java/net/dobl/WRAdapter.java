package net.dobl;


public abstract class WRAdapter implements ISammelumrechnen{

    public WR nextWR;

    public double sammelumrechnen(String variante, double[] betraege){
        double sum = 0;

        for (double d : betraege) {
            sum += d;
        }

        if(this.compareVariant(variante)){
            return calculate(sum);
        } else {
            return nextWR.umrechnen(variante, sum);
        }

    }
    
    public void setNextWR(WR nextWR){
        this.nextWR = nextWR;
    }

    public abstract boolean compareVariant(String variant);
    public abstract double calculate(double betrag); 

}
