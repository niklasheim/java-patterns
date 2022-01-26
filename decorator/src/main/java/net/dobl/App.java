package net.dobl;

public class App 
{
    public static void main( String[] args )
    {
        WR wr = new EUR2YEN();
        wr.setNextWR(new EURO2Dollar());

        IUmrechnen asd = new UmrechnenDecoratorDyn(wr);
        System.out.println(asd.umrechnen("EUR2YEN", 100));
    }
}
