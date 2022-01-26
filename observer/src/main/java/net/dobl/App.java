package net.dobl;


public class App 
{
    public static void main( String[] args )
    {

        WRObserver obs = new WRObserver();

        WR wr = new EUR2YEN();
        wr.setNextWR(new EURO2Dollar());

        wr.addObserver(obs);

        String var = "EURO2Dollar";
        double betrag = 22;
        double erg = wr.umrechnen(var, betrag);
        System.out.println(erg);
        obs.update(var + ' ' + betrag + ' ' + erg);

        var = "EURO2YEN";
        betrag = 100;
        erg = wr.umrechnen(var, betrag);
        System.out.println(erg);
        obs.update(var + ' ' + betrag + ' ' + erg);

        
        System.out.println(obs.msg);
        
    }
}
