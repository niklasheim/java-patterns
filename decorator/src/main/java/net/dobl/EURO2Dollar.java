package net.dobl;

public class EURO2Dollar extends WR {

    @Override
    public boolean compareVariant(String variant){
        if(variant.equals("EURO2Dollar")){
            return true;
        } else { return false; }
    }

    @Override
    public double calculate(double betrag){
        return betrag * 1.14;
    }
}
