package net.dobl;


public class WRAdapter implements ISammelumrechnen{

    public WR nextWR;

    public WRAdapter(WR wr) {
        this.nextWR = wr;
    }

    public double sammelumrechnen(String variante, double[] betraege){
        double sum = 0;

        for (double d : betraege) {
            sum += d;
        }

        return nextWR.umrechnen(variante, sum);
        

    }
    
    public void setNextWR(WR nextWR){
        this.nextWR = nextWR;
    }

}
