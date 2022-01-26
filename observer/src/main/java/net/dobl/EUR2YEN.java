package net.dobl;

public class EUR2YEN extends WR {

    @Override
    public double umrechnen(String variante, double betrag){
        if(variante.equals("EUR2YEN")){
            
            return betrag * 131.10;
        } else if(nextWR != null){
            return nextWR.umrechnen(variante, betrag);
        }
            
        return betrag;
        
    }
}
