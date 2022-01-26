package net.dobl;

public class App 
{
    public static void main( String[] args )
    {
        WRAdapter wr = new EUR2YEN();
        //wr.setNextWR(new EURO2Dollar());

        UmrechnenDecoratorDyn asd = new UmrechnenDecoratorDyn(wr);
        System.out.println(asd.umrechnen("EUR2YEN", 100));
    }
}
