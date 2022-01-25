package net.dobl;

public class EURO2Dollar extends WR {

    @Override
    public double umrechnen(String variante, double betrag){
        if(variante.equals("EURO2Dollar")){
            return betrag * 1.14;
        } else if(nextWR != null){
            return nextWR.umrechnen(variante, betrag);
        }
            
        return betrag;
        
    }
}
