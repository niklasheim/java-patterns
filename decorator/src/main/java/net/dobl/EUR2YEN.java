package net.dobl;

public class EUR2YEN extends WR {

    @Override
    public boolean compareVariant(String variant){
        if(variant.equals("EUR2YEN")){
            return true;
        } else { return false; }
    }

    @Override
    public double calculate(double betrag){
        return betrag * 131.10;
    }
}