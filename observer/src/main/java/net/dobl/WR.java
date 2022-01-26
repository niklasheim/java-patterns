package net.dobl;

import java.util.ArrayList;
import java.util.List;

public abstract class WR implements IUmrechnen {

    public WR nextWR;
    public abstract double umrechnen(String variante, double betrag);
    public void setNextWR(WR nextWR){
        this.nextWR = nextWR;
    }

    public List<IObs> channels = new ArrayList<>();

    public void addObserver(IObs channel) {
        this.channels.add(channel);
    }

    public void removeObserver(IObs channel) {
        this.channels.remove(channel);
    }

}
