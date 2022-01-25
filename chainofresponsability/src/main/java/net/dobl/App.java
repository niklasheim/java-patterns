package net.dobl;

public class App 
{
    public static void main( String[] args )
    {
        WR wr = new EUR2YEN();
        wr.setNextWR(new EURO2Dollar());

        System.out.println(wr.umrechnen("EURO2Dollar", 22));
    }
}
